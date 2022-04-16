package _case_study.model.facility;

public class Room  extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, String usableArea, int rentCost, int maximumPeople, String freeService) {
        super(nameService, usableArea, rentCost, maximumPeople);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
