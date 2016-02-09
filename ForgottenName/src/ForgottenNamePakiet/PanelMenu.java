package ForgottenNamePakiet;

import java.applet.AudioClip;
import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;

public class PanelMenu extends JPanel implements Runnable {
	
	Wymiar wymiar = new Wymiar();
	
	transient ArrayList<BufferedImage> deszcz = new ArrayList<BufferedImage>();
	
	File audioFile = new File("src\\ForgottenNamePakiet\\deszcz1.wav");
	private Clip audioClip;
	
	private BufferedImage image,image1, image2, image3, image4, image5, image6, image7, image8, image9, image10,
						  imageDeszcz;
	float opacity = 0.7f;
	
	public PanelMenu(){
		
		setPreferredSize(new Dimension(wymiar.getSzerokosc(),wymiar.getWysokoscPS()));
		              
		      try {
		    	  image = ImageIO.read(new File("src\\ForgottenNamePakiet\\panelGlowny.png"));
			
		    	  image1 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz1n.png"));
		    	  image2 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz2n.png"));
		    	  image3 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz3n.png"));
		    	  image4 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz4n.png"));
		    	  image5 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz5n.png"));
		    	  image6 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz6n.png"));
		    	  image7 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz7n.png"));
		      	  image8 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz8n.png"));
		      	  image9 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz9n.png"));
		          image10 = ImageIO.read(new File("src\\ForgottenNamePakiet\\deszcz10n.png"));
		      
		      } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      
		      	deszcz.add(image1);
		      	deszcz.add(image2);
		      	deszcz.add(image3);
		      	deszcz.add(image4);
		      	deszcz.add(image5);
		      	deszcz.add(image6);
		      	deszcz.add(image7);
		      	deszcz.add(image8);
		      	deszcz.add(image9);
		      	deszcz.add(image10);
		
		      																			//zapetlenie dzwieku deszczu w menu
			try {
				
			  AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
		      AudioFormat format = audioStream.getFormat();
		      DataLine.Info info = new DataLine.Info(Clip.class, format);
		      audioClip = (Clip) AudioSystem.getLine(info);
		      audioClip.open(audioStream);
		      audioClip.loop(Clip.LOOP_CONTINUOUSLY);
		      
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
																	//nowy watek do animacji deszczu i kropli
		@Override
		public void run() {
			try {
				
				while(true) {
					
					for(BufferedImage deszczyk : deszcz){
						
						imageDeszcz = deszczyk;
						repaint();
						Thread.sleep(85);
						
					}	
						
				}
				
			}
			catch (InterruptedException e) {
				
				Thread.currentThread().interrupt();
			    return;	
			}
		
		}	
		
		@Override													//rysowanie tla i deszczu
		protected void paintComponent(Graphics g){
	       
			Graphics2D g2D = (Graphics2D) g;
	       
	        g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC, opacity));
	        g2D.drawImage(image, 0, 0, wymiar.getSzerokosc(),wymiar.getWysokoscPS(), this);
	        g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, opacity));
	        g2D.drawImage(imageDeszcz, 0, 0, wymiar.getSzerokosc(),wymiar.getWysokoscPS(), this);
	        }
		
		 public void audioStop(){
			 
			 audioClip.stop();
		            
		} 
}

