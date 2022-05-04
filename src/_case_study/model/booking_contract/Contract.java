package _case_study.model.booking_contract;

import _case_study.model.facility.Facility;
import _case_study.model.person.Customer;

import java.io.Serializable;
import java.time.temporal.ChronoUnit;

public class Contract implements Serializable {
    private String idContract;
    private Booking idBooking;
    private int preMoney;
    private int totalMoney;
    private Customer idCustomer;

    public Contract() {
    }

    public Contract(String idContract,
                    Booking idBooking,
                    int preMoney,
                    int totalMoney,
                    Customer idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.preMoney = preMoney;
        this.totalMoney = totalMoney;
        this.idCustomer = idCustomer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Booking getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Booking idBooking) {
        this.idBooking = idBooking;
    }

    public int getPreMoney() {
        return preMoney;
    }

    public void setPreMoney(int preMoney) {
        this.preMoney = preMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking=" + idBooking +
                ", beforeMoney=" + preMoney +
                ", totalMoney=" + totalMoney +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
