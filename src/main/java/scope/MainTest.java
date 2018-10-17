package scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wangyang on 2018/10/17.
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Object bean = applicationContext.getBean("person");
//        Object beans = applicationContext.getBean("person");
//        System.out.println(bean == beans);

//        String [] beanNames = applicationContext.getBeanNamesForType(Person.class);
//        for(String bean:beanNames){
//            System.out.println(bean);
//        }
//
//        Map<String,Person> persons = applicationContext.getBeansOfType(Person.class);
//        System.out.println(persons);
//        ConfigurableEnvironment enviroment = applicationContext.getEnvironment();
//        String property = enviroment.getProperty("os.name");
//        System.out.println(property);
        String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
        for (String bean : beanNamesForType) {
            System.out.println(bean);
        }
//        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
//        System.out.println("类型是："+colorFactoryBean.getClass());
//
//        Object bean = applicationContext.getBean("&colorFactoryBean");
//        System.out.println(bean.getClass());
        applicationContext.close();
    }
}
