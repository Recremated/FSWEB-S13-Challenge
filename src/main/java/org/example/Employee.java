package org.example;

import java.util.Arrays;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id,String fullName, String email, String password, String[] healthplans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthplans;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthPlans = healthplans;
    }

    public void addHealthPlan(int index, String name){
        if(index >= 0 && index < healthPlans.length){
            if(healthPlans[index] == null){
                healthPlans[index] = name;
                System.out.println("Healthplan added at index " + index);
            } else {
                System.out.println("Index " + index + " is already occupied.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    @Override
    public String toString(){
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "', password='" + password + "', healthplans=" + Arrays.toString(healthPlans) + "}";
    }
}
