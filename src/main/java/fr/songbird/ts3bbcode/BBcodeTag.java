package fr.songbird.ts3bbcode;

/*
Copyright 2017 Anthony Defranceschi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import static java.util.Objects.requireNonNull;

/**
 * Represents a bbcode tag.
 * <p>
 * All tags must extend BBcodeTag to inherit wrap() method.<br>
 *
 * BBcodeTag properties:
 * </p>
 * <ol>
 *   <li>{@code beginTag}, e.g. {@code [b]}, {@code [url]};</li>
 *   <li>{@code endTag}, e.g. {@code [/b]}, {@code [/url]};</li>
 *   <li>{@code tagParameter}, e.g. {@code [url=duckduckgo.com]...[/url]} (duckduckgo.com is a parameter).</li>
 * </ol>
 * All of them can be empty.
 * @author anthony
 * @version 0.1.0
 * @since 17/06/17
 */
public abstract class BBcodeTag {

    /**
     * Tag pushed at the beginning (e.g. {@code [b]}, {@code [url]}).
     */
    private final String beginTag;
    /**
     * Tag pushed at the end (e.g. {@code [/b]}, {@code [/url]}).
     */
    private final String endTag;
    /**
     * The tag parameter (if any) pushed into tag (e.g. {@code [url=duckduckgo.com]...[/url]} (duckduckgo.com is a parameter)).
     */
    private final String tagParameter;

    /**
     * Initializes the tag properties.
     * @param beginTag Tag pushed at the beginning.
     * @param endTag Tag pushed at the end.
     * @param tagParameter The tag parameter (if any) pushed into tag.
     * @exception NullPointerException If {@code beginTag} is null.
     * @exception NullPointerException If {@code endTag} is null.
     * @exception NullPointerException If {@code tagParameter} is null.
     */
    public BBcodeTag(final String beginTag, final String endTag, final String tagParameter)
    {
        requireNonNull(beginTag, "beginTag cannot be null.");
        requireNonNull(endTag, "endTag cannot be null.");
        requireNonNull(tagParameter, "tagParameter cannot be null.");
        this.beginTag = beginTag;
        this.endTag = endTag;
        this.tagParameter = tagParameter;
    }

    /**
     * Wraps {@code stringToWrap} with {@code beginTag}, adds tag parameters (if any)
     * then puts {@code endTag} at the end of sequence.
     * @param stringToWrap The string that will be wrapped by bbcode tags.
     * @return The wrapped sequence.
     */
    protected final String wrap(final String stringToWrap)
    {
        if(requireNonNull(stringToWrap, "stringToWrap cannot be null.").isEmpty())
            throw new IllegalArgumentException("stringToWrap cannot be empty.");
        return addTagParameter() + stringToWrap + getEndTag();
    }

    /**
     * Adds tag parameter.
     * <p>For instance:</p>
     * <pre>{@code
     * final String beginTag = "[color]";
     * final String tagParameter = Color.BLUE.toString();
     * final String result = new BBcodeColorTag(Color.BLUE).addTagParameter();
     * // result => [color=BLUE]}
     * </pre>
     * @return If {@code beginTag} and {@code tagParameter} aren't empty,
     * the tag with his parameter, else {@code beginTag} string.
     */
    private String addTagParameter() {
        if(!beginTag.isEmpty() && !tagParameter.isEmpty())
        {
            return beginTag.substring(0, beginTag.indexOf("]")) +
                    "=" + tagParameter + "]";
        }
        return beginTag;
    }

    /**
     * @return {@link #endTag} attribute.
     */
    private String getEndTag() {
        return endTag;
    }
}
