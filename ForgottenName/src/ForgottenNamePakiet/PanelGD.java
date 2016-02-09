package ForgottenNamePakiet;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class PanelGD extends JPanel {
	
	Wymiar wymiar = new Wymiar();
	
	public PanelGD(){
		
		setPreferredSize(new Dimension(wymiar.getSzerokosc(),wymiar.getWysokoscPG()));
		setBackground(Color.BLACK);
	}
}
