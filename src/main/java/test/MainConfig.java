package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by wangyang on 2018/10/16.
 */

//通知方法：前置通知，后置通知，

//将业务逻辑组件和切面类都加入到容器中，并且告诉spring哪个是切面类aspect
//在切面类上每个通知方法上标注通知注解告诉sping,什么时候运行,
//开启基于注解的aop模式@enableAspectJAutoProxy
@EnableAspectJAutoProxy
@Configuration
public class MainConfig {


    //将业务逻辑类加入
    @Bean
    public MathCaculate calculator() {
        return new MathCaculate();
    }


    //将切面加入
    @Bean
    public LogAspects aspects() {
        return new LogAspects();
    }


}
