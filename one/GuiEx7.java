package com.one;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiEx7 extends JFrame {
	public GuiEx7() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		//P1
		JPanel l1=new JPanel();
		l1.add(new JLabel("수식입력"));
		l1.add(new JTextField("",18));
		l1.setBackground(Color.gray);
		c.add(l1,BorderLayout.NORTH);
		//p2
		JPanel l2=new JPanel();
		l2.setLayout(new GridLayout(4, 4, 3, 3));
		JButton b0=new JButton("0");
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		JButton b6=new JButton("6");
		JButton b7=new JButton("7");
		JButton b8=new JButton("8");
		JButton b9=new JButton("9");
		JButton b10=new JButton("CE");
		JButton b11=new JButton("계산");
		JButton b12=new JButton("+");
		JButton b13=new JButton("-");
		JButton b14=new JButton("x");
		JButton b15=new JButton("/");
		
		l2.add(b0);
		l2.add(b1);
		l2.add(b2);
		l2.add(b3);
		l2.add(b4);
		l2.add(b5);
		l2.add(b6);
		l2.add(b7);
		l2.add(b8);
		l2.add(b9);
		l2.add(b10);
		l2.add(b11);
		l2.add(b12);
		l2.add(b13);
		l2.add(b14);
		l2.add(b15);

		b12.setBackground(new Color(0,150,100)); //버튼색상
		b13.setBackground(new Color(0,150,100)); //버튼색상
		b14.setBackground(new Color(0,150,100)); //버튼색상
		b15.setBackground(new Color(0,150,100)); //버튼색상
		
		c.add(l2,BorderLayout.CENTER);
//		l2.add(new JButton("0"));
//		l2.add(new JButton("1"));
//		l2.add(new JButton("2"));
//		l2.add(new JButton("3"));
//		l2.add(new JButton("4"));
//		l2.add(new JButton("5"));
//		l2.add(new JButton("6"));
//		l2.add(new JButton("7"));
//		l2.add(new JButton("8"));
//		l2.add(new JButton("9"));
//		l2.add(new JButton("CE"));
//		l2.add(new JButton("계산"));
//		l2.add(new JButton("+"));
//		l2.add(new JButton("-"));
//		l2.add(new JButton("x"));
//		l2.add(new JButton("/"));
//		l2.setForeground(Color.BLUE);
		//p3
		JPanel l3=new JPanel();
		l3.add(new JLabel("계산결과"));
		l3.add(new JTextField("",18));
		l3.setBackground(Color.yellow);
		c.add(l3,BorderLayout.SOUTH);
	
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GuiEx7();
	}
}
