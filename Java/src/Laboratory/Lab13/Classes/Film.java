package Laboratory.Lab13.Classes;

import Laboratory.Lab13.Interfaces.IFilm;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Film implements IFilm {

    private int filmId ;
    private String name ;
    private String director ;
    private int durationHours;
    private List<Actor> participationActorList ;


    public Film(String name, String director, int durationHours, List<Actor> participationActorList) {
        Random randomNumberForFilmID = new Random();

        this.filmId =  randomNumberForFilmID.nextInt(100000);
        this.name = name;
        this.director = director;
        this.durationHours = durationHours;
        this.participationActorList = participationActorList;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(int durationHours) {
        this.durationHours = durationHours;
    }

    @Override
    public void viewActorInTheFilmListByActorId(int actorId) {
        if(verifyByActorId(actorId))
            showTheActorDetailsById(actorId);
        else
            System.out.println("The invalid actor Id !!!!");
    }

    private void showTheActorDetailsById(int actorId){
        participationActorList.stream().filter(a -> a.getId() == actorId).forEach(Actor::viewInformations);
    }

    private boolean verifyByActorId(int actorId){
        return participationActorList.stream().anyMatch(a -> a.getId() == actorId);
    }

    @Override
    public void viewActorInTheActorListByActorFristName(String actorFirstName) {
        if(verifyActorByFristName(actorFirstName))
            showTheActorDetailsByFirstName(actorFirstName);
        else
            System.out.println("Actor first name is invalid !!!!");
    }
    private boolean verifyActorByFristName(String actorFristName){
        return participationActorList.stream()
                .anyMatch(a -> a.getFirstName().equals(actorFristName));
    }
    private void showTheActorDetailsByFirstName(String actorFristName){
        participationActorList.stream()
                .filter(a -> a.getFirstName().equals(actorFristName))
                .forEach(Actor::viewInformations);
    }

    @Override
    public void viewActorInTheActorListByActorLastName(String actorLastName) {
        if(verifyActorByLastName(actorLastName))
            showTheActorDetailsByLastName(actorLastName);
        else
            System.out.println("The last name is invalid !!!!");

    }
    private boolean verifyActorByLastName(String actorLastName){
        return participationActorList.stream().
                anyMatch(e -> e.getLastName().equals(actorLastName));
    }

    private void showTheActorDetailsByLastName(String actorLastName){
        participationActorList.stream()
                .filter(actor -> actor.getLastName().equals(actorLastName))
                .forEach(Actor::viewInformations);
    }

    @Override
    public void viewActorListInThisFilm() {
        participationActorList
                .forEach(Actor::viewInformations);
    }
}
