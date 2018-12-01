package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.MainConfig;
import test.MathCaculate;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wangyang on 2018/10/16.
 */
public class AopTest {

//    @Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        MathCaculate mathCaculate = applicationContext.getBean(MathCaculate.class);
        mathCaculate.div(1, 0);
        applicationContext.close();
    }

    public static void sort(List list){
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2){
                    //大于0表示正序，小于0表示逆序
                    return -1;
                }else if(o1 > o2){
                    return 1;
                }
                return 0;
            }
        });

    }

}
