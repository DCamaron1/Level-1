import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BotOrNot implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton leftButton = new JButton();
	JButton centerButton = new JButton();
	JButton rightButton = new JButton();

	public void createUI() throws MalformedURLException {
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.add(panel);
		panel.add(leftButton);
		leftButton.addActionListener(this);
		panel.add(centerButton);
		centerButton.addActionListener(this);
		panel.add(rightButton);
		rightButton.addActionListener(this);
		JLabel road = createLabelImage("road.jpg");
		leftButton.add(road);
		JLabel car = createLabelImage("carRoad.jpg");
		rightButton.add(car);
		JLabel car2 = createLabelImage("carRoad2.jpg");
		centerButton.add(car2);
		JOptionPane.showMessageDialog(null,"Click the button without a car");
		
		frame.pack();
	}

	public static void main(String[] args) throws MalformedURLException {
		BotOrNot bot = new BotOrNot();
		bot.createUI();

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("hi");
		JButton buttonPressed = (JButton)e.getSource();
		if (leftButton==buttonPressed) {
			JOptionPane.showMessageDialog(null,"You're not a robot!");
		}
		else{
			JOptionPane.showMessageDialog(null, "You're a robot! You can't pass");
		}
	}

}
