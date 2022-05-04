package Training.exercise1.model;

public class MovieTheater {
    private String idMovie;
    private String nameMovie;
    private String showDate;
    private int numberOfTicket;

    public MovieTheater() {
    }

    public MovieTheater(String idMovie,
                        String nameMovie,
                        String showDate,
                        int numberOfTicket) {
        this.idMovie = idMovie;
        this.nameMovie = nameMovie;
        this.showDate = showDate;
        this.numberOfTicket = numberOfTicket;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    @Override
    public String toString() {
        return "MovieTheater{" +
                "idMovie='" + idMovie + '\'' +
                ", nameMovie='" + nameMovie + '\'' +
                ", showDate='" + showDate + '\'' +
                ", numberOfTicket=" + numberOfTicket +
                '}';
    }
}
