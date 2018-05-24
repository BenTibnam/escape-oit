import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;
import java.net.URL;

public class FrontendFactory{
    public Clip prepareSound(String dir){
         try{
            URL url = this.getClass().getClassLoader().getResource(dir);
            AudioInputStream ais = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            return clip;
        }catch(UnsupportedAudioFileException uafe){
            System.out.println("Error: unsupported audio file");
        }catch(IOException ie){
            System.out.println("Error: IO Exception");
        }catch(LineUnavailableException lue){
            System.out.println("Error: Line unavailable");
        }
        
        return null;
    }
    
    public static void playSound(Clip c){
        if(c == null) System.out.println("ERROR: THE CLIP IS NULL");
        else c.start();
    }
    
    public static JFrame makeFrame(String title, int w, int h){
        JFrame frame = new JFrame(title);
        frame.setSize(w, h);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(){
                System.exit(0);
            }
        });
        
        return frame;
    }
    
    public static JFrame makeNonTerminatingFrame(String title, int w, int h){
        JFrame frame = new JFrame(title);
        frame.setSize(w, h);
        frame.addWindowListener(new WindowAdapter(){
            ;
        });
        
        return frame;
    }
    
}
