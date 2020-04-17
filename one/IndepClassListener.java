package com.one;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		
		setTitle("이벤트");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndepClassListener();
	}
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("신호신호");
			//신호받기
			JButton b=(JButton) e.getSource();
//			System.out.println(b.getText());
			if (b.getText().equals("Action")) {
				//b의 Text변경
				b.setText("액션");
			}else {
				b.setText("Action");
			}
//			IndepClassListener.this.setTitle(b.getText());
			setTitle(b.getText());
			
		}
		
	}
	
	
}
//class MyActionListener implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("신호신호");
//		//신호받기
//		JButton b=(JButton) e.getSource();
////		System.out.println(b.getText());
//		if (b.getText().equals("Action")) {
//			//b의 Text변경
//			b.setText("액션");
//		}else {
//			b.setText("Action");
//		}
//		
//	}
//	
//}
