package ForgottenNamePakiet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ramka {
	
	Wymiar wymiar = new Wymiar();
	JFrame ramka = new JFrame();
	JPanel panelRamki = new JPanel();
	PanelMenu panelMenu = new PanelMenu();
	Epizod1 epizod1 = new Epizod1();
	
	PrzyciskStart przyciskStart = new PrzyciskStart();
	PrzyciskCredits przyciskCredits = new PrzyciskCredits();
	PrzyciskExit przyciskExit = new PrzyciskExit();
	PrzyciskEpizod1Next przyciskEpizod1Nex = new PrzyciskEpizod1Next();
	PanelGD panelGD = new PanelGD();
	PanelDG panelDG = new PanelDG();
	Thread watek1 = new Thread(panelMenu);
	
	Timer pseudoWatek;
	
	public Ramka(){

		ramka.setPreferredSize(new Dimension(wymiar.getSzerokosc(), wymiar.getWysokosc()));
		ramka.setAlwaysOnTop(true);
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setResizable(false);
		ramka.setTitle("Forgotten_Name");
		ramka.setUndecorated(true);
		ramka.pack();
		ramka.setVisible(true);
		ramka.add(panelRamki);
		
		panelRamki.setPreferredSize(new Dimension(wymiar.getSzerokosc(),wymiar.getWysokosc()));
		panelRamki.setBackground(Color.BLACK);
		panelRamki.setLayout(new BorderLayout(0,3));
		panelRamki.add(panelGD, BorderLayout.NORTH);
		panelRamki.add(panelMenu, BorderLayout.CENTER);
		panelRamki.add(panelDG, BorderLayout.SOUTH);
		
		panelMenu.setLayout(null);
		panelMenu.add(przyciskStart);
		panelMenu.add(przyciskCredits);
		panelMenu.add(przyciskExit);
		
		panelDG.setLayout(null);
		przyciskEpizod1Nex.setBounds(wymiar.getPozycjaPrzyciskSzerokoscINT()*2,30,100,60);
		
		watek1.start();
																// Usuniecie panelu menu i dodanie panelu epizodu 1
		przyciskStart.addActionListener(new ActionListener(){
			
		     public void actionPerformed(ActionEvent e){
		    	 
		    	 panelRamki.remove(panelMenu);
		    	 panelRamki.add(epizod1);
		    	 watek1.interrupt();
		    	 ramka.revalidate();
		    	 ramka.repaint();
		    	 panelMenu.audioStop();
		    	 epizod1.timer.start();
		    	 
		    	 
		     }
		});
																// W³asny kursor w ramce
		panelRamki.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseEntered(MouseEvent f){
        	
        	Toolkit toolkit = Toolkit.getDefaultToolkit();
        	Image image = toolkit.getImage("src\\ForgottenNamePakiet\\kursor.png");
        	Cursor a = toolkit.createCustomCursor(image , new Point(ramka.getX(),ramka.getY()), "");
        	panelRamki.setCursor (a);
              
        }
    });	
																//dodanie przycisku next na dolnym pasku
		ActionListener actionListenerP = new ActionListener() {
			 
			public void actionPerformed(ActionEvent actionEvent) {
		    	  
		      
		if(epizod1.timer.isRunning() == true & epizod1.colorZ == 244){
			
			panelDG.add(przyciskEpizod1Nex);
			panelDG.revalidate();
			panelDG.repaint();
			pseudoWatek.stop();
			
			}
			}
		};
		
		pseudoWatek =  new Timer(1, actionListenerP);
		pseudoWatek.start();
	}
}
