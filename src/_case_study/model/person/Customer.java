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

    public Customer(String id,
                    String dayOfBirth,
                    String name,
                    String phoneNumber,
                    String idCardNumber,
                    String email,
                    String gender,
                    String address,
                    String typeOfCustomer) {
        super(id, dayOfBirth, name, phoneNumber, idCardNumber, email, gender);
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
