import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
// provides a way to create new graph pop-ups
public class GUImain extends JFrame implements ActionListener {
    //private JFrame frame;
    private JButton newGraph;


    public GUImain() {
        //frame = new JFrame("Circular Flow of Income Diagram");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set size of JFrame
        setSize(400, 400);
        setLayout(null);
        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JButton button5;
        JButton button6;
        JButton button7;
        JButton button8;
        JButton button9;
        JButton button10;
        JButton button11;
        JButton button12;
        JButton button13;


        int height = 0;
        int width = 0;
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("Circular Flow of Income Diagram");
        button1.setBounds(350, 100, 250, 40);
        button2 = new JButton("households");
        button2.setBounds(350, 125, 100, 40);
        button3 = new JButton("Firms");
        button3.setBounds(350, 150, 100, 40);
        button4 = new JButton("Government Spending");
        button4.setBounds(350, 175, 250, 40);
        button5 = new JButton("Investment");
        button5.setBounds(350, 200, 100, 40);
        button6 = new JButton("Exports");
        button6.setBounds(350, 225, 100, 40);
        button7 = new JButton("Imports");
        button7.setBounds(350, 250, 100, 40);
        button8 = new JButton("Taxes");
        button8.setBounds(350, 275, 100, 40);
        button9 = new JButton("Savings");
        button9.setBounds(350, 300, 100, 40);
        button10 = new JButton("Expenditure on Goods and Services");
        button10.setBounds(350, 325, 250, 40);
        button11 = new JButton("Goods and Services");
        button11.setBounds(350, 350, 250, 40);
        button12 = new JButton("Factors of Production");
        button12.setBounds(350, 375, 250, 40);
        button13 = new JButton("Income(wages, profit, rent, interest)");
        button13.setBounds(350, 400, 250, 40);


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
        add(button9);
        button9.addActionListener(this);
        add(button10);
        button10.addActionListener(this);
        add(button11);
        button11.addActionListener(this);
        add(button12);
        button12.addActionListener(this);
        add(button13);
        button13.addActionListener(this);
        setVisible(true);
        getContentPane();


        System.out.println("SEQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("Circular Flow of Income Diagram");
        button1.setBounds(350, 100, 100, 40);
        button2 = new JButton("households");
        button2.setBounds(350, 125, 100, 40);
        button3 = new JButton("Firms");
        button3.setBounds(350, 150, 100, 40);
        button4 = new JButton("Government Spending");
        button4.setBounds(350, 175, 100, 40);
        button5 = new JButton("Investment");
        button5.setBounds(350, 200, 100, 40);
        button6 = new JButton("Exports");
        button6.setBounds(350, 225, 100, 40);
        button7 = new JButton("Imports");
        button7.setBounds(350, 250, 100, 40);
        button8 = new JButton("Taxes");
        button8.setBounds(350, 275, 100, 40);
        button9 = new JButton("Savings");
        button9.setBounds(350, 300, 100, 40);
        button10 = new JButton("Expenditure on Goods and Services");
        button10.setBounds(350, 325, 250, 40);
        button11 = new JButton("Goods and Services");
        button11.setBounds(350, 350, 100, 40);
        button12 = new JButton("Factors of Production");
        button12.setBounds(350, 375, 100, 40);
        button13 = new JButton("Income(wages, profit, rent, interest)");
        button13.setBounds(350, 400, 250, 40);


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
        add(button9);
        button9.addActionListener(this);
        add(button10);
        button10.addActionListener(this);
        add(button11);
        button11.addActionListener(this);
        add(button12);
        button12.addActionListener(this);
        add(button13);
        button13.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Test")) {
            System.out.println("Finish");
        }
    }
}