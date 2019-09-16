import static org.junit.jupiter.api.Assertions.assertEquals;

import framework.StringKihonBase;
import org.w3c.dom.ls.LSOutput;

public class StringKihon extends StringKihonBase {

    @Override
    protected String convertToUpperCase(String data) {
        return data.toUpperCase();
    }

    @Override
    protected String convertToLowerCase(String data) {
        return data.toLowerCase();
    }

    @Override
    protected String Combine_Parts_Of_A_Name(String firstName, String middleName, String lastName) {
        return first + " " + middle + " " + last;
    }

    @Override
    protected String Combine_Two_Strings(String a, String {
        return a + b;




    }

    @Override
    protected void Determine_The_Length_Of_A_String(String data) {

        return data.length();
    }

    @Override
    protected String Remove_All_Leading_Whitespace(String data) {

        return data.trim();
    }


    @Override
    protected String Remove_All_Trailing_Whitespace(String data) {

        return data.trim();
    }

    @Override
    protected String[] Split_A_String_Into_An_Array(String input, char divider) {

        return input.split(String.valueOfdivider)
    }

    @Override
    protected String Join_An_Array_Into_A_String(String[] input, String divider) {

        return
    }

    @Override
    protected boolean returnTrueIfAContainsB(String a, String b) {
        returnTrueIfAContainsB();
    }

    @Override
    protected int determineThePositionOfAInB(String a, String b) {

        throw new UnsupportedOperationException();
    }

    @Override
    protected boolean returnTrueIfAStartsWithB(String a, String b) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected boolean returnTrueIsAEndsWithB(String a, String b) {

        return a.
    }

    @Override
    protected String returnTheFourthThroughSeventhCharactersOfInput(String input) {
        input.substring(4,7);
    }
}