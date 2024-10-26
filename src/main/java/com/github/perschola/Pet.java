package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Pet {
    private String name="";
    private Integer age = -1;
    public Pet() {
    }

    public Pet(String name, Integer age) {
        this.name =name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
