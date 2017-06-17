package fr.songbird.ts3bbcode;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

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
    @NotNull
    private final String beginTag;
    /**
     * Tag pushed at the end (e.g. {@code [/b]}, {@code [/url]}).
     */
    @NotNull
    private final String endTag;
    /**
     * The tag parameter (if any) pushed into tag (e.g. {@code [url=duckduckgo.com]...[/url]} (duckduckgo.com is a parameter)).
     */
    @NotNull
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
        Objects.requireNonNull(beginTag, "beginTag cannot be null.");
        Objects.requireNonNull(endTag, "endTag cannot be null.");
        Objects.requireNonNull(tagParameter, "tagParameter cannot be null.");
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
    @NotNull
    public abstract String wrap(final String stringToWrap);

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
    @NotNull
    protected String addTagParameter() {
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
    protected String getEndTag() {
        return endTag;
    }
}
