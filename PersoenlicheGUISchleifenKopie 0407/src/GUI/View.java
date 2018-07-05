package GUI;

import ForEach.Charakter;
import ForEach.Sonderfertigkeit;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class View {
	
	
	private Controller controller;
	private JMenu charakterMenu;
	private JMenu sonderfertigkeitenMenu;
	private JFrame frame;
	
	private Map<String, JMenu> submenus = new HashMap<>();
	
	
	public View (Controller controller) {
		controller.setView(this);
		this.controller=controller;
	}

	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new View(new Controller()).createAndShowGUI();
				
				
			}
		});		
	}
	
	
	
	
	protected void createAndShowGUI() {
		// TODO Auto-generated method stub
		frame = new JFrame("Sonderfertigkeiten der DSA Charaktere");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setJMenuBar(createMenuBar(frame));
		frame.setContentPane(createContentPane());

		frame.setSize(220, 220);
		frame.setVisible(true);
		controller.loadXmiFile();
		controller.createCharakter();

	}
	
	
	public JMenu getCharakterMenu() {
		return charakterMenu;
	}
	
	


	private JMenuBar createMenuBar(final JFrame frame2) {
		JMenuBar menuBar = new JMenuBar();
		
		sonderfertigkeitenMenu = new JMenu("Sonderfertigkeiten");
		charakterMenu = new JMenu("Charakter");
		sonderfertigkeitenMenu.setMnemonic(KeyEvent.VK_P);
		charakterMenu.setMnemonic(KeyEvent.VK_P);
		menuBar.add(sonderfertigkeitenMenu);
		menuBar.add(charakterMenu);
		
		return menuBar;
	}


	public Container createContentPane() {
		JPanel contentPane = new JPanel(new BorderLayout());
		contentPane.setOpaque(true);

		JLabel output = new JLabel(
				createImageIcon("icons/noun_project_870.png"));
		contentPane.add(output, BorderLayout.CENTER);

		contentPane
				.setToolTipText("Flash Cards designed by Rohan Gupta, "
						+ "Memory designed by Anne Marie Nguyen, from The Noun Project.");

		return contentPane;
	}
	// gegebenenfalls noch image einfügen oder diesen Punkt auslassen mal sehen
	private static ImageIcon createImageIcon(String filename) {
		if (new File(filename).exists()) {
			return new ImageIcon(filename);
		} else {
			System.err.println("Couldn't find file: " + filename);
			return null;
		}

	}
	
	
	


	void createCharakter(String name,Charakter charakter) {
		JMenuItem neueFertigkeit = new JMenuItem();
		JMenuItem printAllSonder = new JMenuItem();
		JMenu submenu = new  JMenu(name);
		
		submenus.put(name, submenu);
		charakterMenu.add(submenu);
		submenus.get(name).add(printAllSonder);
		submenus.get(name).add(neueFertigkeit);
		submenu.add(printAllSonder);
		submenu.add(neueFertigkeit);
		setNeueFertigkeitAction(neueFertigkeit,charakter);
		setPrintAllSonderAction(printAllSonder,charakter);
		printAllSonder.setText("Alle enthaltenen Sonderfertigkeiten anzeigen?");
		
	}
	
	
	
	
	
	void createSonderfertigkeit(String name, int Index, Sonderfertigkeit sonder) {
		JMenuItem alleVoraussetzungen = new JMenuItem();
		JMenuItem kostenBerechnen = new JMenuItem();
		JMenu submenu = new JMenu(name);
		
		submenu.setIcon(createImageIcon("icons/noun_projects_4767.png"));
		submenus.put(name,submenu);
		sonderfertigkeitenMenu.add(submenu);
		submenu.add(alleVoraussetzungen);
		setAlleVoraussetzungenAction(alleVoraussetzungen,sonder);
		setKostenBerechnung(kostenBerechnen,sonder);
		alleVoraussetzungen.setText("Alle Voraussetzungen anzeigen?");
		kostenBerechnen.setText("Gesamtkosten für den Erwerb anzeigen?");
		
	}
	public void createSonderfertigkeitenDesCharakters(String submenu, String sonderName, int kosten, int charIndex,
			int sonderIndex) {
		JMenu subSonder =new JMenu(sonderName);
		// possible Menus For contained Cards
		submenus.get(submenu).add(subSonder);
		
	}

	

	public void setAlleVoraussetzungenAction(JMenuItem alleVoraussetzungen,Sonderfertigkeit fertigkeit ) {
		alleVoraussetzungen.setAction(new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				controller.doActionAlleVoraussetzungen(fertigkeit);
			}
		});
		
	}


	public void setKostenBerechnung(JMenuItem kostenBerechnen,Sonderfertigkeit sonder) {
		kostenBerechnen.setAction(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				controller.doActionKostenBerechnen(sonder);
			}
		});
	}


	public void setPrintAllSonderAction(JMenuItem printAllSonder,Charakter charakter) {
		printAllSonder.setAction(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				controller.doActionPrintAllSonder(charakter);
			}
		});
		
	}


	public void setNeueFertigkeitAction(JMenuItem neueFertigkeit, Charakter charakter ) {
		neueFertigkeit.setAction(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				controller.doActionNeuefertigkeit(charakter);
			}
		});
		
	}


	public void refreshGUI() {
		saveModel();
		clearView();
		controller.loadXmiFile();
		
	}
	
	
	private void saveModel() {
		try { 
			controller.resource.save(null);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	private void clearView() {
		submenus.clear();
		charakterMenu.removeAll();
		sonderfertigkeitenMenu.removeAll();
		
	}


	


	public String getUserInputSonderfertigkeit() {
		String fertigkeit = JOptionPane.showInputDialog("Welche Sonderfertigkeit möchten sie hinzufügen?");
		return fertigkeit;
	}


	public String getUserInputGewollt(Sonderfertigkeit sonder) {
		String auswahl = JOptionPane.showInputDialog("Möchten Sie Die Sonderfertigkeit " + sonder.getName() + "wirklich für " + sonder.getKosten() + " AP hinzufügen? Antworten Sie Ja oder Nein");
		
		return auswahl;
	}


	
}