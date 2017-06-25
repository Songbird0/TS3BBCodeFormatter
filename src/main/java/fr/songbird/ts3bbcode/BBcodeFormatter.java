package fr.songbird.ts3bbcode;

import java.util.Objects;

/**
 * Formats your string with compatible TeamSpeak bbcode tags.
 * @author anthony
 * @since 16/06/17
 */
public class BBcodeFormatter {

    private StringBuilder builder = null;

    /**
     * Initializes the formatter, appends a string and wraps it.
     * <p>{@code bbcodeTags} as in will be used to format your string.</p>
     * @param s Your string.
     * @param bbcodeTags BBcode tags with which you want to format your string.
     * @exception NullPointerException If your string is null.
     * @exception NullPointerException If your bbcode tags list is null.
     * @exception IllegalArgumentException If your string is empty.
     * @exception IllegalArgumentException If your bbcode tags list is empty.
     */
    public BBcodeFormatter(String s, BBcodeTag... bbcodeTags) {
        Objects.requireNonNull(s, "The string cannot be null.\n" +
                "Please use the BBcodeFormatter() constructor instead.");
        Objects.requireNonNull(bbcodeTags, "Your bbcode tags list cannot be null.\n" +
                "Please use the BBcodeFormatter(String) constructor instead.");
        if(s.isEmpty())
            throw new IllegalArgumentException("The string cannot be empty.\n" +
                    "Please use the BBcodeFormatter() constructor instead.");
        if(bbcodeTags.length == 0)
            throw new IllegalArgumentException("Your bbcode tags list cannot be empty.\n" +
                    "Please use the BBcodeFormatter(String) constructor instead.");
        this.builder = new StringBuilder();
        String content = null;
        for(int accumulator = 0; accumulator < bbcodeTags.length; accumulator += 1)
        {
            if(accumulator == 0)
            {
                content = bbcodeTags[0].wrap(s);
                continue;
            }
            final String lastContentVersion = content;
            content = bbcodeTags[accumulator].wrap(lastContentVersion);
        }
        builder.append(content);
    }

    /**
     * Initializes the formatter and appends a string.
     * @param s Your string.
     */
    public BBcodeFormatter(final String s) {

    }

    /**
     * Initializes the formatter.
     */
    public BBcodeFormatter() {

    }

    /**
     * Puts a carriage return in your string.
     * @return Formatter instance.
     */
    public BBcodeFormatter appendCarriageReturn() {
        return null;
    }

    /**
     * Puts your string into buffer and formats it.
     * @param s Your string.
     * @param bbcodeTags Your bbcode tags list.
     */
    public BBcodeFormatter append(String s, BBcodeTag... bbcodeTags) {
        return null;
    }

    /**
     * Puts your string into buffer and formats it.
     * @param s Your string.
     * @param bbcodeTag Your bbcode tag.
     * @return Formatter instance.
     */
    public BBcodeFormatter append(String s, BBcodeTag bbcodeTag) {
        return null;
    }

    /**
     * Puts your string into buffer, no style applied.
     * @param s Your string.
     * @return Formatter instance.
     */
    public BBcodeFormatter append(String s) {
        return null;
    }

    /**
     * @return Your text message wrapped, formatted.
     */
    public String toBBcodeString() {
        return builder.toString();
    }

    @Override
    public String toString()
    {
        return builder.toString();
    }
}
