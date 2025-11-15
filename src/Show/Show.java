package Show;

import Person.Actor;
import Person.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show (String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return new ArrayList<>(listOfActors);
    }

    public void setListOfActors (ArrayList<Actor> listOfActors) {
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public void addActor (Actor actor) {
        if (actor != null)  {
            listOfActors.add(actor);
        }
    }

    public void changeActor (Actor newActor, String chSurname) {
        boolean actorRemoved = listOfActors.removeIf(actor -> chSurname.equals(actor.getSurname()));

        if (actorRemoved) {
            listOfActors.add(newActor);
        } else {
            System.out.println("Данный актер не участвует в шоу");
        }
    }

    public void printAllActors () {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("В шоу не добавленны актеры");
            return;
        }
        for (int i = 0 ; i < listOfActors.size(); i++) {
            System.out.println(listOfActors.get(i));
        }
    }

    @Override
    public String toString() {
        return  "Название: " + title + ";\n" +
                "Продолжительность: " + duration + ";\n" +
                director;
    }
}