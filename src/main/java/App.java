import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getMessage());
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getMessage());
        boolean helloWorldEquals = bean == bean2;
        boolean catsEquals = cat1 == cat2;
        System.out.println(helloWorldEquals + " - для  HelloWorld \n" + catsEquals + " - для Cat" );

    }
}