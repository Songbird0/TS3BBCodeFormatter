package fr.songbird.ts3bbcode;

/**
 * Represents a bbcode tag.
 * <p>
 * All tags must extend BBcodeTag to inherit wrap() method.<br>
 *
 * BBcodeTag properties:
 * </p>
 * <ol>
 *   <li>{@code beginTag}, e.g. {@code [b]}, {@code [url]};</li>
 *   <li>{@code endTag}, e.g. {@code [b]}, {@code [url]};</li>
 *   <li>{@code tagParameter}, e.g. {@code [url=duckduckgo.com]...[/url]} (duckduckgo.com is a parameter).</li>
 * </ol>
 * All of them can be empty.
 * @author anthony
 * @version 0.1.0
 * @since 17/06/17
 */
public abstract class BBcodeTag {

    private final String beginTag;
    private final String endTag;
    private final String tagParameter;
    /**
     * Wraps {@code stringToWrap} with {@code beginTag}, adds tag parameters (if any)
     * then puts {@code endTag} at the end of sequence.
     * @param stringToWrap The string that will be wrapped by bbcode tags.
     * @return The wrapped sequence.
     */
    public abstract String wrap(final String stringToWrap);
}
