package _case_study.model.facility;

public abstract class Facility {
    private String id;
    private String nameService;
    private String usableArea;
    private String rentCost;
    private String maximumPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String id,
                    String nameService,
                    String usableArea,
                    String rentCost,
                    String maximumPeople,
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

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentCost() {
        return rentCost;
    }

    public void setRentCost(String rentCost) {
        this.rentCost = rentCost;
    }

    public String getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(String maximumPeople) {
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
        return "Facility{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maximumPeople=" + maximumPeople +
                ", typeRent='" + typeRent + '\'' +
                ',';
    }
}
