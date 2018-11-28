package main.java;

import main.java.simplytext.TextHolderAndDisplayer;

public class MasterMethodsExecutorAndObjectCreator {
    public void executeMethodsAndCreateObjects() {
        callMethodWhichWillPrintSomeText();

    }

    private void callMethodWhichWillPrintSomeText() {
        TextHolderAndDisplayer textHolderAndDisplayer = new TextHolderAndDisplayer();
        textHolderAndDisplayer.displaySomeText();
    }
}
