import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class GUIdeflationarygap extends JFrame implements ActionListener {
    private JFrame frame;
    private JButton newGraph;


    public GUIdeflationarygap() {
        frame = new JFrame("Inflationary Gap In The New Classical Model");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set size of JFrame
        frame.setSize(400, 400);
        frame.setLayout(null);
        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JButton button5;
        JButton button6;
        JButton button7;
        JButton button8;
        JButton button9;


        int height = 0;
        int width = 0;
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("Inflationary Gap In The New Classical Model");
        button1.setBounds(350, 100, 250, 40);
        button2 = new JButton("P1");
        button2.setBounds(350, 125, 100, 40);
        button3 = new JButton("P2");
        button3.setBounds(350, 150, 100, 40);
        button4 = new JButton("Y1");
        button4.setBounds(350, 175, 250, 40);
        button5 = new JButton("YFE");
        button5.setBounds(350, 200, 100, 40);
        button6 = new JButton("LRAS");
        button6.setBounds(350, 225, 100, 40);
        button7 = new JButton("SRAS");
        button7.setBounds(350, 250, 100, 40);
        button8 = new JButton("AD1");
        button8.setBounds(350, 275, 100, 40);
        button9 = new JButton("AD2");
        button9.setBounds(350, 275, 100, 40);


        add(button1);
        button1.addActionListener(this);
        add(button2);
        button2.addActionListener(this);
        add(button3);
        button3.addActionListener(this);
        add(button4);
        button4.addActionListener(this);
        add(button5);
        button5.addActionListener(this);
        add(button6);
        button6.addActionListener(this);
        add(button7);
        button7.addActionListener(this);
        add(button8);
        button8.addActionListener(this);
        button9.addActionListener(this);

        setVisible(true);
        getContentPane();


        System.out.println("SEQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("Inflationary Gap In The New Classical Model");
        button1.setBounds(350, 100, 250, 40);
        button2 = new JButton("P1");
        button2.setBounds(350, 125, 100, 40);
        button3 = new JButton("P2");
        button3.setBounds(350, 150, 100, 40);
        button4 = new JButton("Y1");
        button4.setBounds(350, 175, 250, 40);
        button5 = new JButton("YFE");
        button5.setBounds(350, 200, 100, 40);
        button6 = new JButton("LRAS");
        button6.setBounds(350, 225, 100, 40);
        button7 = new JButton("SRAS");
        button7.setBounds(350, 250, 100, 40);
        button8 = new JButton("AD1");
        button8.setBounds(350, 275, 100, 40);
        button9 = new JButton("AD2");
        button9.setBounds(350, 275, 100, 40);

        add(button1);
        button1.addActionListener(this);
        add(button2);
        button2.addActionListener(this);
        add(button3);
        button3.addActionListener(this);
        add(button4);
        button4.addActionListener(this);
        add(button5);
        button5.addActionListener(this);
        add(button6);
        button6.addActionListener(this);
        add(button7);
        button7.addActionListener(this);
        add(button8);
        button8.addActionListener(this);
        button9.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Test")) {
            System.out.println("Finish");
        }

    }
}
