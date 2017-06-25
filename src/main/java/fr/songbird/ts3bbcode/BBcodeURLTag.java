package fr.songbird.ts3bbcode;

/*
Copyright 2017 Anthony Defranceschi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import java.net.URL;
import java.util.Objects;

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
     * final BBcodeTag url = new BBcodeURLTag("duckduckgo.com");
     * final String yourBBcodeTextMessage = url.wrap("Click here!");
     * System.out.println(yourBBcodeTextMessage); // prints [url=duckduckgo.com]Click here![/url]}</pre>
     * @param urlString The URL to submit as bbcode tag parameter..
     * @see #BBcodeURLTag(String)
     */
    public BBcodeURLTag(final String urlString) {
        super("[url]", "[/url]", urlSanitizing(urlString));
    }

    private static String urlSanitizing(final String urlString) {
        if(Objects.requireNonNull(urlString, "URL string reference cannot be null.")
                .isEmpty())
        {
            throw new IllegalArgumentException("URL string cannot be empty.");
        }
        return urlString;
    }

    /**
     * Wraps your text message with {@code [url][/url]} bbcode tags
     * and puts {@code urlString} as URL.
     * @param url The URL to submit as bbcode tag parameter.
     */
    public BBcodeURLTag(final URL url)
    {
        this(url.toString());
    }
}
