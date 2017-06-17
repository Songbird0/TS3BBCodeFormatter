package fr.songbird.ts3bbcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author anthony
 * @since 18/06/17
 */
public class BBcodeTagTest {

    @Test
    public void addTagParameterTest()
    {
        final String result = new BBcodeColorTag(Color.BLUE).addTagParameter();
        assertThat(result, is(equalTo("[color=BLUE]")));
    }
}
