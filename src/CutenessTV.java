import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		CutenessTV tv = new CutenessTV();
		tv.createUI();
	}
	JButton leftButton = new JButton();
	JButton centerButton = new JButton();
	JButton rightButton = new JButton();
	
	public void createUI(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setBackground(Color.blue);
		frame.setSize(500, 500);
		frame.setTitle("Cute TV videos");
		leftButton.setText("Duck");
		leftButton.addActionListener(this);
		panel.add(leftButton);
		centerButton.setText("Frog");
		centerButton.addActionListener(this);
		panel.add(centerButton);
		rightButton.setText("Unicorns");
		rightButton.addActionListener(this);
		panel.add(rightButton);
		frame.pack();
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		//System.out.println(button);
		if (button==leftButton) {
			System.out.println("oh yes");
			showDucks();
		}
		if (button==centerButton){
			showFrog();
		}
		if(button==rightButton){
			showFluffyUnicorns();
		}
	}
	
}
