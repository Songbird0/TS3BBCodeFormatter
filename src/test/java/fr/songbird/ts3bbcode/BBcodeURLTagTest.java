package fr.songbird.ts3bbcode;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.net.MalformedURLException;

/**
 * @author anthony
 * @since 24/06/17
 */
public class BBcodeURLTagTest {
    @Rule
    private final ExpectedException expectedException = ExpectedException.none();

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
    public void constructorTest3()
    {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("URL string reference cannot be null.");
        final BBcodeTag urlTag = new BBcodeURLTag(null);
    }
    @Test
    public void constructorTest4()
    {
        final BBcodeTag urlTag = new BBcodeURLTag("https://duckduckgo.com", true);
    }
    @Test
    public void constructorTest5()
    {
        expectedException.expect(MalformedURLException.class);
        expectedException.expectMessage("no protocol: duckduckgo.com");
        final BBcodeTag urlTag = new BBcodeURLTag("duckduckgo.com", true);
    }
}
