package Show;

import Person.Director;
import Person.Person;

public class Ballet extends  MusicalShow {
    private Person choreographer;

    public Ballet(String title, double duration, Director director, Person musicAuthor, Person choreographer, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }


    @Override
    public String toString() {
        return "Баллет: \n" + super.toString() +
                "\nХореограф: " + choreographer + ";";
    }
}

