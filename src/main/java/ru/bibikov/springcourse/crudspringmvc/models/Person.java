package ru.bibikov.springcourse.crudspringmvc.models;

public class Person {
    private int id;
    private String name;
    private int age;
    private boolean married;


    public Person(int id, String name, int age, boolean married) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
