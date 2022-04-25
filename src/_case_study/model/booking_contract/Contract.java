package _case_study.model.booking_contract;

public class Contract {
    private int numberContract;
    private int idBooking;
    private int beforeMoney;
    private int totalMoney;
    private String idCustomer;

    public Contract() {
    }

    public Contract(int numberContract,
                    int idBooking,
                    int beforeMoney,
                    int totalMoney,
                    String idCustomer) {
        this.numberContract = numberContract;
        this.idBooking = idBooking;
        this.beforeMoney = beforeMoney;
        this.totalMoney = totalMoney;
        this.idCustomer = idCustomer;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getBeforeMoney() {
        return beforeMoney;
    }

    public void setBeforeMoney(int beforeMoney) {
        this.beforeMoney = beforeMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract=" + numberContract +
                ", idBooking=" + idBooking +
                ", beforeMoney=" + beforeMoney +
                ", totalMoney=" + totalMoney +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
