package _case_study.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String roomStandard, String poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String nameService,
                 String usableArea,
                 int rentCost,
                 int maximumPeople,
                 String roomStandard,
                 String poolArea,
                 int floor) {

        super(nameService, usableArea, rentCost, maximumPeople);
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
