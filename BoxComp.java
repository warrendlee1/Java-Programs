import java.awt.*;
public class BoxComp extends Canvas implements Runnable {
	Rectangle r1;
	int framespersecond = 144;
	double speed = 5;
	double dx = speed, dy = speed-1;
	
	
	
	public BoxComp() {
		r1 = new Rectangle(0,0,100,100);
		
		Thread t1 = new Thread(this);
		t1.start();
		
	}
	public void paint(Graphics g) {
		//move
		r1.translate((int)dx, (int)dy);
		
		double xpos = r1.getX();
		double ypos = r1.getY();
		
		if (xpos > 400 || xpos < 0) {dx = -dx;}
		if (ypos > 400 || ypos < 0) {dy = -dy;}
		//draw
		Graphics2D win = (Graphics2D) g;
		win.setColor(Color.BLACK);
		win.fill(r1);
	}
	
	
	@Override
	public void run() {		
		while(true) {
			
			try {
				Thread.sleep(1000/this.framespersecond);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			repaint();
			
		}
		
		
		
	}
}
