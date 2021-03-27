package pl.pjatk.barkry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
}
