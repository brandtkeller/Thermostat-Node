package thermo;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // Start the REST api thread
        SpringApplication.run(Application.class, args);
        
        for (int i = 0; i < 60; i++) {
            System.out.println("Here is some other logic that I need to run");
            try {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e) {
                
            }
        }
    }
}