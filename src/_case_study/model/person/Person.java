package _case_study.model.person;

public abstract class Person {
    private int id;
    private int age;
    private String name;
    private int phoneNumber;
    private int idCardNumber;
    private String email;
    private String gender;

    public Person() {
    }

    public Person(int id,
                  int age,
                  String name,
                  int phoneNumber,
                  int idCardNumber,
                  String email,
                  String gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.idCardNumber = idCardNumber;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(int idCardNumber) {
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
                ", age=" + age +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", idCardNumber=" + idCardNumber +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

