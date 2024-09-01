/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test4;

/**
 *
 * @author tienl
 */
public class ITStudent extends Student{
    private String specialization;
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public ITStudent(String name, String studentID, int age, String gender,String specialization) {
        super(name, studentID, age, gender);
        this.specialization = specialization;
    }

    @Override
    public String getRole() {
        return "IT Student";
    }

    @Override
    public String toString() {
        return "ITStudent{" +
                "specialization='" + specialization + '\'' +
                ", studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
