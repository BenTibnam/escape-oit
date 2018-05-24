import java.awt.Image;
import java.io.*;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
public class Adventure
{
    Scanner in = new Scanner (System.in);
    private int gameState = 1;
    public Adventure()
    {
        JFrame intro = popup("title.jpg", "title screen", "Welcome to my choose you own adventure game: Escape the OIT Room!\nIn this game you will type specific queues to move on in the story. There are different endings, but not all are good!");
        wait(1500);
        //closeJFrame(intro);
        //whole program exits after this. for now we will have all frames stack and close at the end of the program.
        JFrame frame1 = popup("picture.jpg", "spooky OIT", "HAH");
        for(int i = 0; i < 100; i++) sound("sound.wav");
        System.out.println("YOu WakE UP In a daRk rooM Thast smElls Like dusat AnD CheeTOs.");
        System.out.println("your hands are bound in cat 5E, the outdated and defunct cable causes you panick. the rj45 connecter is digging into your skin. it kinda hurts.");
        System.out.println("do you (a)try to bite/wiggle yor way out or (b) plug the cable into the switch next to you?");
        String a1 = in.nextLine();
        if(a1.equalsIgnoreCase("A")){
            System.out.println("owchie oof owie ooh ow it hurts! dso u actually keep wriggling (a) yes (b) no");
            //popup("picture2.jpg", "cable tied");
            String a2 = in.nextLine();
            if(a2.equalsIgnoreCase("A")){
                System.out.println("THE RJ 45 CUTs DEEEEEP INTo YOur JUGGULAR VEIN YOU blleed oUT FROM UR NECK AND dIE in teh OIT room AT AHS!!!!!!");
                //popup("picture3.jpg", "rj4DEAD");
                wait(5000);
                System.exit(0);
            }
            else if(a2.equalsIgnoreCase("B")){
                System.out.println("the rj45 slowly UNWRaps fZFROM YOU MANGLED CROPSE but ur actually okay! do u go to (a) the server troom to hax urself out or (b) try to crack teh OIT password masker to log into their admin PC?");
                //popup("picture4.jpg", "dark Hellwya");
                String a3 = in.nextLine();
                if(a3.equalsIgnoreCase("A")){
                    System.out.println("");
                    //popup("picture3.jpg", "rj4DEAD");
                    wait(5000);
                    System.exit(0);
                }
                else if(a3.equalsIgnoreCase("B")){
                    System.out.println("the rj45 slowly UNWRaps fZFROM YOU MANGLED CROPSE but ur actually okay! do u go to (a) the server troom to hax urself out or (b) try to crack teh OIT password masker to log into their admin PC?");
                    //popup("picture4.jpg", "dark Hellwya");

                }
                else{
                    System.out.println("YOU DIEEEEE!@@@!@!@!@@!!!!111!1");
                    System.exit(0);
                }
            }
            else{
                System.out.println("YOU DIEEEEE!@@@!@!@!@@!!!!111!1");
                System.exit(0);
            }
        }
        else if(a1.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("YOU DIEEEEE!@@@!@!@!@@!!!!111!1");
            System.exit(0);
        }
    }

    public void wait(int ms){
        try{
            Thread.sleep(ms);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public JFrame popup(String imgDir, String title, String text){
        ImageIcon picture = new ImageIcon(imgDir);
        JFrame frame = new JFrame(title);
        JLabel label = new JLabel(picture);
        JLabel jtext = new JLabel(text);
        JPanel contentPane = new JPanel();
        JPanel actionPane = new JPanel();
        contentPane.setLayout(new FlowLayout());
        actionPane.setLayout(null);
        JButton A = new JButton ("A");
        A.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                }
            });
        JButton B = new JButton ("B");
        B.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                }
            });

        contentPane.add(jtext);
        contentPane.add(label);
        contentPane.add(A);
        contentPane.add(B);

        frame.setSize(1280, 1024);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(contentPane);
        contentPane.setBounds(0, 0, 1280, 500);
        frame.setVisible(true);

        return frame;
    }

    public void closeJFrame(JFrame frame){
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }

    public void sound(String mp3Dir){
        try{
            URL url = this.getClass().getClassLoader().getResource(mp3Dir);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn
            );
            clip.start();
        }catch(UnsupportedAudioFileException uafe){
            System.out.println("Error: unsupported audio file");
        }catch(IOException ie){
            System.out.println("Error: IO Exception");
        }catch(LineUnavailableException lue){
            System.out.println("Error: Line unavailable");
        }

    }

    public static void main(String args[]){
        new Adventure();
    }
}
