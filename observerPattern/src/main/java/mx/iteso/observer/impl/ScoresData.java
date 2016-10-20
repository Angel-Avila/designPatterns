package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ScoresData implements Subject {
    private ArrayList<Observer> observers;
    private int homeGoals;
    private int awayGoals;
    private String homeTeam;
    private String awayTeam;
    Set<Scorer> scorers;

    public ScoresData(){
        observers = new ArrayList<Observer>();
        scorers = new LinkedHashSet<Scorer>();
    }

    public void setTeams(String homeTeam, String awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        homeGoals = 0;
        awayGoals = 0;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void addScorer(Scorer scorer) {
        scorers.add(scorer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            if(observer.shouldNotify())
                observer.update(this.homeTeam, this.awayTeam, this.homeGoals, this.awayGoals);
        }
    }

    public void newScore(){
        notifyObservers();
    }

    public void goalScored(Scorer scorer) {
        addScorer(scorer);

        if(scorer.team.equals(homeTeam))
            homeGoals++;

        else if(scorer.team.equals(awayTeam))
            awayGoals++;

    }

    public void setScore( String homeTeam, String awayTeam, int homeGoals, int awayGoals){
        this.homeTeam = homeTeam;
        this.awayTeam =  awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        newScore();
    }
}
