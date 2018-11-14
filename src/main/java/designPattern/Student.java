package designPattern;

/**
 * Created by wangyang on 2018/11/13.
 */
public class Student {

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public Integer setAge() {
        System.out.println("0000000=========");
        return age;
    }

    public Integer setAgeOne() {
        System.out.println("one=============");
        return age;
    }

    public Integer setAgeTwo() {
        System.out.println("two=============");
        return age;
    }

    public Integer setAgeThree() {
        System.out.println("three=============");
        return age;
    }

    public Student(Integer age) {
        this.age = age;
    }
}
