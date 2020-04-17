package com.one;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTest extends JFrame{
	
	public PanelTest() {
		
		setTitle("My First Swing Example");
		
		//Panel 1
		JPanel p1=new JPanel();
		p1.setLayout(new FlowLayout());
		
		JLabel lu=new JLabel("User");
		JTextField tu=new JTextField("tu",12);
		JLabel lp=new JLabel("Pass");
		JTextField tp=new JTextField("tp",12);
		JButton btn=new JButton("Login");
		p1.add(lu);
		p1.add(tu);
		p1.add(lp);
		p1.add(tp);
		p1.add(btn);
		p1.setBackground(Color.green);
		
		//Panel 1
		JPanel p2=new JPanel();
		p2.setLayout(new FlowLayout());
		
		JLabel lu2=new JLabel("User");
		JTextField tu2=new JTextField("tu",12);
		JLabel lp2=new JLabel("Pass");
		JTextField tp2=new JTextField("tp",12);
		JButton btn2=new JButton("Login");
		p2.add(lu2);
		p2.add(tu2);
		p2.add(lp2);
		p2.add(tp2);
		p2.add(btn2);
		p2.setBackground(Color.red);
		
		//Panel 3
		JPanel p3=new JPanel();
		p3.setLayout(new FlowLayout());
		
		JLabel lu3=new JLabel("User");
		JTextField tu3=new JTextField("tu",12);
		JLabel lp3=new JLabel("Pass");
		JTextField tp3=new JTextField("tp",12);
		JButton btn3=new JButton("Login");
		p3.add(lu3);
		p3.add(tu3);
		p3.add(lp3);
		p3.add(tp3);
		p3.add(btn3);
		p3.setBackground(Color.yellow);
			
		Container c=getContentPane();
		c.setLayout(new GridLayout(0, 3));
		
		add(p1);
		add(p2);
		add(p3);
		
		setSize(600, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new PanelTest();
	}
}
