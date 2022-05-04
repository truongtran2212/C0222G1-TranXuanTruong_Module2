package _case_study.model.person;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String id;
    private String dayOfBirth;
    private String name;
    private String phoneNumber;
    private String idCardNumber;
    private String email;
    private String gender;

    public Person() {
    }

    public Person(String id,
                  String dayOfBirth,
                  String name,
                  String phoneNumber,
                  String idCardNumber,
                  String email,
                  String gender) {


        this.id = id;
        this.dayOfBirth = dayOfBirth;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.idCardNumber = idCardNumber;
        this.email = email;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", age=" + dayOfBirth +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", idCardNumber=" + idCardNumber +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ',';
    }
}

