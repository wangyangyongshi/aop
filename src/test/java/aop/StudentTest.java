package aop;

import com.alibaba.fastjson.JSON;
import designPattern.Student;
import org.junit.Test;

import java.util.Objects;


/**
 * Created by wangyang on 2018/11/13.
 */
public class StudentTest {

    @Test
    public void getAge() {
        Student student = new Student(3);
        if (Objects.equals(student.getAge(), 0)) {
            student.setAge();
        } else if (Objects.equals(student.getAge(), 1)) {
            student.setAgeOne();
        } else if (Objects.equals(student.getAge(), 2)) {
            student.setAgeTwo();
        } else if (Objects.equals(student.getAge(), 3)) {
            student.setAgeThree();
        }
    }

    public static void main(String[] args) {
        String rebuild = "{\"id\":\"55784\",\"oldClassId\":\"6928\",\"newClassId\":\"7109\",\"isMail\":0,\"oneRmbRebuild\":\"1\",\"applyStatus\":\"4\",\"approveView\":\"\"}";
        ClassRebuild classRebuild = JSON.parseObject(rebuild, ClassRebuild.class);
        System.out.println(classRebuild.getOldClassId());
    }


}
