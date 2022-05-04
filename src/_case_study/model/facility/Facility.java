package _case_study.model.facility;

import java.io.Serializable;


public abstract class Facility implements Serializable{
    private String id;
    private String nameService;
    private double usableArea;
    private int rentCost;
    private int maximumPeople;
    private String typeRent;


    public Facility() {
    }

    public Facility(String id,
                    String nameService,
                    double usableArea,
                    int rentCost,
                    int maximumPeople,
                    String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.maximumPeople = maximumPeople;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maximumPeople=" + maximumPeople +
                ", typeRent='" + typeRent + '\'' +
                ',';
    }
    public String getLine(){
        return id + "," +
                nameService + "," +
                usableArea + "," +
                rentCost + "," +
                maximumPeople + "," +
                typeRent;
    }
}
