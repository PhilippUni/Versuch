/**
 */
package JustCreate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mein Versuch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JustCreate.MeinVersuch#getWirdErstellts <em>Wird Erstellts</em>}</li>
 *   <li>{@link JustCreate.MeinVersuch#getNumberOfInstances <em>Number Of Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see JustCreate.JustCreatePackage#getMeinVersuch()
 * @model
 * @generated
 */
public interface MeinVersuch extends EObject {
	/**
	 * Returns the value of the '<em><b>Wird Erstellts</b></em>' containment reference list.
	 * The list contents are of type {@link JustCreate.WirdErstellt}.
	 * It is bidirectional and its opposite is '{@link JustCreate.WirdErstellt#getMeinVersuch <em>Mein Versuch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wird Erstellts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wird Erstellts</em>' containment reference list.
	 * @see JustCreate.JustCreatePackage#getMeinVersuch_WirdErstellts()
	 * @see JustCreate.WirdErstellt#getMeinVersuch
	 * @model opposite="meinVersuch" containment="true"
	 * @generated
	 */
	EList<WirdErstellt> getWirdErstellts();

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' attribute.
	 * @see #setNumberOfInstances(int)
	 * @see JustCreate.JustCreatePackage#getMeinVersuch_NumberOfInstances()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfInstances();

	/**
	 * Sets the value of the '{@link JustCreate.MeinVersuch#getNumberOfInstances <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' attribute.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void makeMore();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // MeinVersuch
