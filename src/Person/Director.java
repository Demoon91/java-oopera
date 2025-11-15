package Person;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, int numberOfShows) {
        super(name, surname);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссёр спектакля: " +
                name + " " + surname + '.';
    }
}
