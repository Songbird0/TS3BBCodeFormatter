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

/**
 * @author anthony
 * @since 18/06/17
 */
public class BBcodeTagTest {
    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void emptyParameter()
    {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("stringToWrap cannot be empty.");
        final BBcodeTag tag = new BBcodeBoldTag();
        final String textMessageContent = tag.wrap(""); // must be crashed
    }

    @Test
    public void nullParameter()
    {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("stringToWrap cannot be null.");
        final BBcodeTag tag = new BBcodeItalicTag();
        final String textMessageContent = tag.wrap(null); // must be crashed
    }
}
