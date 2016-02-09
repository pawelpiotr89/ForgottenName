package ForgottenNamePakiet;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Wymiar {
	
	Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    
    private int szerokoscR = screenSize.width;
    private int wysokoscR = screenSize.height;
    
    private double wysokoscPGD = wysokoscR*0.1;
    private int wysokoscPGDINT = (int) wysokoscPGD;
    
    private double wysokoscPS = wysokoscR*0.8;
    private int wysokoscPSINT = (int) wysokoscPS;
    
    private double pozycjaPrzyciskSzerokosc = szerokoscR*0.41;
    private int pozycjaPrzyciskSzerokoscINT = (int) pozycjaPrzyciskSzerokosc;
    
    private double wielkoscCzcionki1 = szerokoscR/15;
    private int wielkoscCzcionki1INT = (int) wielkoscCzcionki1;
    
    private double wielkoscCzcionki2 = szerokoscR/35;
    private int wielkoscCzcionki2INT = (int) wielkoscCzcionki2;
    
    private double wielkoscCzcionki3 = szerokoscR/95;
    private int wielkoscCzcionki3INT = (int) wielkoscCzcionki3;
    
    private double boxOdstep1 = wysokoscR/2.5;
    private int boxOdstep1INT = (int) boxOdstep1;
    
    private double wielkoscCzcionkiMenu = szerokoscR/50;
    private int wielkoscCzcionkiMenuINT = (int) wielkoscCzcionkiMenu;
    
    
    
    public Wymiar(){
    	
    }
    public int getSzerokosc(){
    	
    	return szerokoscR;
    }
    
    public int getWysokosc(){
    	
    	return wysokoscR;
    }
    
    public int getWysokoscPG(){
    	
    	return wysokoscPGDINT;
    }

    public int getWysokoscPS(){
	
    	return wysokoscPSINT;
    }
    
    public int getPozycjaPrzyciskSzerokoscINT(){
    	
    	return pozycjaPrzyciskSzerokoscINT;
    }
    
    public int getwielkoscCzcionki1INT(){
    	
    	return wielkoscCzcionki1INT;   
    }
    
    public int getwielkoscCzcionki2INT(){
    	
    	return wielkoscCzcionki2INT;   
    }
    
    public int getwielkoscCzcionki3INT(){
    	
    	return wielkoscCzcionki3INT;   
    }
    
    public int getwielkoscCzcionkiMenuINT(){
    	
    	return wielkoscCzcionkiMenuINT;   
    }
    
    public int getboxOdstep1INT(){
    	
    	return boxOdstep1INT;   
    }
}
