package Laboratory.Lab13.Classes;

import Laboratory.Lab13.Interfaces.IActor;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Actor implements IActor {
    private Random randomNumberForId = new Random();
    private int id ;
    private String firstName ;
    private String lastName ;
    private List<Film> actorFilms ;

    public Actor() {
        this.id = randomNumberForId.nextInt(100000);
    }


    public Actor(String firstName, String lastName, List<Film> actorFilms) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.actorFilms = actorFilms;
        this.id = randomNumberForId.nextInt(100000);
    }


    @Override
    public void viewInformations() {
        System.out.println("Actor{" +
                "randomNumberForId=" + randomNumberForId +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", actorFilms=" + actorFilms +
                '}');
    }

    @Override
    public void searchFilmByFilmName(String filmName) {
        if(verifyTheFilmNameInActorFilmList(filmName))
            showTheFilmListInTheFilmNameSpecific(firstName);
        else
            System.out.println("The film is don't present in the list of actor films !");
    }
    private boolean verifyTheFilmNameInActorFilmList(String filmName){
        return actorFilms.stream().anyMatch(f -> f.getName().equals(filmName)) ;
    }

    private void showTheFilmListInTheFilmNameSpecific (String firstName){
        actorFilms.stream().filter(f -> f.getName().equals(firstName)).forEach(Film::getName);
    }

    @Override
    public void searchFilmByFilmId(int filmId) {
        if(verifyTheIdInFilms(filmId))
            viewFilmListWhichHasSpecificId(filmId);
        else
            System.out.println("The invalid value of film !!!!!!!");
    }

    private boolean verifyTheIdInFilms(int filmId){
        return actorFilms.stream().anyMatch(f -> Integer.valueOf(f.getFilmId()).equals(filmId));
    }

    private void viewFilmListWhichHasSpecificId(int filmId){
        actorFilms.stream().filter(f -> f.getFilmId() == filmId).forEach(Film::getName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void filmsActuated() {
        System.out.println("The list of title films is : \n");
        actorFilms.forEach(Film::getName);
    }
}
