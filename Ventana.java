import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.FlowLayout;

public class Ventana {

	private int contador = 0;
	
	private JFrame frame;
	private Timer cronometroTimer;
	private long startTime;
	private int pacX = 335, pacY = 250, speed = 16;   
	public Element pacman = new Element(pacX, pacY, 30, 30, Color.YELLOW);
	public Element pared1 = new Element(10, 10, 590, 15, Color.decode("#FFFFFF"));
	public Element pared2 = new Element(645, 10, 590, 15, Color.decode("#FFFFFF")); 
	public Element pared3 = new Element(10, 10, 15, 300, Color.decode("#FFFFFF")); 
	public Element pared4 = new Element(390, 10, 15, 260, Color.decode("#FFFFFF")); 
	public Element pared5 = new Element(10, 590, 15, 300, Color.decode("#FFFFFF")); 
	public Element pared6 = new Element(390, 590, 15, 270, Color.decode("#FFFFFF"));
	public Element pared7 = new Element(270, 290, 15, 160, Color.decode("#FFFFFF"));
	public Element pared8 = new Element(415, 200, 100, 15, Color.decode("#FFFFFF"));
	public Element pared9 = new Element(270, 200, 100, 15, Color.decode("#FFFFFF"));
	public Element pared10 = new Element(380, 200, 15, 35, Color.decode("#FFFFFF"));
	public Element pared11 = new Element(285, 200, 15, 35, Color.decode("#FFFFFF"));//
	public Element pared12 = new Element(190, 390, 15, 300, Color.decode("#FFFFFF"));//
	public Element pared13 = new Element(190, 110, 15, 300, Color.decode("#FFFFFF"));//
	public Element pared14 = new Element(190, 405, 35, 15, Color.decode("#FFFFFF"));//
	public Element pared15 = new Element(475, 405, 35, 15, Color.decode("#FFFFFF"));//
	public Element pared16 = new Element(190, 75, 35, 15, Color.decode("#FFFFFF"));//
	public Element pared17 = new Element(475, 75, 35, 15, Color.decode("#FFFFFF"));//
	public Element pared18 = new Element(270, 60, 15, 160, Color.decode("#FFFFFF"));//
	public Element pared19 = new Element(100, 460, 65, 15, Color.decode("#FFFFFF"));//
	public Element pared20 = new Element(550, 460, 65, 15, Color.decode("#FFFFFF"));//
	public Element pared21 = new Element(100, 510, 15, 460, Color.decode("#FFFFFF"));//
	public Element pared22 = new Element(250, 450, 15, 180, Color.decode("#FFFFFF"));//
	public Element pared23 = new Element(100, 160, 230, 15, Color.decode("#FFFFFF"));//
	public Element pared24 = new Element(550, 160, 230, 15, Color.decode("#FFFFFF"));//
	public Element pared25 = new Element(475, 180, 210, 15, Color.decode("#FFFFFF"));//
	public Element pared26 = new Element(190, 180, 210, 15, Color.decode("#FFFFFF"));//
	public Element pared27 = new Element(100, 60, 45, 15, Color.decode("#FFFFFF"));//
	public Element pared28 = new Element(550, 60, 45, 15, Color.decode("#FFFFFF"));
	public Element pared29 = new Element(270, 290, 15, 160, Color.decode("#FFFFFF"));
	public Element pared30 = new Element(270, 290, 15, 160, Color.decode("#FFFFFF"));

	public Element pared31 = new Element(335, 2, 15, 30, Color.decode("#383838"));
	public Element pared32 = new Element(335, 600, 15, 30, Color.decode("#383838"));
	
