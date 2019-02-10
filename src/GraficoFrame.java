import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraficoFrame extends JFrame{

	private JTextField fieldAzul;
	private JTextField fieldVermelho;
	private JTextField fieldVerde;
	private JTextField fieldAmarelo;
	
	private JLabel labelAzul;
	private JLabel labelVermelho;
	private JLabel labelVerde;
	private JLabel labelAmarelo;
	
	private JPanel panelQuantidades;
	private GraficoPanel panelGrafico;
	
	public GraficoFrame() {
		
		panelQuantidades = new JPanel(new FlowLayout());
		panelGrafico = new GraficoPanel();
		
		fieldAzul = new JTextField(3);
		fieldVermelho = new JTextField(3);
		fieldVerde = new JTextField(3);
		fieldAmarelo = new JTextField(3);
		
		labelAzul = new JLabel("Azul");
		labelVermelho = new JLabel("Vermelho");
		labelVerde = new JLabel("Verde");
		labelAmarelo = new JLabel("Amarelo");
		
		panelQuantidades.add(labelAzul);
		panelQuantidades.add(fieldAzul);
		panelQuantidades.add(labelVermelho);
		panelQuantidades.add(fieldVermelho);
		panelQuantidades.add(labelVerde);
		panelQuantidades.add(fieldVerde);
		panelQuantidades.add(labelAmarelo);
		panelQuantidades.add(fieldAmarelo);
		
		add(panelQuantidades, BorderLayout.NORTH);
		add(panelGrafico);
		
		
		
	}
	
}
