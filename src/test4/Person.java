/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test4;

/**
 *
 * @author tienl
 */
public abstract class Person {
    public String name;
    public int age;
    public String gender;
    protected String bank_account;
    // constructor

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public abstract String getRole();
}