	public Element punto1 = new Element(70, 40, 6, 6, Color.decode("#FFFFFF"));
	public Element punto2 = new Element(70, 80, 6, 6, Color.decode("#FFFFFF"));
	public Element punto3 = new Element(70, 120, 6, 6, Color.decode("#FFFFFF"));
	public Element punto4 = new Element(70, 160, 6, 6, Color.decode("#FFFFFF"));
	public Element punto5 = new Element(70, 200, 6, 6, Color.decode("#FFFFFF"));
	public Element punto6 = new Element(70, 240, 6, 6, Color.decode("#FFFFFF"));
	public Element punto7 = new Element(70, 280, 6, 6, Color.decode("#FFFFFF"));
	public Element punto8 = new Element(70, 320, 6, 6, Color.decode("#FFFFFF"));
	public Element punto9 = new Element(70, 360, 6, 6, Color.decode("#FFFFFF"));
	public Element punto10 = new Element(70, 400, 6, 6, Color.decode("#FFFFFF"));
	public Element punto11 = new Element(70, 440, 6, 6, Color.decode("#FFFFFF"));
	public Element punto12 = new Element(70, 480, 6, 6, Color.decode("#FFFFFF"));
	public Element punto13 = new Element(70, 520, 6, 6, Color.decode("#FFFFFF"));
	public Element punto14 = new Element(70, 560, 6, 6, Color.decode("#FFFFFF"));
	
	public Element punto15 = new Element(160, 40, 6, 6, Color.decode("#FFFFFF"));
	public Element punto16 = new Element(160, 80, 6, 6, Color.decode("#FFFFFF"));
	public Element punto17 = new Element(160, 120, 6, 6, Color.decode("#FFFFFF"));
	public Element punto18 = new Element(160, 160, 6, 6, Color.decode("#FFFFFF"));
	public Element punto19 = new Element(160, 200, 6, 6, Color.decode("#FFFFFF"));
	public Element punto20 = new Element(160, 240, 6, 6, Color.decode("#FFFFFF"));
	public Element punto21 = new Element(160, 280, 6, 6, Color.decode("#FFFFFF"));
	public Element punto22 = new Element(160, 320, 6, 6, Color.decode("#FFFFFF"));
	public Element punto23 = new Element(160, 360, 6, 6, Color.decode("#FFFFFF"));
	public Element punto24 = new Element(160, 400, 6, 6, Color.decode("#FFFFFF"));
	public Element punto25 = new Element(160, 440, 6, 6, Color.decode("#FFFFFF"));
	public Element punto26 = new Element(160, 480, 6, 6, Color.decode("#FFFFFF"));
	public Element punto27 = new Element(160, 520, 6, 6, Color.decode("#FFFFFF"));
	public Element punto28 = new Element(160, 560, 6, 6, Color.decode("#FFFFFF"));
	
	public Element punto29 = new Element(520, 40, 6, 6, Color.decode("#FFFFFF"));
	public Element punto30 = new Element(520, 80, 6, 6, Color.decode("#FFFFFF"));
	public Element punto31 = new Element(520, 120, 6, 6, Color.decode("#FFFFFF"));
	public Element punto32 = new Element(520, 160, 6, 6, Color.decode("#FFFFFF"));
	public Element punto33 = new Element(520, 200, 6, 6, Color.decode("#FFFFFF"));
	public Element punto34 = new Element(520, 240, 6, 6, Color.decode("#FFFFFF"));
	public Element punto35 = new Element(520, 280, 6, 6, Color.decode("#FFFFFF"));
	public Element punto36 = new Element(520, 320, 6, 6, Color.decode("#FFFFFF"));
	public Element punto37 = new Element(520, 360, 6, 6, Color.decode("#FFFFFF"));
	public Element punto38 = new Element(520, 400, 6, 6, Color.decode("#FFFFFF"));
	public Element punto39 = new Element(520, 440, 6, 6, Color.decode("#FFFFFF"));
	public Element punto40 = new Element(520, 480, 6, 6, Color.decode("#FFFFFF"));
	public Element punto41 = new Element(520, 520, 6, 6, Color.decode("#FFFFFF"));
	public Element punto42 = new Element(520, 560, 6, 6, Color.decode("#FFFFFF"));
	
