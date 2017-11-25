import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyListenerTest implements KeyListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
	public void createUI(){
		frame.setVisible(true);
		frame.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		KeyListenerTest bob = new KeyListenerTest();
		bob.createUI();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("helloooo");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hhhhhhhhhhhhhhhhhhh");
	}

}
