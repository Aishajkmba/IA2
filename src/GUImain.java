import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
// provides a way to create new graph pop-ups
public class GUImain extends JFrame implements ActionListener {
    //private JFrame frame;
    private JButton newGraph;
    private ArrayList<JButton> allButtons;
    private String copyText;


    public GUImain() {
        //frame = new JFrame("Circular Flow of Income Diagram");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set size of JFrame
        setSize(2000, 2000);
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
        JButton button14;
        JButton button15;
        JButton button16;
        JButton button17;
        JButton button18;
        JButton button19;
        JButton button20;
        JButton button21;
        JButton button22;
        JButton button23;
        JButton button24;
        JButton button25;
        JButton button26;



        int height = 0;
        int width = 0;
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        JPanel panel = new JPanel(null);

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
        button14 = new JButton("");
        button14.setBounds(350, 100, 250, 40);
        button15 = new JButton("");
        button15.setBounds(350, 125, 100, 40);
        button16 = new JButton("");
        button16.setBounds(350, 150, 100, 40);
        button17 = new JButton("");
        button17.setBounds(350, 175, 250, 40);
        button18 = new JButton("");
        button18.setBounds(350, 200, 100, 40);
        button19 = new JButton("");
        button19.setBounds(350, 225, 100, 40);
        button20 = new JButton("");
        button20.setBounds(350, 250, 100, 40);
        button21 = new JButton("");
        button21.setBounds(350, 275, 100, 40);
        button22 = new JButton("");
        button22.setBounds(350, 300, 100, 40);
        button23 = new JButton("");
        button23.setBounds(350, 325, 250, 40);
        button24 = new JButton("");
        button24.setBounds(350, 350, 250, 40);
        button25 = new JButton("");
        button25.setBounds(350, 375, 250, 40);
        button26 = new JButton("");
        button26.setBounds(350, 400, 250, 40);

        button1.setName("0");
        button2.setName("1");
        button3.setName("0");
        button4.setName("1");
        button5.setName("0");
        button6.setName("1");
        button7.setName("0");
        button8.setName("1");
        button9.setName("0");
        button10.setName("1");
        button11.setName("0");
        button12.setName("1");
        button13.setName("0");
        button14.setName("1");
        button15.setName("0");
        button16.setName("1");
        button17.setName("0");
        button18.setName("1");
        button19.setName("0");
        button20.setName("1");
        button21.setName("0");
        button22.setName("1");
        button23.setName("0");
        button24.setName("1");
        button25.setName("0");
        button26.setName("1");



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
        add(button14);
        button14.addActionListener(this);
        add(button15);
        button15.addActionListener(this);
        add(button16);
        button16.addActionListener(this);
        add(button17);
        button17.addActionListener(this);
        add(button18);
        button18.addActionListener(this);
        add(button19);
        button19.addActionListener(this);
        add(button20);
        button20.addActionListener(this);
        add(button21);
        button21.addActionListener(this);
        add(button22);
        button22.addActionListener(this);
        add(button23);
        button23.addActionListener(this);
        add(button24);
        button24.addActionListener(this);
        add(button25);
        button25.addActionListener(this);
        add(button26);
        button26.addActionListener(this);
        setVisible(true);
        getContentPane().add(panel);


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
        button14 = new JButton("");
        button14.setBounds(350, 100, 250, 40);
        button15 = new JButton("");
        button15.setBounds(350, 125, 100, 40);
        button16 = new JButton("");
        button16.setBounds(350, 150, 100, 40);
        button17 = new JButton("");
        button17.setBounds(350, 175, 250, 40);
        button18 = new JButton("");
        button18.setBounds(350, 200, 100, 40);
        button19 = new JButton("");
        button19.setBounds(350, 225, 100, 40);
        button20 = new JButton("");
        button20.setBounds(350, 250, 100, 40);
        button21 = new JButton("");
        button21.setBounds(350, 275, 100, 40);
        button22 = new JButton("");
        button22.setBounds(350, 300, 100, 40);
        button23 = new JButton("");
        button23.setBounds(350, 325, 250, 40);
        button24 = new JButton("");
        button24.setBounds(350, 350, 250, 40);
        button25 = new JButton("");
        button25.setBounds(350, 375, 250, 40);
        button26 = new JButton("");
        button26.setBounds(350, 400, 250, 40);




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
        button14.addActionListener(this);
        add(button15);
        button15.addActionListener(this);
        add(button16);
        button16.addActionListener(this);
        add(button17);
        button17.addActionListener(this);
        add(button18);
        button18.addActionListener(this);
        add(button19);
        button19.addActionListener(this);
        add(button20);
        button20.addActionListener(this);
        add(button21);
        button21.addActionListener(this);
        add(button22);
        button22.addActionListener(this);
        add(button23);
        button23.addActionListener(this);
        add(button24);
        button24.addActionListener(this);
        add(button25);
        button25.addActionListener(this);
        add(button26);
        button26.addActionListener(this);





        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
        panel.add(button12);
        panel.add(button13);
        panel.add(button14);
        panel.add(button15);
        panel.add(button16);
        panel.add(button17);
        panel.add(button18);
        panel.add(button19);
        panel.add(button20);
        panel.add(button22);
        panel.add(button23);
        panel.add(button24);
        panel.add(button25);
        panel.add(button26);
        panel.add(button21);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Test")) {
            System.out.println("Finish");
        }
    }
}