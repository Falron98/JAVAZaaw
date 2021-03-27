package pl.pjatk.barkry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import java.util.List;

//@Component
public class MySecondComponent {
    public MySecondComponent(POJO pojo,
                             List<String> defaultdata,
                             POJO pojo2,
                             @Value("${my.custom.property}") String mymessage,
                             @Value("${my.radom.property: default radom}") String radom
    ){
        System.out.println("Hello from MySecondComponent");
        pojo.soutMe();
        System.out.println(defaultdata);
        pojo2.soutMe();
        System.out.println(mymessage);
        System.out.println(radom);
    }

    public void helloMethod(){
        System.out.println("Hello from MySecondComponent.helloMethod");
    }
}