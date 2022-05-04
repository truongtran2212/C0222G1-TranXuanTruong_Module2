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

    @Override
    public String getLine() {
        return super.getLine() + "," + freeService;
    }
}
