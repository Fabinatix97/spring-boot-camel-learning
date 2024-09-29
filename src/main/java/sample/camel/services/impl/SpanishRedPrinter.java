package sample.camel.services.impl;

import sample.camel.services.RedPrinter;

public class SpanishRedPrinter implements RedPrinter {
    
    @Override
    public String print() {
        return "rojo";
    }

}