import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

// provides a way to create new graph pop-ups
public class GUImain extends JFrame implements ActionListener {
    private JFrame frame;
    private JButton newGraph;

    public GUImain() {
        //set title
        frame = new JFrame("Circular Flow of Income Diagram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set size of JFrame
        frame.setSize(400,400);
        frame.setLayout(null);

        //create JPanel for circles
        JPanel circlesPanel = new JPanel();
        circlesPanel.setLayout(null);

        //create JLabel for households
        JLabel households = new JLabel("Households");
        households.setBackground(Color.blue);
        households.setBounds(550,150,100,100);
        //add households label to circlesPanel
        circlesPanel.add(households);

        //create JLabel for firms
        JLabel firms = new JLabel("Firms");
        firms.setBackground(Color.red);
        firms.setBounds(1100,150,100,100);
        //add firms label to circlesPanel
        circlesPanel.add(firms);
        getContentPane().add(circlesPanel);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Test")) {
            System.out.println("Finish");


        }
    }


}