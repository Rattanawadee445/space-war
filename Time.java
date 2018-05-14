import java.util.Timer;
import java.util.TimerTask;

public class Time {
    private int count = 0;
    public Time(){
       
        Timer myTimer;
        myTimer = new Timer();

        myTimer.schedule(new TimerTask() {
            public void run() {
                 count++;
            }
        }, 0, 1000);
        
    }
    public int getCount(){
        return count;
    }
}