/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test4;

/**
 *
 * @author tienl
 */
public class Student extends Person implements KPIEvaluator{
    public String studentID;
    private float gpa;
    private String specialization;
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // constructor
    
    public Student(String name,String studentID, int age, String gender) {
        super(name, age, gender);
        this.studentID = studentID;
    }
    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public double calculateKPI() {
        return 0.8;
    }
}
