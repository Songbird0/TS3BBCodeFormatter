package fr.songbird.ts3bbcode;

/*
Copyright 2017 Anthony Defranceschi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author anthony
 * @since 17/06/17
 */
public class BBcodeColorTagTest {

    @Test
    public void constructorTest1()
    {
        final BBcodeTag colorTag = new BBcodeColorTag(0xFF0000);
    }

    @Test
    public void constructorTest2()
    {
        final BBcodeTag colorTag = new BBcodeColorTag(Color.RED);
    }

    @Test
    public void wrapMethodTest1()
    {
        final BBcodeTag colorTag = new BBcodeColorTag(Color.BEIGE);
        final String s = colorTag.wrap("My awesome text message!");
        assertThat(s, is(equalTo("[color=BEIGE]My awesome text message![/color]")));
    }

    @Test
    public void wrapMethodTest2()
    {
        final BBcodeColorTag colorTag = new BBcodeColorTag(Color.BLUE);
        final String s = colorTag.wrap("My awesome text message!");
        assertThat(s, equalTo("[color=BLUE]My awesome text message![/color]"));
    }
}
