package aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.MainConfig;
import test.MathCaculate;

/**
 * Created by wangyang on 2018/10/16.
 */
public class AopTest {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        MathCaculate mathCaculate = applicationContext.getBean(MathCaculate.class);
        mathCaculate.div(1, 0);
        applicationContext.close();
    }
}
