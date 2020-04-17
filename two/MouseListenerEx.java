package com.two;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame{
	private JLabel la=new JLabel("Hello");
	
	public MouseListenerEx() {
		setTitle("MouseListener");
		
		Container c=getContentPane();
		c.addMouseListener(new MyMouseListner());
		
		c.setLayout(null);
		
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
	
		setSize(250,250);
		setVisible(true);
	}
	class MyMouseListner implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			//더블클릭
			System.out.println(e.getClickCount());
			if (e.getClickCount()==2) {
				System.out.println("더블클릭");
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x, y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("신호신호");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}
