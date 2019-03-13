package com.jl.io.serializable;

import java.io.Serializable;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/13 10:56
 * @Version 1.0
 */
public class Person implements Serializable {

//    private static final long serialVersionUID = -4013246037453415378L;
    private String name;
    transient private int age;
    private String sex;
    private String address;

    public Person(String name, String sex, String address) {
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}
