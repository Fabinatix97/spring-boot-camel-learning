package sample.camel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;
import sample.camel.config.PizzaConfig;

@SpringBootApplication
@Log
public class PizzaApplication implements CommandLineRunner {
    
    private PizzaConfig pizzaConfig;

    public PizzaApplication(PizzaConfig pizzaConfig) {
        this.pizzaConfig = pizzaConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(PizzaApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        log.info(
            String.format("I want a %s crust pizza, with %s and %s sauce",
            pizzaConfig.getCrust(),
            pizzaConfig.getTopping(),
            pizzaConfig.getSauce()
            ));
    }
}