package fr.songbird.ts3bbcode;

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
    public void enumeration()
    {
        final Color red = Color.RED;
        final Color green = Color.GREEN;
        final Color blue = Color.BLUE;
        final Color yellow = Color.YELLOW;
        final Color orange = Color.ORANGE;
        final Color grey = Color.GREY;
        final Color purple = Color.PURPLE;
        final Color brown = Color.BROWN;
        final Color beige = Color.BEIGE;
        final Color cyan = Color.CYAN;
        final Color navy = Color.NAVY;
    }

    @Test
    public void colorRepresentation()
    {
        final Color red = Color.RED;
        final Color green = Color.GREEN;
        final Color blue = Color.BLUE;
        final Color yellow = Color.YELLOW;
        final Color orange = Color.ORANGE;
        final Color grey = Color.GREY;
        final Color purple = Color.PURPLE;
        final Color brown = Color.BROWN;
        final Color beige = Color.BEIGE;
        final Color cyan = Color.CYAN;
        final Color navy = Color.NAVY;
        assertThat(red.toString(), is(equalTo("RED")));
        assertThat(green.toString(), is(equalTo("GREEN")));
        assertThat(blue.toString(), is(equalTo("BLUE")));
        assertThat(yellow.toString(), is(equalTo("YELLOW")));
        assertThat(orange.toString(), is(equalTo("ORANGE")));
        assertThat(grey.toString(), is(equalTo("GREY")));
        assertThat(purple.toString(), is(equalTo("PURPLE")));
        assertThat(brown.toString(), is(equalTo("BROWN")));
        assertThat(beige.toString(), is(equalTo("BEIGE")));
        assertThat(cyan.toString(), is(equalTo("CYAN")));
        assertThat(navy.toString(), is(equalTo("NAVY")));
    }
}
