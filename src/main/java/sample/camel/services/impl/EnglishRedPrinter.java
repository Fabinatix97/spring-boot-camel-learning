package sample.camel.services.impl;

import org.springframework.stereotype.Service;
import sample.camel.services.RedPrinter;

@Service
public class EnglishRedPrinter implements RedPrinter {
    
    @Override
    public String print() {
        return "red";
    }
}
