package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame implements ActionListener {
    JTextArea t;
    JTextArea f1;
    JLabel l;
    JLabel l1;
    JCheckBox ch1 ;
    JCheckBox ch2;
    JButton b1;
    JButton b;
    JButton b2;
    form1(){
       setTitle("Basic GUI program");
        l = new JLabel("Input:");
        l1 = new JLabel("Output:");
        l.setBounds(185,180,100,40);
        l1.setBounds(180,310,100,40);
        b1=new JButton("Exit");//exits from application
        b=new JButton("Change Text");//changes text in f1(substitute goes from textfield t)
        b2=new JButton("Clear All");//clears text in textfield f1
        ch1 = new JCheckBox("Upper Case");
        ch2 = new JCheckBox("Lower Case");
        ch1.setBounds(300,60, 120,50);
        ch2.setBounds(180,60, 120,50);
        b2.setBounds(480,10,90,40);
        b1.setBounds(10,10,90, 40);
        b.setBounds(225,10,120,40);
        t = new JTextArea();
        t.setBounds(225,180,150,120);
        f1 = new JTextArea();
        f1.setBounds(225,310,150,120);
        add(b2);
        add(f1);
        add(t);
        add(b);
        add(l);
        add(l1);
        add(b1);
        add(ch1);
        add(ch2);
        b.addActionListener(this);
        b1.addActionListener(e -> System.exit(0));
        b2.addActionListener(e -> t.setText(null));
        b2.addActionListener(e -> f1.setText(null));
        setSize(600,500);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        var text= t.getText();
        if(ch1.isSelected()){
            f1.setText(text.toUpperCase()+"\n");}
            if(ch2.isSelected()){
            f1.setText(text.toLowerCase()+"\n");}
            if(ch1.isSelected()&&ch2.isSelected()){
                f1.setText(null);
            JOptionPane.showMessageDialog(this,"Choose only one option!!!");
        }
        }
}
