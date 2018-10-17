package scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wangyang on 2018/10/17.
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Object bean = applicationContext.getBean("person");
        Object beans = applicationContext.getBean("person");
        System.out.println(bean == beans);

    }
}
