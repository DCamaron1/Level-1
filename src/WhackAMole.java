import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame;
	JPanel panel;
	Random generator = new Random();
	
	
	public void createUI() {
		int numGen = generator.nextInt(20 + 1);
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 400);
		for (int i = 1; i <= 20; i++) {
			JButton button = new JButton();		
			button.addActionListener(this);
			panel.add(button);
			if (i == numGen) {
				button.setText("mole");
			}

		}

	}

	public static void main(String[] args) {
		WhackAMole bob = new WhackAMole();
		bob.createUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked.getText().equals("mole")) {
			System.out.println("hi");
		}
		frame.dispose();
	}
}
