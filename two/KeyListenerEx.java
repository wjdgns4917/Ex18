package com.two;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	private JLabel[]keyMessage; //3���� �޼����� ����� ���̺� ������Ʈ �迭
	
	public KeyListenerEx() {
		setTitle("keyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		//���̺� �迭�� 3�� �����ϰ� �� ���̺� ������Ʈ ����
		keyMessage=new JLabel[3]; //���̺� �迭 ����
		keyMessage[0]=new JLabel(" getkeyCode()  ");
		keyMessage[1]=new JLabel(" getkeyCode()  ");
		keyMessage[2]=new JLabel(" getkeyCode()  ");
		
		//3���� ���̺� ������Ʈ�� ����Ʈ�ҿ� ����
		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); //������ ���̵��� ������ �Ӽ� ����
			keyMessage[i].setBackground(Color.YELLOW); //������ CYAN������ ����
		}
		
		setSize(300,150);
		setVisible(true);
		
		//����Ʈ���� Ű �Է��� ������ �ֵ��� ��Ŀ�� ��������
		c.setFocusable(true);
		c.requestFocus();
	}
	
	//Key ������ ����
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode=e.getKeyCode(); //Ű�ڵ� �˾Ƴ���
			char keyChar=e.getKeyChar(); //Ű���� �� �˾Ƴ���
			keyMessage[0].setText(Integer.toString(keyCode)); //Ű �ڵ� ���
			keyMessage[1].setText(Character.toString(keyChar));;//Ű���� ���
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));;// Ű�̸� ���ڿ� ���
			
			System.out.println("KeyPressed");//�ܼ�â�� �޼ҵ� �̸� ���
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");//�ܼ�â�� �޼ҵ� �̸� ���
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");//�ܼ�â�� �޼ҵ� �̸� ���
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
