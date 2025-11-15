package Show;

import Person.Director;

public class Classic extends Show {


    public Classic(String title, double duration, Director director) {
        super(title, duration, director);
    }

    @Override
    public String toString() {
        return "Классическое шоу:\n" + super.toString();
    }
}