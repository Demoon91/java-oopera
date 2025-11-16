package Person;


public class Choreographer extends Person {

    public Choreographer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "\nХореограф: " +
                name + " " + surname;
    }

}
