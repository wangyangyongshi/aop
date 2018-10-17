package scope;

import condition.LinuxCondition;
import condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import test1.Person;

/**
 * Created by wangyang on 2018/10/17.
 */
@Configuration
public class MainConfig {

    @Bean(value = "person")//指定注入容器的bean的名字
   // @Scope(value = "prototype")   //singleton默认单实例的情况下，ioc容器启动，会调用方法创建对象放到ioc容器中
    //prototype:多实例情况下，获取的时候才会调用

    //懒加载专门针对单实例bean
    @Lazy//加上注解就是只有获取的时候加载
    public Person person(){
        return new Person("王洋",12);
    }

    /**
     * @conditioin:按照一定的条件给容器注册bean,可以放在方法上，也可以放在类上
     * 如果系统是windows系统，放入bill,如果是linux，放入linux
     */
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        return new Person("bill gates",66);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linux")
    public Person person02(){

        return new Person("linux",88);
    }
}
