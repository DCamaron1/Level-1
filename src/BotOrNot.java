import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotOrNot implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton leftButton = new JButton();
	JButton centerButton = new JButton();
	JButton rightButton = new JButton();
	
	public void createUI(){
		frame.setVisible(true);
		frame.setSize(600,600);
		frame.add(panel);
		frame.add(leftButton);
		frame.add(centerButton);
		frame.add(rightButton);
		
	}
	
	public static void main(String[] args) {
		BotOrNot bot = new BotOrNot();
		bot.createUI();
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
