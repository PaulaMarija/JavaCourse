package main.java.simplytext;

import static main.java.printer.Printer.printTextLine;

public class TextHolderAndDisplayer {
    public void displaySomeText() {
        String firstStringVariable = "sfdgbrf";
        String textValueFromOtherMethod = getSomeText();
        printTextLine("wwww");
        printTextLine(firstStringVariable);
        printTextLine(textValueFromOtherMethod);

        char oneChar = 'A';

        printTextLine(oneChar);
    }

    private static String getSomeText() {
        return "So far good";
    }
}
