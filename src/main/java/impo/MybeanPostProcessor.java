package impo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by wangyang on 2018/10/17.
 */
public class MybeanPostProcessor implements BeanPostProcessor{


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization====="+beanName+"====bean:"+bean);
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("houle");
        return bean;

    }
}
