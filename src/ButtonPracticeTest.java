
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonPracticeTest implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton redButton = new JButton();
	JButton greenButton = new JButton();

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setTitle("Button Test");
		panel.setBackground(Color.blue);
		panel.add(greenButton);
		greenButton.addActionListener(this);
		greenButton.setText("Green");
		panel.add(redButton);
		redButton.addActionListener(this);
		redButton.setText("Red");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == redButton) {
			panel.setBackground(Color.red);
		}
		if (buttonPressed == greenButton) {
			panel.setBackground(Color.GREEN);
		}
		
	}

	public static void main(String[] args) {
		ButtonPracticeTest bob = new ButtonPracticeTest();
		bob.createUI();
	}

}

