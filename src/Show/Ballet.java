package Show;

import Person.Director;

public class Ballet extends  MusicalShow {
    private String choreographer;

    public Ballet(String title, double duration, Director director, String musicAuthor, String choreographer, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Баллет: \n" + super.toString() +
                "\nХореограф: " + choreographer + ";";
    }
}

