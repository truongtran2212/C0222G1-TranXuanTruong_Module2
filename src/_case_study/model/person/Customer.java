package _case_study.model.person;

public class Customer extends Person {
        private String address;
        private String typeOfCustomer;

    public Customer() {
    }

    public Customer(String address, String typeOfCustomer) {
        this.address = address;
        this.typeOfCustomer = typeOfCustomer;
    }

    public Customer(int id,
                    int age,
                    String name,
                    int phoneNumber,
                    int idCardNumber,
                    String email,
                    String gender,
                    String address,
                    String typeOfCustomer) {
        super(id, age, name, phoneNumber, idCardNumber, email, gender);
        this.address = address;
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{ " + super.toString() +
                " address= " + address + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                '}';
    }
}
