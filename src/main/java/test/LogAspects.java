package test;

import org.aspectj.lang.annotation.*;

/**
 * Created by wangyang on 2018/10/16.
 */
@Aspect
public class LogAspects {

    //抽取公共的表达式，如果是外部的类
    @Pointcut("execution(public int test.MathCaculate.div(int,int))")
    public void pointCut(){
    }

    //目标方法运行之前运行(指定在哪个方法切入)
    @Before("pointCut()")
    public void logStart() {
        System.out.println("除法运行*************");
    }

    //无论正常结束还是异常结束
    @After("pointCut()")
    public void logEnd() {
        System.out.println("除法结束*************");
    }

    @AfterReturning("pointCut()")
    public void logReturn() {
        System.out.println("除法返回*************");
    }

    @AfterThrowing("pointCut()")
    public void logException() {
        System.out.println("除法异常*************");
    }
}
