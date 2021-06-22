import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;


public class Driving extends JFrame implements ActionListener {
    
    public static final int WIDTH = 500;
    public static final int HEIGHT = 150;

    JFrame frame;
    JButton yesButton;
    JButton noButton;
    JLabel counterLabel;
    JLabel textLabel;
    JPanel panel;

    public Driving(int rows, int columns) {

        super();
                
        frame = new JFrame();
        yesButton = new JButton("Yes");
        noButton = new JButton("No");
        counterLabel = new JLabel("Counting", SwingConstants.CENTER);
        textLabel = new JLabel("Are you a good driver?", SwingConstants.CENTER);
        panel = new JPanel();
        counterLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        textLabel.setFont(new Font("Verdana", Font.BOLD, 30));

        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("Are you a good driver?");
        frame.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(1,2));

        yesButton.addActionListener(this);
        noButton.addActionListener(this);


        frame.add(textLabel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(counterLabel, BorderLayout.SOUTH);
        
        
        panel.add(yesButton);
        panel.add(noButton);
        
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        if (buttonString.equals("Yes")){
            textLabel.setText("WE NEED YOU!");
        }
        else if (buttonString.equals("No")){
            textLabel.setText("YOU NEED TO PRACTICE.");
        }
        else{
            System.out.println("OEPS");
        }
        
    }
}