package scope;

import impo.Car;
import impo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangyang on 2018/10/17.
 */

/**
 * bean的生命周期：创建---初始化---销毁
 * 我们可以自定义初始化和销毁方法，容器在bean进行到当前周期的时候来调用我们自定义的初始化方法
 * 如何自定义？
 * 四种方式：1）init-method= destroy-method=
 *
 *初始化：对象创建完成，并赋值好，调用初始化方法
 * 销毁：单实例，容器关闭的时候，多实例，容器不进行销毁
 *2）接口：initializingBean disposableBean
 * 3)可以使用JSR250:@postConstruct注解，
 *                  @preDestroy
 *4)beanPostProcessor:
 * postProcessBeforeInitialization
 *
 * postProcessAfterInitialization
 *5)初始化之前和之后：
 *
 * spring注入：@primary  区别：required=false
 */
@Configuration
public class MainConfigOfLifeCycle {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car() {
        System.out.println("容器创建完成");
        return new Car();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }


}
