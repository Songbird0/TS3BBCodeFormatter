package fr.songbird.ts3bbcode;

/**
 * @author anthony
 * @version 0.1.0
 * @since 17/06/17
 */
public abstract class BBcodeTag {
    /**
     * Wraps {@code stringToWrap} with {@code beginTag}, adds tag parameters (if any)
     * then puts {@code endTag} at the end of sequence.
     * @param stringToWrap The string that will be wrapped by bbcode tags.
     * @return The wrapped sequence.
     */
    public abstract String wrap(final String stringToWrap);
}
