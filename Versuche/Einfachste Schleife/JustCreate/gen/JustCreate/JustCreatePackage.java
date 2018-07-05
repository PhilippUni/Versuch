/**
 */
package JustCreate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see JustCreate.JustCreateFactory
 * @model kind="package"
 * @generated
 */
public interface JustCreatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "JustCreate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/JustCreate/model/JustCreate.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "JustCreate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JustCreatePackage eINSTANCE = JustCreate.impl.JustCreatePackageImpl.init();

	/**
	 * The meta object id for the '{@link JustCreate.impl.MeinVersuchImpl <em>Mein Versuch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JustCreate.impl.MeinVersuchImpl
	 * @see JustCreate.impl.JustCreatePackageImpl#getMeinVersuch()
	 * @generated
	 */
	int MEIN_VERSUCH = 0;

	/**
	 * The feature id for the '<em><b>Wird Erstellts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEIN_VERSUCH__WIRD_ERSTELLTS = 0;

	/**
	 * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEIN_VERSUCH__NUMBER_OF_INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>Mein Versuch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEIN_VERSUCH_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Make More</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEIN_VERSUCH___MAKE_MORE = 0;

	/**
	 * The number of operations of the '<em>Mein Versuch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEIN_VERSUCH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link JustCreate.impl.WirdErstelltImpl <em>Wird Erstellt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JustCreate.impl.WirdErstelltImpl
	 * @see JustCreate.impl.JustCreatePackageImpl#getWirdErstellt()
	 * @generated
	 */
	int WIRD_ERSTELLT = 1;

	/**
	 * The feature id for the '<em><b>Mein Versuch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRD_ERSTELLT__MEIN_VERSUCH = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRD_ERSTELLT__INDEX = 1;

	/**
	 * The number of structural features of the '<em>Wird Erstellt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRD_ERSTELLT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Wird Erstellt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRD_ERSTELLT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link JustCreate.MeinVersuch <em>Mein Versuch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mein Versuch</em>'.
	 * @see JustCreate.MeinVersuch
	 * @generated
	 */
	EClass getMeinVersuch();

	/**
	 * Returns the meta object for the containment reference list '{@link JustCreate.MeinVersuch#getWirdErstellts <em>Wird Erstellts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wird Erstellts</em>'.
	 * @see JustCreate.MeinVersuch#getWirdErstellts()
	 * @see #getMeinVersuch()
	 * @generated
	 */
	EReference getMeinVersuch_WirdErstellts();

	/**
	 * Returns the meta object for the attribute '{@link JustCreate.MeinVersuch#getNumberOfInstances <em>Number Of Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Instances</em>'.
	 * @see JustCreate.MeinVersuch#getNumberOfInstances()
	 * @see #getMeinVersuch()
	 * @generated
	 */
	EAttribute getMeinVersuch_NumberOfInstances();

	/**
	 * Returns the meta object for the '{@link JustCreate.MeinVersuch#makeMore() <em>Make More</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make More</em>' operation.
	 * @see JustCreate.MeinVersuch#makeMore()
	 * @generated
	 */
	EOperation getMeinVersuch__MakeMore();

	/**
	 * Returns the meta object for class '{@link JustCreate.WirdErstellt <em>Wird Erstellt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wird Erstellt</em>'.
	 * @see JustCreate.WirdErstellt
	 * @generated
	 */
	EClass getWirdErstellt();

	/**
	 * Returns the meta object for the container reference '{@link JustCreate.WirdErstellt#getMeinVersuch <em>Mein Versuch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mein Versuch</em>'.
	 * @see JustCreate.WirdErstellt#getMeinVersuch()
	 * @see #getWirdErstellt()
	 * @generated
	 */
	EReference getWirdErstellt_MeinVersuch();

	/**
	 * Returns the meta object for the attribute '{@link JustCreate.WirdErstellt#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see JustCreate.WirdErstellt#getIndex()
	 * @see #getWirdErstellt()
	 * @generated
	 */
	EAttribute getWirdErstellt_Index();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JustCreateFactory getJustCreateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link JustCreate.impl.MeinVersuchImpl <em>Mein Versuch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JustCreate.impl.MeinVersuchImpl
		 * @see JustCreate.impl.JustCreatePackageImpl#getMeinVersuch()
		 * @generated
		 */
		EClass MEIN_VERSUCH = eINSTANCE.getMeinVersuch();

		/**
		 * The meta object literal for the '<em><b>Wird Erstellts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEIN_VERSUCH__WIRD_ERSTELLTS = eINSTANCE.getMeinVersuch_WirdErstellts();

		/**
		 * The meta object literal for the '<em><b>Number Of Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEIN_VERSUCH__NUMBER_OF_INSTANCES = eINSTANCE.getMeinVersuch_NumberOfInstances();

		/**
		 * The meta object literal for the '<em><b>Make More</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEIN_VERSUCH___MAKE_MORE = eINSTANCE.getMeinVersuch__MakeMore();

		/**
		 * The meta object literal for the '{@link JustCreate.impl.WirdErstelltImpl <em>Wird Erstellt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JustCreate.impl.WirdErstelltImpl
		 * @see JustCreate.impl.JustCreatePackageImpl#getWirdErstellt()
		 * @generated
		 */
		EClass WIRD_ERSTELLT = eINSTANCE.getWirdErstellt();

		/**
		 * The meta object literal for the '<em><b>Mein Versuch</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRD_ERSTELLT__MEIN_VERSUCH = eINSTANCE.getWirdErstellt_MeinVersuch();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRD_ERSTELLT__INDEX = eINSTANCE.getWirdErstellt_Index();

	}

} //JustCreatePackage
