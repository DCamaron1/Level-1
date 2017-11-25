import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton convert = new JButton();
	JButton ok = new JButton();
	JTextField text = new JTextField(15);
	JLabel label = new JLabel();
	JLabel labels = new JLabel();

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(350, 200);
		panel.add(label);
		label.setText("Input a input between 1 and 15");
		panel.add(text);
		panel.add(convert);
		panel.add(labels);
		convert.addActionListener(this);
		convert.setText("Convert");
		panel.add(ok);
		ok.setText("ok");
		ok.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == convert) {
			String answer = text.getText();
			int input = Integer.parseInt(answer);
			
			
			int eightsDigit = input / 8;
			input = input - 8 * eightsDigit;
			

			int fourthsDigit = input / 4;
			input = input - 4 * fourthsDigit;
			

			int twosDigit = input / 2;
			input = input - 2 * twosDigit;
			

			int onesDigit = input / 1;
			input = input - 1 * onesDigit;
			
			//System.out.println();
			panel.setBackground(Color.GREEN);
			labels.setText("The number is: " + eightsDigit + fourthsDigit + twosDigit + onesDigit);
		}
		if(buttonPressed==ok){
			frame.dispose();
		}
	}

	public static void main(String[] args) {
		BinaryConverter bob = new BinaryConverter();
		bob.createUI();

	}
}
