package mx.iteso.observer;

public interface Observer {
    public void update(String home, String away, int homeGoals, int awayGoals);
    public void turnNotificationsOn();
    public void turnNotificationsOff();
    public boolean shouldNotify();
}
