import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestRiddle implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JTextField text = new JTextField(10);
	
	public void CreateGUI(){
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(330, 150);
		frame.setTitle("Riddles");
		panel.add(label1);
		panel.add(label2);
		label1.setText("What has a head, a tail, is brown, and has no legs?");
		label2.setText("Answer: ");
		panel.add(text);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button1.setText("Submit");
		button2.addActionListener(this);
		button2.setText("Help, I need a hint");
		
	}
	
	public static void main(String[] args) {
		TestRiddle bob = new TestRiddle();
		bob.CreateGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String userAnswer= text.getText();
		if (button1==buttonPressed){
			if(userAnswer.equalsIgnoreCase("penny") || userAnswer.equalsIgnoreCase("a penny")){
				JOptionPane.showMessageDialog(null, "Correct!");
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(null, "Incorrect. Try again.");
			}
		}
		if(button2==buttonPressed){
			JOptionPane.showMessageDialog(null, "I am carried in a pocket.");
		}
	}
}
