package pl.pjatk.barkry;

import org.springframework.context.ApplicationContext;

public class MyFirstComponent {
    public MyFirstComponent(ApplicationContext applicationContext) {
        System.out.println("Hello from MyFirstComponent");
        MySecondComponent mySecondComponent = (MySecondComponent) applicationContext.getBean("mySecondComponent");
        System.out.println(applicationContext.getDisplayName());
        mySecondComponent.helloMethod();
    }
    public void helloMethod() {
        System.out.println("Hello from MyFirstComponent.helloMethod");
    }


}