package ForgottenNamePakiet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class PrzyciskStart extends JButton {
	
	Wymiar wymiar = new Wymiar();
	
	public PrzyciskStart(){
		
		setOpaque(true);
		setBorderPainted(false);
		setEnabled(true);
		setFocusPainted(false);
		setContentAreaFilled(false);
		setText("START STORY");
		setFont(new Font("Tahoma", Font.BOLD, wymiar.getwielkoscCzcionkiMenuINT()));
		setForeground(new Color(255,255,255));
		setBounds(wymiar.getPozycjaPrzyciskSzerokoscINT(),50,315,60);
		
	addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(MouseEvent e){
                
                setForeground(new Color(0,0,0));
                
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                
                setForeground(new Color(255,255,255));
                
            }
        });		
	}
}
