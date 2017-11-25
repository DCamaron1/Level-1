import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseListenerTest implements MouseListener{

	JFrame frame = new JFrame();
	
	public void createUI(){
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		MouseListenerTest bob = new MouseListenerTest();
		bob.createUI();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("1111111");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("2222222");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("33333333");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("444444444");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("55555555");
	}
}
