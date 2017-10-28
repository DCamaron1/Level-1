import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Matrix implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton redButton = new JButton();
	JButton blueButton = new JButton();
	
	public void createUI(){
		frame.add(panel);
		panel.add(redButton);
		panel.add(blueButton);
		frame.setVisible(true);
		frame.setSize(600, 400);
		redButton.addActionListener(this);
		blueButton.addActionListener(this);
		redButton.setText("Red");
		blueButton.setText("Blue");
		//frame.pack();
	}
	
	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		matrix.createUI();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (redButton==buttonPressed) {
			System.out.println("This is red");
			panel.setBackground(Color.blue);
		}
		if(blueButton==buttonPressed){
			System.out.println("This is blue");
			panel.setBackground(Color.red);
		}
	}
	
}
