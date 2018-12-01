package aop;

import designPattern.Student;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangyang on 2018/11/13.
 */
public class StudentChong {

    private static Map methodMap = new HashMap<>();

    static {
        methodMap.put(0, "setAge");
        methodMap.put(1, "setAgeOne");
        methodMap.put(2, "setAgeTwo");
        methodMap.put(3, "setAgeThree");

    }

    @Test
    public void getAge() {
        Student student = new Student(2);
        String name = (String) methodMap.get(student.getAge());
        try {
//          Method method = Student.class.getMethod(name);//第一种创建对象的方式
//            Method method = Class.forName("designPattern.Student").getMethod(name);//反射创建对象的 第二种方式
            Method method = student.getClass().getMethod(name);//反射创建对象的 第三种方式
            method.invoke(student);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
