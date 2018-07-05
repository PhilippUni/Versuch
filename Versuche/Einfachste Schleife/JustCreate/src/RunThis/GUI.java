package RunThis;

import JustCreate.*;
import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


public class GUI {
	private static ResourceSet resSet = new ResourceSetImpl();
	private static Resource resource =null ;
	static MeinVersuch versuch =null;
	static WirdErstellt erstellt =null;
	static GUI gui =new GUI() ;
	
	public void loadXmiFileRes()
	   {
	      // TODO: Change this statement if you did not persist your instance file in 'instances'
	      File file = new File("instances/MeinVersuch.xmi");
		  if(!file.exists()){
			  System.out.println("hey das ist ja leer");
			//  file = new File("instances/BoxSample.xmi");
		  }
	      resource = resSet.createResource(URI.createFileURI(file.getAbsolutePath()));

	      try
	      {
	         resource.load(null);
	         EObject loadedObject = resource.getContents().get(0);
	         versuch = (MeinVersuch) loadedObject;
	       //  System.out.println("bin hier");
	         // Read instance file and generate all partitions + cards
	         //createPartitions(box);		
	      } catch (IOException e)
	      {
					e.printStackTrace();
				}
		}
	/**public MeinVersuch loadXmiFileVersuch(Resource res,MeinVersuch vers , ResourceSet rs)
	   {
	      // TODO: Change this statement if you did not persist your instance file in 'instances'
	      File file = new File("instances/MeinVersuch.xmi");
		  if(!file.exists()){
			  System.out.println("hey das ist ja leer");
			//  file = new File("instances/BoxSample.xmi");
		  }
	      res = rs.createResource(URI.createFileURI(file.getAbsolutePath()));

	      try
	      {
	         res.load(null);
	         EObject loadedObject = res.getContents().get(0);
	         vers = (MeinVersuch) loadedObject;
	         System.out.println("bin hier");
	         // Read instance file and generate all partitions + cards
	         //createPartitions(box);		
	      } catch (IOException e)
	      {
					e.printStackTrace();
				}
	      return vers;
		}
*/
	
	public static void main(String[] args) {
		
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ResourceFactoryRegistryImpl.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// initialize the LearningBoxLanguage
		JustCreatePackage.eINSTANCE.getClass();

		GUI gui =new GUI();
		System.out.println("hello World");
		gui.loadXmiFileRes();
		//gui.loadXmiFileVersuch(finResource, finVersuch, finResSet);
		int i = versuch.getNumberOfInstances();
		System.out.println("es sind"+i);
		versuch.makeMore();
		gui.saveModel();
		System.out.println("Ich Habe Fertig!");
		
	}
	public void saveModel() {
		try {
			resource.save(null);
			System.out.println(resource.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
