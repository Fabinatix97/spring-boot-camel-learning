package sample.camel.services.impl;

import sample.camel.services.GreenPrinter;

public class SpanishGreenPrinter implements GreenPrinter {
    
    @Override
    public String print() {
        return "verde";
    }
}
