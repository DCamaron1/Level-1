import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PhotoQuiz {
	public static void main(String[] args) throws Exception {
		Frame quizWindow= new Frame();
		quizWindow.setVisible(true);
		//create image
		Component pictures = createImage("https://i.imgflip.com/10i0g5.jpg");
		quizWindow.add(pictures);
		quizWindow.pack();
		
	}
	private static Component createImage(String URLString) throws MalformedURLException{
		URL link = new URL(URLString);
		ImageIcon picture = new ImageIcon(link);
		JLabel lab = new JLabel(picture);
		return lab;
	}
}
