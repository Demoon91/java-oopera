package Person;

public class MusicAuthor extends Person {


    public MusicAuthor(String name, String surname) {
        super(name, surname);
    }


    @Override
    public String toString() {
        return "\nАвтор музыки: " +
                name + " " + surname + ';';
    }
}
