package _case_study.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String floor;

    public Villa() {
    }

    public Villa(String roomStandard, String poolArea, String floor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String id,
                 String nameService,
                 String usableArea,
                 String rentCost,
                 String maximumPeople,
                 String typeRent,
                 String roomStandard,
                 String poolArea,
                 String floor) {
        super(id, nameService, usableArea, rentCost, maximumPeople, typeRent);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                " roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}
