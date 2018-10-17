package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wangyang on 2018/10/17.
 */
public class MainTest {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Person bean = (Person) applicationContext.getBean("person");
//        System.out.println(bean);//但是不应该写配置文件


//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = applicationContext.getBean(Person.class);
//        System.out.println(person);
//
//        String [] beanName = applicationContext.getBeanNamesForType(Person.class);
//        for(String name:beanName){
//            System.out.println(name);
//        }
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String [] beanNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanNames){
            System.out.println(name);
        }

    }
}
