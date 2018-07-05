/**
 */
package JustCreate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see JustCreate.JustCreatePackage
 * @generated
 */
public interface JustCreateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JustCreateFactory eINSTANCE = JustCreate.impl.JustCreateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mein Versuch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mein Versuch</em>'.
	 * @generated
	 */
	MeinVersuch createMeinVersuch();

	/**
	 * Returns a new object of class '<em>Wird Erstellt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wird Erstellt</em>'.
	 * @generated
	 */
	WirdErstellt createWirdErstellt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JustCreatePackage getJustCreatePackage();

} //JustCreateFactory
