package ForgottenNamePakiet;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class PanelDG extends JPanel {
	
	Wymiar wymiar = new Wymiar();
	
	public PanelDG(){
		
		setPreferredSize(new Dimension(wymiar.getSzerokosc(),wymiar.getWysokoscPG()));
		setBackground(Color.BLACK);
	}

}
