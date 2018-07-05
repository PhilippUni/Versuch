/**
 */
package JustCreate.impl;

import JustCreate.JustCreateFactory;
import JustCreate.JustCreatePackage;
import JustCreate.MeinVersuch;
import JustCreate.WirdErstellt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JustCreatePackageImpl extends EPackageImpl implements JustCreatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meinVersuchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirdErstelltEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see JustCreate.JustCreatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JustCreatePackageImpl() {
		super(eNS_URI, JustCreateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JustCreatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JustCreatePackage init() {
		if (isInited)
			return (JustCreatePackage) EPackage.Registry.INSTANCE.getEPackage(JustCreatePackage.eNS_URI);

		// Obtain or create and register package
		JustCreatePackageImpl theJustCreatePackage = (JustCreatePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof JustCreatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new JustCreatePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJustCreatePackage.createPackageContents();

		// Initialize created meta-data
		theJustCreatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJustCreatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JustCreatePackage.eNS_URI, theJustCreatePackage);
		return theJustCreatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeinVersuch() {
		return meinVersuchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeinVersuch_WirdErstellts() {
		return (EReference) meinVersuchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeinVersuch_NumberOfInstances() {
		return (EAttribute) meinVersuchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeinVersuch__MakeMore() {
		return meinVersuchEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWirdErstellt() {
		return wirdErstelltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWirdErstellt_MeinVersuch() {
		return (EReference) wirdErstelltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWirdErstellt_Index() {
		return (EAttribute) wirdErstelltEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JustCreateFactory getJustCreateFactory() {
		return (JustCreateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		meinVersuchEClass = createEClass(MEIN_VERSUCH);
		createEReference(meinVersuchEClass, MEIN_VERSUCH__WIRD_ERSTELLTS);
		createEAttribute(meinVersuchEClass, MEIN_VERSUCH__NUMBER_OF_INSTANCES);
		createEOperation(meinVersuchEClass, MEIN_VERSUCH___MAKE_MORE);

		wirdErstelltEClass = createEClass(WIRD_ERSTELLT);
		createEReference(wirdErstelltEClass, WIRD_ERSTELLT__MEIN_VERSUCH);
		createEAttribute(wirdErstelltEClass, WIRD_ERSTELLT__INDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(meinVersuchEClass, MeinVersuch.class, "MeinVersuch", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeinVersuch_WirdErstellts(), this.getWirdErstellt(), this.getWirdErstellt_MeinVersuch(),
				"wirdErstellts", null, 0, -1, MeinVersuch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeinVersuch_NumberOfInstances(), ecorePackage.getEInt(), "numberOfInstances", null, 1, 1,
				MeinVersuch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEOperation(getMeinVersuch__MakeMore(), null, "makeMore", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(wirdErstelltEClass, WirdErstellt.class, "WirdErstellt", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWirdErstellt_MeinVersuch(), this.getMeinVersuch(), this.getMeinVersuch_WirdErstellts(),
				"meinVersuch", null, 0, 1, WirdErstellt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWirdErstellt_Index(), ecorePackage.getEInt(), "index", null, 1, 1, WirdErstellt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JustCreatePackageImpl
