package _case_study.model.booking_contract;

import _case_study.model.facility.Facility;
import _case_study.model.person.Customer;

import java.io.Serializable;
import java.util.Objects;

public class Booking implements Serializable {
    private int idBooking;
    private String startDate;
    private String endDate;
    private Customer idCustomer;
    private Facility nameService;
    private String typeOfService;

    public Booking() {

    }

    public Booking(int idBooking,
                   String startDate,
                   String endDate,
                   Customer idCustomer,
                   Facility nameService,
                   String typeOfService) {


        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeOfService = typeOfService;
    }

    public int getId() {
        return idBooking;
    }

    public void setId(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Facility getNameService() {
        return nameService;
    }

    public void setNameService(Facility nameService) {
        this.nameService = nameService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + idBooking +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", idCustomer=" + idCustomer +
                ", nameService='" + nameService + '\'' +
                ", typeOfService=" + typeOfService +
                '}';
    }
}
