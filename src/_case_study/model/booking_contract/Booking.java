package _case_study.model.booking_contract;

import _case_study.model.facility.Facility;
import _case_study.model.person.Customer;

public class Booking {
    private int id;
    private CharSequence startDate;
    private CharSequence endDate;
    private Customer idCustomer;
    private String nameService;
    private Facility idService;

    public Booking() {
    }

    public Booking(int id,
                   CharSequence startDate,
                   CharSequence endDate,
                   Customer idCustomer,
                   String nameService,
                   Facility idService) {


        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.idService = idService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CharSequence getStartDate() {
        return startDate;
    }

    public void setStartDate(CharSequence startDate) {
        this.startDate = startDate;
    }

    public CharSequence getEndDate() {
        return endDate;
    }

    public void setEndDate(CharSequence endDate) {
        this.endDate = endDate;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Facility getIdService() {
        return idService;
    }

    public void setIdService(Facility idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", idCustomer=" + idCustomer +
                ", nameService='" + nameService + '\'' +
                ", idService=" + idService +
                '}';
    }
}
