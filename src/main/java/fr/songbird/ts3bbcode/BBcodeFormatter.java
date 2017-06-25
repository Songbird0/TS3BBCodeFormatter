package fr.songbird.ts3bbcode;

/**
 * Formats your string with compatible TeamSpeak bbcode tags.
 * @author anthony
 * @since 16/06/17
 */
public class BBcodeFormatter {

    /**
     * Initializes the formatter, appends a string and wraps it.
     * <p>{@code bbcodeTags} as in will be used to format your string.</p>
     * @param s Your string.
     * @param bbcodeTags BBcode tags with which you want to format your string.
     */
    public BBcodeFormatter(String s, BBcodeTag... bbcodeTags) {
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
        return null;
    }

    @Override
    public String toString()
    {
        return null;
    }
}
