package Decorator;

import Display.DisplayElement;

public class WarningMsgDecorator extends DisplayDecorator {

    public WarningMsgDecorator(DisplayElement decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void display() {
        setWarningMessage(decoratedDisplay);
        decoratedDisplay.display();
    }

    private void setWarningMessage(DisplayElement decoratedDisplay){
        System.out.println("** STORM WARNING **");
    }
}