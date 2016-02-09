package ForgottenNamePakiet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class PrzyciskEpizod1Next extends JButton {
	
	Wymiar wymiar = new Wymiar();
	
	public PrzyciskEpizod1Next(){
		
		setOpaque(true);
		setBorderPainted(false);
		setEnabled(true);
		setFocusPainted(false);
		setContentAreaFilled(false);
		setText("NEXT");
		setFont(new Font("Tahoma", Font.BOLD, wymiar.getwielkoscCzcionki3INT()));
		setForeground(new Color(255,255,255));
		
		addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(MouseEvent e){
                
                setForeground(new Color(255,170,0));
                
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                
                setForeground(new Color(255,255,255));
                
            }
        });	
		
	}

}
