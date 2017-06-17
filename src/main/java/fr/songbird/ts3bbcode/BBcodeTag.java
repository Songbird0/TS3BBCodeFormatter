package fr.songbird.ts3bbcode;

import com.sun.istack.internal.NotNull;

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
     * Wraps {@code stringToWrap} with {@code beginTag}, adds tag parameters (if any)
     * then puts {@code endTag} at the end of sequence.
     * @param stringToWrap The string that will be wrapped by bbcode tags.
     * @return The wrapped sequence.
     */
    @NotNull
    public abstract String wrap(final String stringToWrap);
}