	public Element punto43 = new Element(600, 40, 6, 6, Color.decode("#FFFFFF"));
	public Element punto44 = new Element(600, 80, 6, 6, Color.decode("#FFFFFF"));
	public Element punto45 = new Element(600, 120, 6, 6, Color.decode("#FFFFFF"));
	public Element punto46 = new Element(600, 160, 6, 6, Color.decode("#FFFFFF"));
	public Element punto47 = new Element(600, 200, 6, 6, Color.decode("#FFFFFF"));
	public Element punto48 = new Element(600, 240, 6, 6, Color.decode("#FFFFFF"));
	public Element punto49 = new Element(600, 280, 6, 6, Color.decode("#FFFFFF"));
	public Element punto50 = new Element(600, 320, 6, 6, Color.decode("#FFFFFF"));
	public Element punto51 = new Element(600, 360, 6, 6, Color.decode("#FFFFFF"));
	public Element punto52 = new Element(600, 400, 6, 6, Color.decode("#FFFFFF"));
	public Element punto53 = new Element(600, 440, 6, 6, Color.decode("#FFFFFF"));
	public Element punto54 = new Element(600, 480, 6, 6, Color.decode("#FFFFFF"));
	public Element punto55 = new Element(600, 520, 6, 6, Color.decode("#FFFFFF"));
	public Element punto56 = new Element(600, 560, 6, 6, Color.decode("#FFFFFF"));
	
