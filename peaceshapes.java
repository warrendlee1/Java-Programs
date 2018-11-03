import javax.swing.*;
import java.awt.*;

public class peaceshapes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.blue);
		g.drawOval(100, 100, 200, 200);
		g.drawLine(200, 100, 200, 300);
		g.drawLine(200, 220, 130, 270);
		g.drawLine(200, 220, 270, 270);
		
		g.setColor(Color.red);
		g.drawOval(105, 100, 200, 200);
		g.drawLine(205, 100, 205, 300);
		g.drawLine(205, 220, 135, 270);
		g.drawLine(205, 220, 275, 270);
		
		g.setColor(Color.green);
		g.drawOval(110, 100, 200, 200);
		g.drawLine(210, 100, 210, 300);
		g.drawLine(210, 220, 140, 270);
		g.drawLine(210, 220, 280, 270);
		
		g.setColor(Color.yellow);
		g.drawOval(115, 100, 200, 200);
		g.drawLine(215, 100, 215, 300);
		g.drawLine(215, 220, 145, 270);
		g.drawLine(215, 220, 285, 270);
		
		g.setColor(Color.white);
		Font font = new Font("Courier", Font.BOLD, 30);
		g.setFont(font);
		g.drawString("WARREN PEACE", 100, 400);
		
	}
	
}
