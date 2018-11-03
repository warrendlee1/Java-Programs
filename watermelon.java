import javax.swing.*;
import java.awt.*;

public class watermelon {
	
	public static void main (String[]args) {
		
		JFrame window = new JFrame();
		window.setTitle("watermelon day");
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		watermelonshapes panel = new watermelonshapes();
		Container pane = window.getContentPane();
		pane.add(panel);
		window.setVisible(true);
		window.setBackground(Color.darkGray);
		
	}
}
