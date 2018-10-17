package impo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by wangyang on 2018/10/17.
 */
public class Dog {

    public Dog(){
        System.out.println("构造方法----------------");
    }

    @PostConstruct
    public void init(){
        System.out.println("===================");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("+++++++++++++++++++");
    }

}
