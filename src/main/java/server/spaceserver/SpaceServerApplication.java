package server.spaceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@SpringBootApplication
public class SpaceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpaceServerApplication.class, args);
    }

}
