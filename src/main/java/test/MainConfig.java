package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by wangyang on 2018/10/16.
 */


//将业务逻辑组件和切面类都加入到容器中，并且告诉spring哪个是切面类aspect
//在切面类上每个通知方法上标注通知注解告诉sping,什么时候运行,
//开启基于注解的aop模式@enableAspectJAutoProxy

//@EnableAspectJAutoProxy是什么？
//@import(AspectJAutoProxyRegistrar.class),给容器中导入AspectJAutoProxyRegistrar,给容器中注册bean，internalAutoProxyCreator

//最终给容器注册了一个AnnotationAwareAspectJAutoProxyCreator组件
//--》AspectJAwareAdvisorAutoProxyCreator
//-->implements SmartInstantiationAwareBeanPostProcessor,BeanFactoryAware


/**
 * aop原理：给容器中注册了什么组件，组件什么时候工作，功能是什么？
 * aop实现原理：1、创建applicationContext对象
 * 2、
 * 3、registerBeanPostProcessors(beanFactory);注册bean的后置处理器来方便拦截bean的创建；
 * 1）先获取ioc容器已经定义了的需要创建对象的 所有beanPostProcessor
 * 2)给容器中加别的beanPostProcessor
 * 3)优先注册实现了PriorityOrdered接口的beanPostProcessor
 * 4)再给容器中注册实现了Ordered接口的beanPostProcessor
 * 5)注册没实现优先级接口的beanPostProcessor
 * 6)注册beanPostProcessor,实际上就是创建beanPostProcessor对象，放到容器中
 */

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
