package fr.songbird.ts3bbcode;

/*
Copyright 2017 Anthony Defranceschi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author anthony
 * @since 24/06/17
 */
public class BBcodeURLTagTest {
    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void constructorTest1()
    {
        final BBcodeTag urlTag = new BBcodeURLTag("duckduckgo.com");
    }
    @Test
    public void constructorTest2()
    {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("URL string cannot be empty.");
        final BBcodeTag urlTag = new BBcodeURLTag("");
    }
    @Test
    public void constructorTest3() throws MalformedURLException
    {
        expectedException.expect(MalformedURLException.class);
        expectedException.expectMessage("no protocol: duckduckgo.com");
        final BBcodeTag urlTag = new BBcodeURLTag(new URL("duckduckgo.com"));

    }
    @Test
    public void wrapMethodTest()
    {
        final BBcodeTag urlTag = new BBcodeURLTag("duckduckgo.com");
        final String textMessageContent = urlTag.wrap("Here's my favorite web browser, click here ! :D");
        assertThat(textMessageContent, equalTo("[url=duckduckgo.com]Here's my favorite web browser, click here ! :D[/url]"));
    }
}
