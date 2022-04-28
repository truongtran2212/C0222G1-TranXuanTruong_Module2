package _case_study.model.facility;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id,
                String nameService,
                double usableArea,
                int rentCost,
                int maximumPeople,
                String typeRent,
                String freeService) {
        super(id, nameService, usableArea, rentCost, maximumPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                " freeService='" + freeService + '\'' +
                '}';
    }
}
