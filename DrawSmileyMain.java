/*
 * the main of a smiley emoji
 */

import javax.swing.JFrame;

public class DrawSmileyMain {

	public static void main(String[] args) {
		DrawSmiley panel = new DrawSmiley();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);
		

	}

}
