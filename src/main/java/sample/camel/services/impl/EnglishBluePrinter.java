package sample.camel.services.impl;

import org.springframework.stereotype.Service;
import sample.camel.services.BluePrinter;

@Service
public class EnglishBluePrinter implements BluePrinter {
    
    @Override
    public String print() {
        return "blue";
    }
}