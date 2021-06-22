import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Driving extends JFrame implements ActionListener{
    
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    JFrame frame;
    JButton yesButton;
    JButton noButton;
    JLabel counterLabel;
    JLabel textLabel;

    public Driving(int rows, int columns) {

        super();
                
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Are you a good driver?");
        frame.setVisible(true);

        setSize(WIDTH, HEIGHT);
        setLayout (new GridLayout(rows, columns));

        yesButton = new JButton("Yes");
        yesButton.addActionListener(this);
        add(yesButton);
        
        noButton = new JButton("No");
        noButton.addActionListener(this);
        add(noButton);

        textLabel = new JLabel("Are you an excellent driver?", SwingConstants.CENTER);
        add(textLabel);
        yesButton.add(textLabel);
        
        counterLabel = new JLabel("Yes or no counter:", SwingConstants.CENTER);
        add(counterLabel);
        

        
        
    }

    public void actionPerformed(ActionEvent event) {
       textLabel.setText("textlabel");


        //yesButton.setText(“I’ve been clicked!”);    }
}
}