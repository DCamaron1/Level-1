import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton left = new JButton();
	JButton middleLeft = new JButton();
	JButton middleRight = new JButton();
	JButton right = new JButton();

	public void CreateGUI() {
		frame.add(panel);
		frame.setTitle("Color Teacher");
		frame.setVisible(true);
		panel.add(left);
		panel.add(middleLeft);
		panel.add(middleRight);
		panel.add(right);
		left.addActionListener(this);
		middleLeft.addActionListener(this);
		middleRight.addActionListener(this);
		right.addActionListener(this);
		left.setBackground(Color.yellow);
		left.setOpaque(true);
		middleLeft.setBackground(Color.red);
		middleLeft.setOpaque(true);
		middleRight.setBackground(Color.blue);
		middleRight.setOpaque(true);
		right.setBackground(Color.green);
		right.setOpaque(true);
		frame.pack();
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Test bob = new Test();
		bob.CreateGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (left == buttonPressed) {
			speak("yellow");
		}
		if (middleLeft == buttonPressed) {
			speak("red");
		}
		if (middleRight == buttonPressed) {
			speak("blue");
		}
		if (right == buttonPressed) {
			speak("green");
		}
	}
}
