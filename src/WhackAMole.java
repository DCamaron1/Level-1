import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame;
	JPanel panel;
	Random generator = new Random();
	int count;
	Date gameStart = new Date();
	long start = gameStart.getTime();
	
	public void createUI() {
		int numGen = generator.nextInt(19 + 1);
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		panel.setBackground(Color.blue);
		frame.setSize(400, 300);
		for (int i = 1; i <= 20; i++) {
			JButton button = new JButton();
			frame.setBackground(Color.white);
			button.addActionListener(this);
			panel.add(button);
			if (i == numGen) {
				button.setText("mole");
			}
		//frame.setBackground(Color.RED);
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
			count++;
			frame.dispose();
			createUI();
		}
		else{
			frame.dispose();
			createUI();
			
		}
		if (count == 10) {
			Date gameEnd= new Date(); 
			long end = gameEnd.getTime();
			double time = (end - start)/1000.0; 
			frame.dispose();
			JOptionPane.showMessageDialog(null, "You took " + time + " seconds to whack 10 moles.");
		}

	}
}
