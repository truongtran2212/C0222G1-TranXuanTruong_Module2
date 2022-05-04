package _case_study.model.booking_contract;

import _case_study.model.facility.Facility;
import _case_study.model.person.Customer;

import java.io.Serializable;

public class Booking implements Serializable {
    private int idBooking;
    private String startDate;
    private String endDate;
    private String idCustomer;
    private String idFacility;
    private String typeOfService;

    public Booking() {

    }

    public Booking(int idBooking,
                   String startDate,
                   String endDate,
                   String idCustomer,
                   String idFacility,
                   String typeOfService) {


        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.idFacility = idFacility;
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

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
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
                ", idFacility='" + idFacility + '\'' +
                ", typeOfService=" + typeOfService +
                '}';
    }
}
