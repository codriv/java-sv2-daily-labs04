package day01;

public class ActorMain {
    public static void main(String[] args) {
        Actor actor1 = new Actor("nev1", 1981);
        Actor actor2 = new Actor("nev2", 1982);
        Actor actor3 = new Actor("nev3", 1983);
        Actor actor4 = new Actor("nev4", 1994);
        Actor actor5 = new Actor("nev5", 1998);
        Actor actor6 = new Actor("nev6", 1990);

        Movie movie = new Movie("cim", 2010);
        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);
        movie.addActor(actor4);
        movie.addActor(actor5);
        movie.addActor(actor6);

        System.out.println(movie.actorsInTheirTwenties());
    }
}
