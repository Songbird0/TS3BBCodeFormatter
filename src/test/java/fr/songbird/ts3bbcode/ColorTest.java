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
public class ColorTest {

    @Test
    public void redColorRepresentation()
    {
        final Color red = Color.RED;
        assertThat(red.toString(), is(equalTo("RED")));
    }
    @Test
    public void greenColorRepresentation()
    {
        final Color green = Color.GREEN;
        assertThat(green.toString(), is(equalTo("GREEN")));
    }
    @Test
    public void blueColorRepresentation()
    {
        final Color blue = Color.BLUE;
        assertThat(blue.toString(), is(equalTo("BLUE")));
    }
    @Test
    public void yellowColorRepresentation()
    {
        final Color yellow = Color.YELLOW;
        assertThat(yellow.toString(), is(equalTo("YELLOW")));
    }
    @Test
    public void orangeColorRepresentation()
    {
        final Color orange = Color.ORANGE;
        assertThat(orange.toString(), is(equalTo("ORANGE")));
    }
    @Test
    public void greyColorRepresentation()
    {
        final Color grey = Color.GREY;
        assertThat(grey.toString(), is(equalTo("GREY")));
    }
    @Test
    public void purpleColorRepresentation()
    {
        final Color purple = Color.PURPLE;
        assertThat(purple.toString(), is(equalTo("PURPLE")));
    }
    @Test
    public void brownColorRepresentation()
    {
        final Color brown = Color.BROWN;
        assertThat(brown.toString(), is(equalTo("BROWN")));
    }
    @Test
    public void beigeColorRepresentation()
    {
        final Color beige = Color.BEIGE;
        assertThat(beige.toString(), is(equalTo("BEIGE")));
    }
    @Test
    public void cyanColorRepresentation()
    {
        final Color cyan = Color.CYAN;
        assertThat(cyan.toString(), is(equalTo("CYAN")));
    }
    @Test
    public void navyColorRepresentation()
    {
        final Color navy = Color.NAVY;
        assertThat(navy.toString(), is(equalTo("NAVY")));
    }
}
