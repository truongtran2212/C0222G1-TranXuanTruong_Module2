package _case_study.model.facility;

public class House extends Facility {
    private String roomStandard;
    private String floor;

    public House() {
    }

    public House(String roomStandard, String floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(String id,
                 String nameService,
                 String usableArea,
                 String rentCost,
                 String maximumPeople,
                 String typeRent,
                 String roomStandard,
                 String floor) {
        super(id, nameService, usableArea, rentCost, maximumPeople, typeRent);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
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
