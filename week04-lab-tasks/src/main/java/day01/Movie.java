package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int year;
    private List<Actor> list = new ArrayList<>();

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void addActor(Actor actor) {
        list.add(actor);
    }

    public List<Actor> getList() {
        return list;
    }

    public int actorsInTheirTwenties() {
        int actors20 = 0;
        for (Actor actor: list) {
            int year20 = year - actor.getYear();
            if (20 < year20 && year20 < 30) {
                actors20++;
            }
        }
        return actors20;
    }
}
