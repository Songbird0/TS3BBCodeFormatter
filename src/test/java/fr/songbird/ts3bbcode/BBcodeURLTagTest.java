package fr.songbird.ts3bbcode;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.net.MalformedURLException;
import java.net.URL;

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
}
