import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton convert = new JButton();
	JTextField text = new JTextField(15);
	JLabel label = new JLabel();
	
	private void createUI(){
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(350, 200);
		panel.add(label);
		label.setText("Input a number between 1 and 15");
		panel.add(text);
		panel.add(convert);
		convert.addActionListener(this);
		convert.setText("Convert");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed== convert){
			String input = text.getText();
			int number = Integer.parseInt(input);
			System.out.println(number);
			
		}
	}
	
	public static void main(String[] args) {
		BinaryConverter bob = new BinaryConverter();
		//bob.createUI();
		int number = 9;
		int eightsDigit = number/8;
		number= number-8*eightsDigit;
		System.out.print(number);

		int fourthsDigit = number/4;
		number= number-4*fourthsDigit;
		System.out.print(number);

		int twosDigit = number/2;
		number = number-2*twosDigit;
		System.out.print(number);

		int onesDigit = number/1;
		number = number-1*onesDigit;
		System.out.print(number);
		
		
		
		
	}
}
