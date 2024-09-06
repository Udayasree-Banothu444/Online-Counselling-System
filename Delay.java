import java.util.Timer;
import java.util.TimerTask;

public class Delay {

  static  Timer timer ;

  public Delay(int seconds){
      timer = new Timer();

      timer.schedule(new BeginTask(),seconds*1000);
  }
  class BeginTask extends TimerTask {
      public void run() {
          System.out.println("Next page");
          timer.cancel();
      }
  }

    public static void main(String[] args) {
        new Delay(5);
        System.out.println("Opening next Page");
    }

}
