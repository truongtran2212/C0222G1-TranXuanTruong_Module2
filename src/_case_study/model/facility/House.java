package _case_study.model.facility;

public class House extends Facility {
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(String id,
                 String nameService,
                 double usableArea,
                 int rentCost,
                 int maximumPeople,
                 String typeRent,
                 String roomStandard,
                 int floor) {
        super(id, nameService, usableArea, rentCost, maximumPeople, typeRent);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getNameService() {
        return super.getNameService();
    }

    @Override
    public void setNameService(String nameService) {
        super.setNameService(nameService);
    }

    @Override
    public double getUsableArea() {
        return super.getUsableArea();
    }

    @Override
    public void setUsableArea(double usableArea) {
        super.setUsableArea(usableArea);
    }

    @Override
    public int getRentCost() {
        return super.getRentCost();
    }

    @Override
    public void setRentCost(int rentCost) {
        super.setRentCost(rentCost);
    }

    @Override
    public int getMaximumPeople() {
        return super.getMaximumPeople();
    }

    @Override
    public void setMaximumPeople(int maximumPeople) {
        super.setMaximumPeople(maximumPeople);
    }

    @Override
    public String getTypeRent() {
        return super.getTypeRent();
    }

    @Override
    public void setTypeRent(String typeRent) {
        super.setTypeRent(typeRent);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                " roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }

    @Override
    public String getLine() {
        return super.getLine() + "," + roomStandard + "," + floor;
    }
}
