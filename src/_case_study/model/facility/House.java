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

    public House(String nameService,
                 double usableArea,
                 int rentCost,
                 int maximumPeople,
                 String typeRent,
                 String roomStandard,
                 int floor) {

        super(nameService, usableArea, rentCost, maximumPeople, typeRent);
        this.roomStandard = roomStandard;
        this.floor = floor;
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
}
