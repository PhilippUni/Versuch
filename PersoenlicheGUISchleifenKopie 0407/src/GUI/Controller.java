package GUI;


import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import ForEach.Sonderfertigkeit;
import ForEach.Charakter;
import ForEach.ForEachPackage;
import ForEach.ALLE;

public class Controller {
	private View view;
	
	private ResourceSet resSet;
	
	private Charakter charakter;
	
	private ALLE alleImProjekt;

	Resource resource;
	public Controller() {
		resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ResourceFactoryRegistryImpl.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
				
		// initialize the LearningBoxLanguage
		ForEachPackage.eINSTANCE.getClass();
		
	}
	public void setView(View view) {
		this.view = view;
	}
	private String sonderfertigkeitenToString(Sonderfertigkeit sonderfertigkeit) {
		if(sonderfertigkeit==null) {
			return"";
			
		}
		return "Sonderfertigkeit "+ sonderfertigkeit.getName();
	}
	private String charakterToString(Charakter myCharakter) {
		if(myCharakter==null)
			return"";
		return "Charaktername: "+ myCharakter.getName();
	}
	public void loadXmiFile()
	   {
	      // TODO: Change this statement if you did not persist your instance file in 'instances'
	      File file = new File("instances/Test.xmi");
		  if(!file.exists()){
			  file = new File("instances/BoxSample.xmi");
		  }
	      resource = resSet.createResource(URI.createFileURI(file.getAbsolutePath()));

	      try
	      {
	         resource.load(null);
	         EObject loadedObject = resource.getContents().get(0);
	         charakter = (Charakter) loadedObject;
	         alleImProjekt = (ALLE) loadedObject;
	         
	         // Read instance file and generate all partitions + cards
	         createSonderfertigkeiten(alleImProjekt);		
	      } catch (IOException e)
	      {
					e.printStackTrace();
				}
		}
	
	
	
	public void createCharakter() {
		int charIndex = 0;
		for(Charakter chars: alleImProjekt.getCharakters()) {
			view.createCharakter(chars.getName(),chars);
			createSonderfertigkeitenOfCharakter(chars, charIndex++);
		}
		
	}
	
	
	
	public void createSonderfertigkeiten(ALLE alleImProjekt) {
		// TODO Auto-generated method stub
		int sonderIndex =0;
		for(Sonderfertigkeit sonder: alleImProjekt.getSonderfertigkeiten() ) {
			view.createSonderfertigkeit(sonderfertigkeitenToString(sonder),sonderIndex++,sonder);
			// gegebenenfalls noch weitere Unterklassen creieren
		}
		
	}
	private void createSonderfertigkeitenOfCharakter(Charakter myCharakter,int charIndex) {
		int sonderIndex=0;
		for(Sonderfertigkeit sonder : myCharakter.getEnthalteneFertigkeit()) {
		view.createSonderfertigkeitenDesCharakters(charakterToString(myCharakter),sonder.getName(),sonder.getKosten(),charIndex,sonderIndex);
		}
	}
	
	
	
	
	public void doActionKostenBerechnen(Sonderfertigkeit sonderfertigkeit) {
		int kosten = sonderfertigkeit.kostenBerechnen();
		System.out.println("Die Gesamtkosten um diese Fertigkeit zu erwerben betragen "+kosten+" AP.");
		view.refreshGUI();
	}
	
