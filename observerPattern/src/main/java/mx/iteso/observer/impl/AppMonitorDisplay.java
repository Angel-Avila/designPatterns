package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;

/**
 * Created by Angel on 9/22/16.
 */
public class AppMonitorDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;
    private boolean notify = true;

    public AppMonitorDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void display() {
        System.out.println("*Notification*");
        System.out.println(homeTeam + " -Home- " + homeGoals + " // "
                + awayTeam + " -Away- " + awayGoals);
    }

    public void update(String home, String away, int homeGoals, int awayGoals) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        display();
    }

    public void turnNotificationsOn() {
        notify = true;
    }

    public void turnNotificationsOff() {
        notify = false;
    }

    public boolean shouldNotify(){
        return notify;
    }
}
