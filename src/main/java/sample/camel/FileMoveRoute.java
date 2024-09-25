package sample.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileMoveRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:data/input?delete=true")
                .routeId("file-move-route")
                .log("Verschiebe Datei ${file:name}")
                .to("file:data/output");
    }

}