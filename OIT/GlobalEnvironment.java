import javax.swing.JFrame;
import java.util.ArrayList;
public class GlobalEnvironment implements Runnable{
    public static boolean buttonPressed;
    public static ArrayList<JFrame> stack;
    
    public GlobalEnvironment(){
        buttonPressed = false;
    }
    
    @Override
    public void run(){
    
    }
}
