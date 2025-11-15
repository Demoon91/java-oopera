package Show;

import Person.Director;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, double duration, Director director, String musicAuthor, int choirSize, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Опера \n" + super.toString() +
                "\nКоличество человек в хоре: " + choirSize + ";";
    }
}