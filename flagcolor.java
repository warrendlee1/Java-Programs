import java.awt.*;
import javax.swing.*;
public class flagcolor extends JPanel {
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.decode("#FF0000"));
		g.fillRect(0,0,700,100);
		g.setColor(Color.decode("#ffffff"));
		g.fillRect(0, 100, 700, 100);
		g.setColor(Color.decode("#228B22"));
		g.fillRect(0, 200, 700, 100);
		
		g.setColor(Color.black);
		Font font = new Font("Courier", Font.BOLD, 30);
		g.setFont(font);
		g.drawString("National Hungary day!!!!1", 20, 100);
		
	}
}
