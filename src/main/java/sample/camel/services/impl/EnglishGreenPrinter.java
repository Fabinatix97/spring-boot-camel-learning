package sample.camel.services.impl;

import org.springframework.stereotype.Service;
import sample.camel.services.GreenPrinter;

@Service
public class EnglishGreenPrinter implements GreenPrinter {
    
    @Override
    public String print() {
        return "green";
    }
}
