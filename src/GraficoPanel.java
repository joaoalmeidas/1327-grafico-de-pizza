import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

import javax.swing.JPanel;

public class GraficoPanel extends JPanel {
	
	private double grauAzul;
	private double grauVermelho;
	private double grauVerde;
	private double grauAmarelo;
	
	private int quantidadeAzul;
	private int quantidadeVermelho;
	private int quantidadeVerde;
	private int quantidadeAmarelo;
	private int quantidadeTotal;
	
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

	public double getGrauAzul() {
		return grauAzul;
	}

	public void setGrauAzul(double grauAzul) {
		this.grauAzul = grauAzul;
	}

	public double getGrauVermelho() {
		return grauVermelho;
	}

	public void setGrauVermelho(double grauVermelho) {
		this.grauVermelho = grauVermelho;
	}

	public double getGrauVerde() {
		return grauVerde;
	}

	public void setGrauVerde(double grauVerde) {
		this.grauVerde = grauVerde;
	}

	public double getGrauAmarelo() {
		return grauAmarelo;
	}

	public void setGrauAmarelo(double grauAmarelo) {
		this.grauAmarelo = grauAmarelo;
	}
	
	
	
	public int getQuantidadeAzul() {
		return quantidadeAzul;

	}

	public void setQuantidadeAzul(int quantidadeAzul) {
		this.quantidadeAzul = quantidadeAzul;
		setQuantidadeTotal(quantidadeAzul);
	}

	public int getQuantidadeVermelho() {
		return quantidadeVermelho;
	}

	public void setQuantidadeVermelho(int quantidadeVermelho) {
		this.quantidadeVermelho = quantidadeVermelho;
		setQuantidadeTotal(quantidadeVermelho);
	}

	public int getQuantidadeVerde() {
		return quantidadeVerde;
	}

	public void setQuantidadeVerde(int quantidadeVerde) {
		this.quantidadeVerde = quantidadeVerde;
		setQuantidadeTotal(quantidadeVerde);
	}

	public int getQuantidadeAmarelo() {
		return quantidadeAmarelo;
	}

	public void setQuantidadeAmarelo(int quantidadeAmarelo) {
		this.quantidadeAmarelo = quantidadeAmarelo;
		setQuantidadeTotal(quantidadeAmarelo);
	}

	public int getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(int quantidadeTotal) {
		this.quantidadeTotal += quantidadeTotal;
		atualizaGrau();
	}
	
	public void atualizaGrau() {
		
		setGrauAzul(360 * getQuantidadeAzul() / getQuantidadeTotal());
		setGrauVermelho(360 * getQuantidadeVermelho() / getQuantidadeTotal());
		setGrauVerde(360 * getQuantidadeVerde() / getQuantidadeTotal());
		setGrauAmarelo(360 * getQuantidadeAmarelo() / getQuantidadeTotal());
		
	}

	
	
}
