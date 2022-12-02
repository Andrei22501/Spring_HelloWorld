import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(secondBean.getMessage());
        System.out.println(bean == secondBean);
        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getName());
        Cat cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getName());
        System.out.println(cat1 == cat2);
    }

}