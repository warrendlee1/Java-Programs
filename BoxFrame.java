import java.awt.*;

import javax.swing.JFrame;

public class BoxFrame {
	public static void main(String[]args) {
		JFrame j1 = new JFrame();
		j1.setTitle("animation");
		j1.setSize(500,500);
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BoxComp panel = new BoxComp();
		Container pane = j1.getContentPane();
		pane.add(panel);
		j1.setVisible(true);
		j1.setBackground(Color.BLUE);
	}
	
}
