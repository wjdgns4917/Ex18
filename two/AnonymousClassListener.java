package com.two;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {
	
	public AnonymousClassListener() {
		setTitle("익명클래스 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton) e.getSource();
				if (b.getText().equals("Action")) {
					b.setText("액션");
				}
				else
					b.setText("Action");
		
				setTitle(b.getText());	
			}
		});
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonymousClassListener();
	}
}
