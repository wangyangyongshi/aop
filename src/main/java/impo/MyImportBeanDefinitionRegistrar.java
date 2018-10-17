package impo;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by wangyang on 2018/10/17.
 */
public class MyImportBeanDefinitionRegistrar  implements ImportBeanDefinitionRegistrar{

    /**
     *
     * @param annotationMetadata
     * @param beanDefinitionRegistry:bean定义的注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
        beanDefinitionRegistry.registerBeanDefinition("rainBow",rootBeanDefinition);
        //自定义bean,手动注册的方法
    }

    /**
     * @import：
     *   接口importSelector
     *   接口importBeanDefinitionRegistrar:手动注册到容器中
     *
     *
     */
}
