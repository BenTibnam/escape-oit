import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;

public class Runner{
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 1024;
    private static FrontendFactory ff = new FrontendFactory();
    public static void main(String args[]){
        JFrame terminatingFrame = FrontendFactory.makeFrame("Escape OIT", WIDTH, HEIGHT);
        JButton play = new JButton("Play");
        JButton exit = new JButton("Exit");
        JLabel image = new JLabel(new ImageIcon("title.jpg"));
        image.setBounds(0, 0, 1274, 814);
        
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                createIntro();
            }
        });
                    
        play.setBounds(324, 850, 100, 50);
                
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
                    
        exit.setBounds(824, 850, 100, 50);
                    
        terminatingFrame.setLayout(null);
                    
        terminatingFrame.setVisible(true);
        terminatingFrame.getContentPane().add(image);
        terminatingFrame.getContentPane().add(play);
        terminatingFrame.getContentPane().add(exit);
    }
    
    private static void die(String messge, ImageIcon img){
    
    }
    
    private static void createIntro(){
        Clip c = ff.prepareSound("sound.wav");
        for(int i = 0; i < 100; i++) c.start();
        
        JFrame frame = FrontendFactory.makeNonTerminatingFrame("HAH", WIDTH, HEIGHT);
        JButton a = new JButton("A. try to bite/wiggle yor way out");
        JButton b = new JButton("B. plug the cable into the switch next to you");
        JLabel story = new JLabel("<html>YOu WakE UP In a daRk rooM Thast smElls Like dusat AnD CheeTOs. your hands are bound in cat 5E, the outdated and defunct cable causes you panick. the rj45 connecter is <br> digging into your skin. it kinda hurts.</html>");
        JLabel image = new JLabel(new ImageIcon("picture.jpg"));
        
        frame.setLayout(null);
        image.setBounds(0, 0, 480, 360);
        a.setBounds(500, 10, 500, 50);
        b.setBounds(500, 70, 500, 50);
        story.setBounds(20, 150, 1000, 1000);
        
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                ;
            }
        });
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                ;
            }
        });
        
        frame.getContentPane().add(image);
        frame.getContentPane().add(a);
        frame.getContentPane().add(b);
        frame.getContentPane().add(story);
        frame.setVisible(true);
    }
}

