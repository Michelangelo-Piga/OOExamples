package org.generation.italy.bank.model;

import java.time.LocalDate;
import java.time.Period;

public class Customer {

    private long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private char gender;


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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }



    public String getFullName(){

        StringBuilder sb = new StringBuilder(getName()).append(" ").append(getSurname());

        return sb.toString();
    }

    public int getAge(){

        Period t = birthDate.until(LocalDate.now());

        int years = t.getYears();

        return years;
    }

}
