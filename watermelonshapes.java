import javax.swing.*;
import java.awt.*;

public class watermelonshapes extends JPanel {
	
	public void paintComponent(Graphics g) {
		
	g.setColor(Color.decode("#41af34"));
	
	g.fillOval(200,100,200,150);
	g.setColor(Color.decode("#26e02e"));
	
	g.fillOval(20,70,200,150);
	g.setColor(Color.decode("#75e579"));
	
	g.fillOval(400,90,180,150);
	g.setColor(Color.green);
	
	g.fillOval(150,150,220,150);
	g.setColor(Color.red);
	
	g.fillOval(160,155,195,140);
	g.setColor(Color.black);
	
	g.fillOval(207,200,10,10);
	g.fillOval(220,220,10,10);
	g.fillOval(250,210,10,10);
	g.fillOval(280,190,10,10);
	g.fillOval(306,203,10,10);
	g.fillOval(315,260,10,10);
	g.fillOval(270,252,10,10);
	g.fillOval(250,246,10,10);
	g.fillOval(210,181,10,10);
	g.fillOval(195,243,10,10);
	g.fillOval(185,226,10,10);
	
	g.setColor(Color.white);
	Font font = new Font("Courier", Font.BOLD, 30);
	g.setFont(font);
	g.drawString("It's watermelon day!", 20, 400);
	
	}
	
}
