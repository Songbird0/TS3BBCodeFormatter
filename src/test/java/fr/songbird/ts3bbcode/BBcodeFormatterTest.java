package fr.songbird.ts3bbcode;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author anthony
 * @since 16/06/17
 */
public class BBcodeFormatterTest {
    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void constructorTest1()
    {
        final BBcodeFormatter formatter = new BBcodeFormatter("Simple buffered string. No bbcode here.");
    }
    @Test
    public void constructorTest2()
    {
        final BBcodeFormatter formatter =
                new BBcodeFormatter("Stylish buffered bbcode string.",
                        new BBcodeColorTag(Color.PURPLE),
                        new BBcodeItalicTag(),
                        new BBcodeBoldTag(),
                        new BBcodeUnderlineTag());
    }
    @Test
    public void textFormattingTest1()
    {
        final BBcodeFormatter formatter = new BBcodeFormatter("Simple buffered string. No bbcode here.");
        formatter.appendCarriageReturn()
                .append("red text message.", new BBcodeColorTag(Color.RED))
                .appendCarriageReturn()
                .append("bold green message.", new BBcodeColorTag(Color.GREEN), new BBcodeBoldTag());
        final String textMessageContent = formatter.toString();
        assertThat(textMessageContent, equalTo("Simple buffered string. No bbcode here.\n" +
                "[color=RED]red text message.[/color]\n" +
                "[color=GREEN][b]bold green message.[/b][/color]"));
    }
    @Test
    public void textFormattingTest2()
    {
        final BBcodeFormatter formatter = new BBcodeFormatter()
                .append("raw text message")
                .append(".");
        final String textMessageContent = formatter.toBBcodeString();
        assertThat(textMessageContent, equalTo("raw text message."));
    }
    @Test
    public void textFormattingTest3()
    {
        final BBcodeFormatter formatter =
                new BBcodeFormatter("Stylish buffered bbcode string.",
                        new BBcodeColorTag(Color.PURPLE),
                        new BBcodeItalicTag(),
                        new BBcodeBoldTag(),
                        new BBcodeUnderlineTag());
        final String textMessageContent = formatter.toBBcodeString();
        assertThat(textMessageContent, equalTo("[color=PURPLE][i][b][u]Stylish buffered bbcode string.[/u][/b][/i][/color]"));
    }
}
