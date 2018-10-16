package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by wangyang on 2018/10/16.
 */

//通知方法：前置通知，后置通知，
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