	public Element puntox= new Element(6000, 6000, 0, 0, Color.decode("#FFFFFF"));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 715);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JPanel tablero = new JPanel();
		tablero.setBackground(new Color(1, 13, 116));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		
		
		
		JLabel score2 = new JLabel("Score: "+contador);
		score2.setFont(new Font("Arcade Interlaced", Font.PLAIN, 25));
		panel.add(score2);
		
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setForeground(new Color(0, 0, 0));
		reiniciar.setBackground(new Color(249, 249, 249));
		reiniciar.setFont(new Font("Arcade Normal", Font.PLAIN, 28));
		panel.add(reiniciar);
		
		
		JLabel tiempo1 = new JLabel("Tiempo:");
		tiempo1.setFont(new Font("Arcade Interlaced", Font.PLAIN, 25));
		panel.add(tiempo1);
		
		JLabel tiempo2 = new JLabel("00");
		tiempo2.setFont(new Font("Arcade Interlaced", Font.PLAIN, 23));
		panel.add(tiempo2);
		
		
		
		
				//////cronometro
					cronometroTimer = new Timer(1000, new ActionListener() {
			            public void actionPerformed(ActionEvent e) {
			            	long elapsedTime = System.currentTimeMillis() - startTime;
			                int segundos = (int) ((elapsedTime / 1000) % 60);
			                tiempo2.setText(String.format("%02d", segundos));
			            }
			        });
					 startTime = System.currentTimeMillis();
				        cronometroTimer.start();
		//////////////////////////////////////////////////////////
		
		tablero.add(new MyGraphics());
		tablero.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		///////////reinicio
		reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame, "Score: "+contador);
				 Ventana ventana = new Ventana();
					frame.setVisible(false);
					ventana.main (null);
			}});
		
		
		
		//////////////////////////////////////
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getKeyCode());
				int xact = pacman.x;
				int yact = pacman.y;
				
				
				if(e.getKeyCode() == 87) {
					pacman.y -= speed;
					
				}
				if(e.getKeyCode() == 83) {
					pacman.y += speed;
				}
				if(e.getKeyCode() == 65) {
					pacman.x -= speed;
				}
				if(e.getKeyCode() == 68) {
					pacman.x  += speed;
				}
				
				
				//pared 1
				if(pacman.tocando(pared1)) {
					System.out.println("Hola pared1");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 2
				if(pacman.tocando(pared2)) {
					System.out.println("Hola pared2");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 3
				if(pacman.tocando(pared3)) {
					System.out.println("Hola pared3");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 4
				if(pacman.tocando(pared4)) {
					System.out.println("Hola pared4");
					pacman.x = xact;
					pacman.y = yact;
				}
				//pared 5
				if(pacman.tocando(pared5)) {
					System.out.println("Hola pared5");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 6
				if(pacman.tocando(pared6)) {
					System.out.println("Hola pared6");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 7
				if(pacman.tocando(pared7)) {
					System.out.println("Hola pared7");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 8
				if(pacman.tocando(pared8)) {
					System.out.println("Hola pared8");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 9
				if(pacman.tocando(pared9)) {
					System.out.println("Hola pared9");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 10
				if(pacman.tocando(pared10)) {
					System.out.println("Hola pared10");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 11
				if(pacman.tocando(pared11)) {
					System.out.println("Hola pared11");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 12
				if(pacman.tocando(pared12)) {
					System.out.println("Hola pared12");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 13
				if(pacman.tocando(pared13)) {
					System.out.println("Hola pared13");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 14
				if(pacman.tocando(pared14)) {
					System.out.println("Hola pared14");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 15
				if(pacman.tocando(pared15)) {
					System.out.println("Hola pared15");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 16
				if(pacman.tocando(pared16)) {
					System.out.println("Hola pared16");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 17
				if(pacman.tocando(pared17)) {
					System.out.println("Hola pared17");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 18
				if(pacman.tocando(pared18)) {
					System.out.println("Hola pared18");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 19
				if(pacman.tocando(pared19)) {
					System.out.println("Hola pared19");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 20
				if(pacman.tocando(pared20)) {
					System.out.println("Hola pared20");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 21
				if(pacman.tocando(pared21)) {
					System.out.println("Hola pared21");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 22
				if(pacman.tocando(pared22)) {
					System.out.println("Hola pared22");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 23
				if(pacman.tocando(pared23)) {
					System.out.println("Hola pared23");
					pacman.x = xact;
					pacman.y = yact;
				}
				
				//pared 24
				if(pacman.tocando(pared24)) {
					System.out.println("Hola pared24");
					pacman.x = xact;
					pacman.y = yact;
				}	
				//pared 25
				if(pacman.tocando(pared25)) {
					System.out.println("Hola pared25");
					pacman.x = xact;
					pacman.y = yact;
				}	
				//pared 26
				if(pacman.tocando(pared26)) {
					System.out.println("Hola pared26");
					pacman.x = xact;
					pacman.y = yact;
				}	
				//pared 27
				if(pacman.tocando(pared27)) {
					System.out.println("Hola pared27");
					pacman.x = xact;
					pacman.y = yact;
				}
				//pared 28
				if(pacman.tocando(pared28)) {
					System.out.println("Hola pared28");
					pacman.x = xact;
					pacman.y = yact;
				}	
				//pared 29
				if(pacman.tocando(pared29)) {
					System.out.println("Hola pared29");
					pacman.x = xact;
					pacman.y = yact;
				}	
				//pared 30
				if(pacman.tocando(pared30)) {
					System.out.println("Hola pared30");
					pacman.x = xact;
					pacman.y = yact;
				}	
				
				//pared 31
				if(pacman.tocando(pared31)) {
					System.out.println("Hola pared31");
					pacman.x =335;
					pacman.y = 570;
				}	
				
				//pared 32
				if(pacman.tocando(pared32)) {
					System.out.println("Hola pared31");
					pacman.x =335;
					pacman.y = 25;
				}	
				
				//puntos
				
				//punto1
				if(pacman.tocando(punto1)) {
					System.out.println("Hola punto1");
					punto1 = puntox;
					contador++;
				score2.setText("Score: " + contador);
				}
				
				//punto2
				if(pacman.tocando(punto2)) {
					punto2 = puntox;
					System.out.println("Hola punto2");
					contador++;
				score2.setText("Score: " + contador);
				}
				
				//punto3
				
				if(pacman.tocando(punto3)) {
					punto3 = puntox;
					System.out.println("Hola punto3");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto4
				if(pacman.tocando(punto4)) {punto4 = puntox;
					System.out.println("Hola punto4");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto5
				if(pacman.tocando(punto5)) {punto5 = puntox;
					System.out.println("Hola punto5");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto6
				if(pacman.tocando(punto6)) {punto6 = puntox;
					System.out.println("Hola punto6");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto7
				if(pacman.tocando(punto7)) {punto7 = puntox;
					System.out.println("Hola punto7");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto8
				if(pacman.tocando(punto8)) {punto8 = puntox;
					System.out.println("Hola punto8");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto9
				if(pacman.tocando(punto9)) {punto9 = puntox;
					System.out.println("Hola punto9");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto10
				if(pacman.tocando(punto10)) {punto10 = puntox;
					System.out.println("Hola punto10");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto11
				if(pacman.tocando(punto11)) {punto11 = puntox;
					System.out.println("Hola punto11");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto12
				if(pacman.tocando(punto12)) {punto12 = puntox;
					System.out.println("Hola punto12");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto13
				if(pacman.tocando(punto13)) {punto13 = puntox;
					System.out.println("Hola punto13");
					contador++;
				score2.setText("Score: " + contador);
				}
				
				//punto14
				if(pacman.tocando(punto14)) {punto14 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				
				
				//punto15
				if(pacman.tocando(punto15)) {punto15 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto16)) {punto16 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto17)) {punto17 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto18)) {punto18 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto19)) {punto19 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto20)) {punto20 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto21)) {punto21 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto22)) {punto22 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto23)) {punto23 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto24)) {punto24 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto25)) {punto25 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto26)) {punto26 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto27)) {punto27 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto28)) {punto28 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto29)) {punto29 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto30)) {punto30 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto31)) {punto31 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto32)) {punto32 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto33)) {punto33 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto34)) {punto34 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto35)) {punto35 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto36)) {punto36 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto37)) {punto37 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto38)) {punto38 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto39)) {punto39 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto40)) {punto40 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto41)) {punto41 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto42)) {punto42 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto43)) {punto43 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto44)) {punto44 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto45)) {punto45 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto46)) {punto46 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto47)) {punto47 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto48)) {punto48 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto49)) {punto49 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto50)) {punto50 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto51)) {punto51 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto52)) {punto52 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto53)) {punto53 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto54)) {punto54 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto55)) {punto55 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				//punto14
				if(pacman.tocando(punto56)) {punto56 = puntox;
					System.out.println("Hola punto14");
					contador++;
				score2.setText("Score: " + contador);
				}
				
				
				tablero.repaint();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		frame.setFocusable(true);
		frame.requestFocus();
		
	}

	public class MyGraphics extends JComponent {

        private static final long serialVersionUID = 1L;

        MyGraphics() {
            setPreferredSize(new Dimension(670, 610));
        }
        
        
        

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            //Fondo
            g.fillRect(0, 0, 670, 610);
            //Pacman
            g.setColor(pacman.c);
            g.fillArc(pacman.x, pacman.y, pacman.w, pacman.h, 0, 300);
            
            //Paredes
            g.setColor(pared1.c);
            g.fillRect(pared1.x, pared1.y, pared1.w, pared1.h);
            
            g.setColor(pared2.c);
            g.fillRect(pared2.x, pared2.y, pared2.w, pared2.h);
            
            g.setColor(pared3.c);
            g.fillRect(pared3.x, pared3.y, pared3.w, pared3.h);
            
            g.setColor(pared4.c);
            g.fillRect(pared4.x, pared4.y, pared4.w, pared4.h);
            
            g.setColor(pared5.c);
            g.fillRect(pared5.x, pared5.y, pared5.w, pared5.h);
            
            g.setColor(pared6.c);
            g.fillRect(pared6.x, pared6.y, pared6.w, pared6.h);
            
            g.setColor(pared7.c);
            g.fillRect(pared7.x, pared7.y, pared7.w, pared7.h);
            
            g.setColor(pared8.c);
            g.fillRect(pared8.x, pared8.y, pared8.w, pared8.h);
            
            g.setColor(pared9.c);
            g.fillRect(pared9.x, pared9.y, pared9.w, pared9.h);
            
            g.setColor(pared10.c);
            g.fillRect(pared10.x, pared10.y, pared10.w, pared10.h);
            
            g.setColor(pared11.c);
            g.fillRect(pared11.x, pared11.y, pared11.w, pared11.h);
            
            g.setColor(pared12.c);
            g.fillRect(pared12.x, pared12.y, pared12.w, pared12.h);
            
            g.setColor(pared13.c);
            g.fillRect(pared13.x, pared13.y, pared13.w, pared13.h);
            
            g.setColor(pared14.c);
            g.fillRect(pared14.x, pared14.y, pared14.w, pared14.h);
            
            g.setColor(pared15.c);
            g.fillRect(pared15.x, pared15.y, pared15.w, pared15.h);
            
            g.setColor(pared16.c);
            g.fillRect(pared16.x, pared16.y, pared16.w, pared16.h);
            
            g.setColor(pared17.c);
            g.fillRect(pared17.x, pared17.y, pared17.w, pared17.h);
            
            g.setColor(pared18.c);
            g.fillRect(pared18.x, pared18.y, pared18.w, pared18.h);
            
            g.setColor(pared19.c);
            g.fillRect(pared19.x, pared19.y, pared19.w, pared19.h);
            
            g.setColor(pared20.c);
            g.fillRect(pared20.x, pared20.y, pared20.w, pared20.h);
            
            g.setColor(pared21.c);
            g.fillRect(pared21.x, pared21.y, pared21.w, pared21.h);
            
            g.setColor(pared22.c);
            g.fillRect(pared22.x, pared22.y, pared22.w, pared22.h);
            
            g.setColor(pared23.c);
            g.fillRect(pared23.x, pared23.y, pared23.w, pared23.h);
            
            g.setColor(pared24.c);
            g.fillRect(pared24.x, pared24.y, pared24.w, pared24.h);
            
            g.setColor(pared25.c);
            g.fillRect(pared25.x, pared25.y, pared25.w, pared25.h);
            
            g.setColor(pared26.c);
            g.fillRect(pared26.x, pared26.y, pared26.w, pared26.h);
            
            g.setColor(pared27.c);
            g.fillRect(pared27.x, pared27.y, pared27.w, pared27.h);
            
            g.setColor(pared28.c);
            g.fillRect(pared28.x, pared28.y, pared2.w, pared28.h);
            
            g.setColor(pared29.c);
            g.fillRect(pared29.x, pared29.y, pared29.w, pared29.h);
            
            g.setColor(pared30.c);
            g.fillRect(pared30.x, pared30.y, pared30.w, pared30.h);
            
            g.setColor(pared31.c);
            g.fillRect(pared31.x, pared31.y, pared31.w, pared31.h);
            
            g.setColor(pared32.c);
            g.fillRect(pared32.x, pared32.y, pared32.w, pared32.h);
            
                //bolas
               
                g.setColor(Color.decode("#FFFFFF"));  
                g.fillRect(punto1.x, punto1.y, punto1.w, punto1.h);
        		g.setColor(Color.decode("#FFFFFF"));  
        		g.fillRect(punto2.x, punto2.y, punto2.w, punto2.h);
        		g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto3.x,punto3.y, punto3.w, punto3.h);
        	    g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto4.x, punto4.y, punto4.w, punto4.h);
        	    g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto5.x, punto5.y, punto5.w, punto5.h);
        	    g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto6.x, punto6.y, punto6.w, punto6.h);
        	    g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto7.x, punto7.y, punto7.w, punto7.h);
        		g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto8.x, punto8.y, punto8.w, punto8.h);
        		g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto9.x, punto9.y, punto9.w, punto9.h);
        		g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto10.x, punto10.y, punto10.w, punto10.h);
        		g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto11.x, punto11.y, punto11.w, punto11.h);
        		g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto12.x, punto12.y, punto12.w, punto12.h);
        		g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto13.x, punto13.y, punto13.w, punto13.h);
        		g.setColor(Color.decode("#FFFFFF"));
        		g.fillRect(punto14.x, punto14.y, punto14.w, punto14.h);
        		
        		g.setColor(Color.decode("#FFFFFF"));  
                g.fillRect(punto15.x, punto15.y, punto15.w, punto15.h);
         		g.setColor(Color.decode("#FFFFFF"));  
         		g.fillRect(punto16.x, punto16.y, punto16.w, punto16.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto17.x,punto17.y, punto17.w, punto17.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto18.x, punto18.y, punto18.w, punto18.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto19.x, punto19.y, punto19.w, punto19.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto20.x, punto20.y, punto20.w, punto20.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto21.x, punto21.y, punto21.w, punto21.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto22.x, punto22.y, punto22.w, punto22.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto23.x, punto23.y, punto23.w, punto23.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto24.x, punto24.y, punto24.w, punto24.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto25.x, punto25.y, punto15.w, punto15.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto26.x, punto26.y, punto26.w, punto26.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto27.x, punto27.y, punto27.w, punto27.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto28.x, punto28.y, punto28.w, punto28.h);
         		g.setColor(Color.decode("#FFFFFF"));  
                g.fillRect(punto29.x, punto29.y, punto29.w, punto29.h);
         		g.setColor(Color.decode("#FFFFFF"));  
         		g.fillRect(punto30.x, punto30.y, punto30.w, punto30.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto31.x,punto31.y, punto31.w, punto31.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto32.x, punto32.y, punto32.w, punto32.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto33.x, punto33.y, punto33.w, punto33.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto34.x, punto34.y, punto34.w, punto34.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto35.x, punto35.y, punto35.w, punto35.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto36.x, punto36.y, punto36.w, punto36.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto37.x, punto37.y, punto37.w, punto37.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto38.x, punto38.y, punto38.w, punto38.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto39.x, punto39.y, punto39.w, punto39.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto40.x, punto40.y, punto40.w, punto40.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto41.x, punto41.y, punto41.w, punto41.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto42.x, punto42.y, punto42.w, punto42.h);
         		g.setColor(Color.decode("#FFFFFF"));  
                g.fillRect(punto43.x, punto43.y, punto43.w, punto43.h);
         		g.setColor(Color.decode("#FFFFFF"));  
         		g.fillRect(punto44.x, punto44.y, punto44.w, punto44.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto45.x,punto45.y, punto45.w, punto45.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto46.x, punto46.y, punto46.w, punto46.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto47.x, punto47.y, punto47.w, punto47.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto48.x, punto48.y, punto48.w, punto48.h);
         	    g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto49.x, punto49.y, punto49.w, punto49.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto50.x, punto50.y, punto50.w, punto50.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto51.x, punto51.y, punto51.w, punto51.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto52.x, punto52.y, punto52.w, punto52.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto53.x, punto53.y, punto53.w, punto53.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto54.x, punto54.y, punto54.w, punto54.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto55.x, punto55.y, punto55.w, punto55.h);
         		g.setColor(Color.decode("#FFFFFF"));
         		g.fillRect(punto56.x, punto56.y, punto56.w, punto56.h);
         	    
                
        
        }
        
        
        
    }
	
	public class Element{
		
		int x, y, h, w;
		Color c;
		
		Element(int x, int y, int h, int w, Color c){
			this.x = x;
			this.y = y;
			this.h = h;
			this.w = w;
			this.c = c;
		}
		
		public Object getActionMap() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean tocando(Element e) {
			if(this.x < e.x + e.w && this.x + this.w > e.x && this.y < e.y + e.h && this.y + this.h > e.y) {
				return true;
			}
			return false;
		}
		
	}
	
}
