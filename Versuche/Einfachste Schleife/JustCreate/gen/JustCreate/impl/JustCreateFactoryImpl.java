/**
 */
package JustCreate.impl;

import JustCreate.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JustCreateFactoryImpl extends EFactoryImpl implements JustCreateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JustCreateFactory init() {
		try {
			JustCreateFactory theJustCreateFactory = (JustCreateFactory) EPackage.Registry.INSTANCE
					.getEFactory(JustCreatePackage.eNS_URI);
			if (theJustCreateFactory != null) {
				return theJustCreateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JustCreateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JustCreateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case JustCreatePackage.MEIN_VERSUCH:
			return createMeinVersuch();
		case JustCreatePackage.WIRD_ERSTELLT:
			return createWirdErstellt();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeinVersuch createMeinVersuch() {
		MeinVersuchImpl meinVersuch = new MeinVersuchImpl();
		return meinVersuch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WirdErstellt createWirdErstellt() {
		WirdErstelltImpl wirdErstellt = new WirdErstelltImpl();
		return wirdErstellt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JustCreatePackage getJustCreatePackage() {
		return (JustCreatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JustCreatePackage getPackage() {
		return JustCreatePackage.eINSTANCE;
	}

} //JustCreateFactoryImpl
