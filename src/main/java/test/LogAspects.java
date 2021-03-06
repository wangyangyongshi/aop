package test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * Created by wangyang on 2018/10/16.
 */

////通知方法：前置通知，后置通知，返回通知，异常通知，环绕通知
@Aspect
public class LogAspects {

    //抽取公共的表达式，如果是外部的类
    @Pointcut("execution(public int test.MathCaculate.div(int,int))")
    public void pointCut() {
    }

    //目标方法运行之前运行(指定在哪个方法切入)
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("除法运行*************,方法名称是：" + joinPoint.getSignature().getName() + ",方法参数是：" + Arrays.asList(args));
    }

    //无论正常结束还是异常结束
    @After("pointCut()")
    public void logEnd() {
        System.out.println("除法结束*************");
    }

    //joinpoint如果是参数，一定要放在参数的第一个位置，也就是作为第一个参数
    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println("除法返回*************");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法异常*************,异常为：" + exception.toString());
    }
}