	public void doActionPrintAllSonder(Charakter charakter) {
		String alle = charakter.printAllSonder();
		System.out.println("Der Charakter "+charakter.getName()+" besitzt bereits die folgenden Sonderfertigkeiten: "+alle);
		view.refreshGUI();
	}
	public void doActionAlleVoraussetzungen(Sonderfertigkeit fertigkeit) {
		/**Sonderfertigkeit passendeSonderfertigkeit =null;
		String voraussetzungen;
		for (Sonderfertigkeit sonder : alleImProjekt.getSonderfertigkeiten()) {
			if(sonder.getName().equals(nameDerSonderfertigkeit)){
				passendeSonderfertigkeit= sonder;
			}
		}
		if (passendeSonderfertigkeit != null)
			voraussetzungen = passendeSonderfertigkeit.alleVoraussetungen();
		else
			voraussetzungen = "keine solche Sonderfertigkeit vorhanden";
		*/
		String voraussetzungen;
		if (fertigkeit==null)
			voraussetzungen= "Nicht vorhandene Fertigkeit";
		else	
			voraussetzungen = fertigkeit.alleVoraussetungen();
		
		System.out.println(voraussetzungen);
		view.refreshGUI();
	}
	public void doActionNeuefertigkeit(Charakter person) {
		String gewollteFertigkeit =view.getUserInputSonderfertigkeit();
		System.out.println("ihre gewünschte Sonderfertigkeit: "+gewollteFertigkeit );
		
		for(Sonderfertigkeit sonder : alleImProjekt.getSonderfertigkeiten()) {
			if(sonder.getName().equalsIgnoreCase(gewollteFertigkeit)) {
				String wirklichGewollt = view.getUserInputGewollt(sonder);
				if(wirklichGewollt.equalsIgnoreCase("Ja")) {
					person.neueFertigkeit(sonder);
					System.out.println("Die Sonderfertigkeit "+ sonder.getName()+" wurde erfolgreich für "+ sonder.getKosten()+" AP hinzugefügt.");
					return;
				}
				if(wirklichGewollt.equalsIgnoreCase("Nein")) {
					System.out.println("Die Sonderfertigkeit wurde demnach nicht hinzugefügt.");
					return;
				}
				else {
					System.out.println("Ungültige Eingabe");
					return;
				}
					
			}
				
		}
		
	}
	
}
/**

import LearningBoxLanguage.Box;
import LearningBoxLanguage.Card;
import LearningBoxLanguage.LearningBoxLanguagePackage;
import LearningBoxLanguage.Partition;

public class LeitnersBoxController {

	private LeitnersBoxView view;

	private ResourceSet resSet;

   private Box box;

   Resource resource;

   public LeitnersBoxController()
   {
		resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ResourceFactoryRegistryImpl.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// initialize the LearningBoxLanguage
		LearningBoxLanguagePackage.eINSTANCE.getClass();
	}

	public void setView(LeitnersBoxView view) {
		this.view = view;
	}

   private String partitionToString(Partition partition)
   {
      if (partition == null)
         return "";
      return "Partition " + partition.getIndex();
   }

   public void loadXmiFile()
   {
      // TODO: Change this statement if you did not persist your instance file in 'instances'
      File file = new File("instances/Box.xmi");
	  if(!file.exists()){
		  file = new File("instances/BoxSample.xmi");
	  }
      resource = resSet.createResource(URI.createFileURI(file.getAbsolutePath()));

      try
      {
         resource.load(null);
         EObject loadedObject = resource.getContents().get(0);
         box = (Box) loadedObject;

         // Read instance file and generate all partitions + cards
         createPartitions(box);		
      } catch (IOException e)
      {
				e.printStackTrace();
			}
	}
   public void createTheBox() {
	   view.createBox(box.getName());
   }
   public void createPartitions(Box box)
   {
	  
      int partitionIndex = 0;
      for (Partition part : box.getContainedPartition())
      {
         view.createPartition(partitionToString(part), partitionIndex);
         createCardsForPartition(part, partitionIndex++);
      }
   }
   private void createCardsForPartition(Partition partition, int partIndex)
   {
      int cardIndex = 0;
      for (Card card : partition.getCard())
      {
         view.createCard(partitionToString(partition), card.getBack(), partIndex, cardIndex++);
		}
	}

   public void doActionRemoveCard(int partIndex, int cardIndex)
   {
      // 'Grab' cards selected in the JFrame
      Partition containerPartion = box.getContainedPartition().get(partIndex);
      Card toBeRemoved = box.getContainedPartition().get(partIndex).getCard().get(cardIndex);

      // Part II; User function implemented with injections
      containerPartion.removeCard(toBeRemoved);

      // Save box.xmi instance and refresh GUI
      view.refreshGUI();
   }

   public void doActionCheckCard(int partIndex, int cardIndex)
   {
      // Grab specific card selected in JFrame
      Partition containerPartition = box.getContainedPartition().get(partIndex);
      Card cardToBeChecked = box.getContainedPartition().get(partIndex).getCard().get(cardIndex);

      // Prompt user for guess against card
      String guess = view.getUserGuess();
      System.out.println("Your guess: " + guess);

      // TODO: Part III; User function implemented with SDMs. Uncomment the statement below to activate
      containerPartition.check(guess, cardToBeChecked);

      // Save box.xmi instance and refresh GUI
      view.refreshGUI();
   }
   public void doActionEmpty(int partitionIndex) {
	   Partition containerPartition = box.getContainedPartition().get(partitionIndex);
	   containerPartition.empty();
	   view.refreshGUI();
   }
   public void doActionGrow() {
	   box.grow();
	   view.refreshGUI();
   }

   public void doActionInvertCard(int partIndex, int cardIndex) {
	   // TODO Auto-generated method stub
	 // Grab specific card selected in JFrame
	   Partition containerPartition = box.getContainedPartition().get(partIndex);
	   Card cardToBeInverted = box.getContainedPartition().get(partIndex).getCard().get(cardIndex);
	   cardToBeInverted.invert();

	   // Save box.xmi instance and refresh GUI
	   view.refreshGUI();
   }

   public void doActionToString(String name) {
	// TODO Auto-generated method stub
	   String toBePrinted =box.toString();
	   System.out.println("The Box's String is  " + toBePrinted );
	   view.refreshGUI();
	}




}
*/
