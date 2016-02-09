package ForgottenNamePakiet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Epizod1 extends JPanel {
	
	Wymiar wymiar = new Wymiar();
	JLabel episod1 = new JLabel();
	JLabel cytat1 = new JLabel();
	JLabel autor1 = new JLabel();
	
	int colorX = 0;
	int colorY = 0;
	int colorZ = 0;
	int czas = 0;
	
	Timer timer;
	
	public Epizod1(){
																						//tworzenie konstruktora epizodu 1
		setPreferredSize(new Dimension(wymiar.getSzerokosc(),wymiar.getWysokoscPS()));
		setLayout((LayoutManager) new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.BLACK);
		
		episod1.setFont(new Font("Tahoma", Font.BOLD, wymiar.getwielkoscCzcionki1INT()));
		episod1.setBackground(Color.BLACK);
		episod1.setForeground(new Color(0,0,0));
		episod1.setAlignmentX(CENTER_ALIGNMENT);
		episod1.setText("EPISODE   1");
		
		cytat1.setFont(new Font("Tahoma", Font.BOLD, wymiar.getwielkoscCzcionki2INT()));
		cytat1.setBackground(Color.BLACK);
		cytat1.setForeground(new Color(0,0,0));
		cytat1.setText("'We forget old stories, but those stories remain the same.'");
		cytat1.setAlignmentX(CENTER_ALIGNMENT);
		
		autor1.setFont(new Font("Tahoma", Font.BOLD, wymiar.getwielkoscCzcionki3INT()));
		autor1.setBackground(Color.BLACK);
		autor1.setForeground(new Color(0,0,0));
		autor1.setText("- Dejan Stojanovic, The Sun Watches The Sun");
		autor1.setAlignmentX(CENTER_ALIGNMENT);
		
		add(episod1);
		add(Box.createRigidArea(new Dimension(wymiar.getSzerokosc(),wymiar.getboxOdstep1INT())));
		add(cytat1);
		add(autor1);
																						//tworzenie efektu pojawiajacych sie zdañ
		ActionListener actionListener = new ActionListener() {
			 
		      public void actionPerformed(ActionEvent actionEvent) {
		    	 
		   
		    	 if(colorX == 0 || colorX < 255){
		    		 
		    		 colorX++;
		    		 episod1.setForeground(new Color(colorX,colorX,colorX));
		    		 
		    		 
		    	 	}
		    	 
		    	 if(colorX == 255 & colorY<255){
		    	
		    		 colorY++;	 
		    		 cytat1.setForeground(new Color(colorY,colorY,colorY));
		    		 
		    		 
		    	 	}
		    		 
		    	 if(colorY == 255 & colorZ<255){
		    		
		    		 colorZ++;	 
		    		 autor1.setForeground(new Color(colorZ,colorZ,colorZ));
		    		 
		    		  
		    	 	}
		    	 if(colorZ == 255){
		    		 
		    		 timer.stop();
		    		
		    	 }
		      }
		    };
		    
		    timer =  new Timer(21, actionListener);
					
	}
}

