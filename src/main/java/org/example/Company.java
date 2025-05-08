package org.example;

import java.util.Arrays;

public class Company {
    private long id ;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        if (giro < 0){
            this.giro = 0;
        } else {
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if(index >= 0 && index < developerNames.length){
            if(developerNames[index] == null){
                developerNames[index] = name;
                System.out.println("Employee added at index " + index);
            } else {
                System.out.println("Index " + index + " is already occupied.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    @Override
    public String toString(){
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developerNames=" + Arrays.toString(developerNames) + "}";
    }
}
