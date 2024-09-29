package sample.camel.services.impl;

import org.springframework.stereotype.Component;

import sample.camel.services.BluePrinter;
import sample.camel.services.ColourPrinter;
import sample.camel.services.GreenPrinter;
import sample.camel.services.RedPrinter;

@Component
public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(
            ", ",
            redPrinter.print(),
            bluePrinter.print(),
            greenPrinter.print()
        );
    }
}
