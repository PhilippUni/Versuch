/**
 */
package JustCreate;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wird Erstellt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JustCreate.WirdErstellt#getMeinVersuch <em>Mein Versuch</em>}</li>
 *   <li>{@link JustCreate.WirdErstellt#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see JustCreate.JustCreatePackage#getWirdErstellt()
 * @model
 * @generated
 */
public interface WirdErstellt extends EObject {
	/**
	 * Returns the value of the '<em><b>Mein Versuch</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link JustCreate.MeinVersuch#getWirdErstellts <em>Wird Erstellts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mein Versuch</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mein Versuch</em>' container reference.
	 * @see #setMeinVersuch(MeinVersuch)
	 * @see JustCreate.JustCreatePackage#getWirdErstellt_MeinVersuch()
	 * @see JustCreate.MeinVersuch#getWirdErstellts
	 * @model opposite="wirdErstellts" transient="false"
	 * @generated
	 */
	MeinVersuch getMeinVersuch();

	/**
	 * Sets the value of the '{@link JustCreate.WirdErstellt#getMeinVersuch <em>Mein Versuch</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mein Versuch</em>' container reference.
	 * @see #getMeinVersuch()
	 * @generated
	 */
	void setMeinVersuch(MeinVersuch value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see JustCreate.JustCreatePackage#getWirdErstellt_Index()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link JustCreate.WirdErstellt#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // WirdErstellt
