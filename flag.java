import javax.swing.*;
import java.awt.*;

public class flag {
	
	public static void main(String[]args) {
		JFrame window = new JFrame();
		window.setTitle("flag");
		window.setSize(500,300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		flagcolor panel = new flagcolor();
		Container pane = window.getContentPane();
		pane.add(panel);
		window.setVisible(true);
		window.setBackground(Color.darkGray);
	}

}
