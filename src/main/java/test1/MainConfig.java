package test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Created by wangyang on 2018/10/17.
 */
@Configuration
//excludeFilters = {
//@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//
//},
@ComponentScan(value = "mvc,test1",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})},useDefaultFilters = false)
public class MainConfig {

    @Bean(value = "xxx")//指定注入容器的bean的名字
    public Person person(){
        return new Person("王洋",12);
    }

}
