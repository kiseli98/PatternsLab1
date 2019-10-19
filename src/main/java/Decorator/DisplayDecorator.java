package Decorator;

import Display.DisplayElement;

public abstract class DisplayDecorator implements DisplayElement {
    protected DisplayElement decoratedDisplay;

    public DisplayDecorator(DisplayElement decoratedDisplay){
        this.decoratedDisplay = decoratedDisplay;
    }

    public void display(){
        decoratedDisplay.display();
    }
}