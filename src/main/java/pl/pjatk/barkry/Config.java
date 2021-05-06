package pl.pjatk.barkry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Configuration
public class Config {
    @Bean
    public POJO pojo(POJO pojo2){
        System.out.println("Hello from pojo");
        pojo2.setMessage("Message changed");
        return new POJO("Nice", "weather");
    }

    @Bean POJO pojo2(){
        return new POJO("Windy", "weather");
    }

    @Bean
    public List<String> defaultData(){
        System.out.println("Hello from defaultdata");
        return List.of("1", "2", "3", "4", "5");
    }

    @Bean
    @ConditionalOnProperty(prefix = "my", name = "default", havingValue = "true")
    public boolean homework(){
        return true;
    }

}
