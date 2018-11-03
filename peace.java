import javax.swing.*;
import java.awt.*;

public class peace {
	public static void main (String[]args) {
		
		JFrame window = new JFrame();
		window.setTitle("peace day");
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		peaceshapes panel = new peaceshapes();
		Container pane = window.getContentPane();
		pane.add(panel);
		window.setVisible(true);
		window.setBackground(Color.lightGray);
		
		
	}
}
