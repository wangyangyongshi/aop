package aop;

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



}
