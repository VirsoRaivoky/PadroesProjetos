package Observer;

public interface Observer {
  public void update(Observable observable, Object obj, String state);
  public void notifyObserver(Observable observable, String message);
}
