package fr.songbird.ts3bbcode;

/**
 * @author anthony
 * @since 24/06/17
 */
public class BBcodeURLTag extends BBcodeTag {
    /**
     * Wraps your text message with {@code [url][/url]} bbcode tags
     * and puts {@code urlString} as URL.<br>
     * For example:
     * <pre>{@code
     * final BBcodeTag url = new BBcodeURLTag("duckduckgo.com", false);
     * final String yourBBcodeTextMessage = url.wrap("Click here!");
     * System.out.println(yourBBcodeTextMessage); // prints [url=duckduckgo.com]Click here![/url]}</pre>
     * @param urlString The URL to submit as bbcode tag parameter.
     * @param urlValidityChecking Bind this at {@code true} if you want an URL form checking, {@code false} otherwise.<br>
     *                            For instance:<pre>{@code
     * // Here, a MalformedURLException will be thrown.
     * final BBcodeTag url = new BBcodeURLTag("duckduckgo.com", true);
     * // If you don't want this feature, bind to {@code false}
     * // final BBcodeTag url = new BBcodeURLTag("duckduckgo.com", false);
     * final String yourBBcodeTextMessage = url.wrap("Click here!");
     * System.out.println(yourBBcodeTextMessage); // prints [url=duckduckgo.com]Click here![/url]}</pre>
     * Also, url validity checking feature may be disabled by using {@code BBcodeURLTag} overload.
     * @see #BBcodeURLTag(String)
     */
    public BBcodeURLTag(final String urlString, final boolean urlValidityChecking) {
        super("[url]", "[/url]", urlString);
    }

    /**
     * Wraps your text message with {@code [url][/url]} bbcode tags
     * and puts {@code urlString} as URL.
     * <p>Additionally, this overload disable url validity checking.</p>
     * @param urlString The URL to submit as bbcode tag parameter.
     * @see #BBcodeURLTag(String, boolean) Click here for more examples.
     */
    public BBcodeURLTag(final String urlString)
    {
        this(urlString, false);
    }
}
