package mx.iteso.observer;

import mx.iteso.observer.impl.AppMonitorDisplay;
import mx.iteso.observer.impl.Scorer;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        AppMonitorDisplay appMonitorDisplay = new AppMonitorDisplay(scoresData);

        // Tacit Knowledge - Intel

        scoresData.setTeams("Tacit Knowledge", "Intel");
        Scorer reymundo = new Scorer("Reymundo", 10, "Goalie", "Tacit Knowledge");
        Scorer pancho = new Scorer("Pancho", 12, "Midfielder", "Intel");

        for (int i = 0; i < 8; i++)
            scoresData.goalScored(reymundo);

        scoresData.goalScored(pancho);
        scoresData.notifyObservers();

        // Chivas - Queretaro

        storeMonitorDisplay.turnNotificationsOff();
        Scorer chicharito = new Scorer("Chicharito", 42, "Forward", "Chivas");
        Scorer queratarin = new Scorer("Queretarin", 17, "Second striker", "Queretaro");
        scoresData.setTeams("Chivas", "Queretaro");

        scoresData.goalScored(chicharito);
        scoresData.goalScored(queratarin);
        scoresData.goalScored(chicharito);

        scoresData.notifyObservers();

        // La Ganga - Muebles America

        appMonitorDisplay.turnNotificationsOff();
        storeMonitorDisplay.turnNotificationsOn();
        scoresData.setScore("La Ganga", "Muebles America", 0, 0);
    }
}
