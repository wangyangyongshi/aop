package scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import test1.Person;

/**
 * Created by wangyang on 2018/10/17.
 */
@Configuration
public class MainConfig {

    @Bean(value = "person")//指定注入容器的bean的名字
    @Scope(value = "prototype")   //singleton默认单实例的情况下，ioc容器启动，会调用方法创建对象放到ioc容器中
    //prototype:多实例情况下，获取的时候才会调用
    public Person person(){
        return new Person("王洋",12);
    }

}
