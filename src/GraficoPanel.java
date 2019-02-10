import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

import javax.swing.JPanel;

public class GraficoPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		
		g.setColor(Color.RED);
		g2d.fill(new Arc2D.Double(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2, 0, 90, Arc2D.PIE));
		
		g.setColor(Color.BLUE);
		g2d.fill(new Arc2D.Double(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2, 90, 90, Arc2D.PIE));
		
		g.setColor(Color.GREEN);
		g2d.fill(new Arc2D.Double(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2, 180, 90, Arc2D.PIE));
		
		g.setColor(Color.YELLOW);
		g2d.fill(new Arc2D.Double(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2, 270, 90, Arc2D.PIE));
	}
	
}
