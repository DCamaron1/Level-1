import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UselessButton implements ActionListener {
	static JButton britain = new JButton();
	static JFrame france = new JFrame();
	static JPanel japan = new JPanel();

	public static void main(String[] args) {
		france.setVisible(true);
		france.add(japan);
		japan.add(britain);
		japan.setBackground(Color.RED);
		france.setBackground(Color.RED);
		france.setTitle("WW3");
		britain.setText("START WW3");
		france.pack();

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();
		if (buttonPressed == britain) {
			britain.setText("Boom");
			japan.setBackground(Color.BLACK);
		}
		System.out.println("no");
	}
}
