package pl.pjatk.barkry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Component
public class MyThirdComponent {
    public MyThirdComponent(ApplicationContext applicationContext) {
        MySecondComponent mySecondComponent = (MySecondComponent) applicationContext.getBean("mySecondComponent");
        MyFirstComponent myFirstComponent = (MyFirstComponent) applicationContext.getBean("myFirstComponent");
        mySecondComponent.helloMethod();
        myFirstComponent.helloMethod();

    }
}