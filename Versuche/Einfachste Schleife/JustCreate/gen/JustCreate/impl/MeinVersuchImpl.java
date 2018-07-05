/**
 */
package JustCreate.impl;

import JustCreate.JustCreateFactory;
import JustCreate.JustCreatePackage;
import JustCreate.MeinVersuch;
import JustCreate.WirdErstellt;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mein Versuch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JustCreate.impl.MeinVersuchImpl#getWirdErstellts <em>Wird Erstellts</em>}</li>
 *   <li>{@link JustCreate.impl.MeinVersuchImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeinVersuchImpl extends EObjectImpl implements MeinVersuch {
	/**
	 * The cached value of the '{@link #getWirdErstellts() <em>Wird Erstellts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirdErstellts()
	 * @generated
	 * @ordered
	 */
	protected EList<WirdErstellt> wirdErstellts;

	/**
	 * The default value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_INSTANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected int numberOfInstances = NUMBER_OF_INSTANCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeinVersuchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JustCreatePackage.Literals.MEIN_VERSUCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WirdErstellt> getWirdErstellts() {
		if (wirdErstellts == null) {
			wirdErstellts = new EObjectContainmentWithInverseEList<WirdErstellt>(WirdErstellt.class, this,
					JustCreatePackage.MEIN_VERSUCH__WIRD_ERSTELLTS, JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH);
		}
		return wirdErstellts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfInstances(int newNumberOfInstances) {
		int oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JustCreatePackage.MEIN_VERSUCH__NUMBER_OF_INSTANCES,
					oldNumberOfInstances, numberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeMore() {// ForEach 
		int i=0;
		for (Object[] result1_black : MeinVersuchImpl.pattern_MeinVersuch_0_1_DasExplodiert_blackB(this)) {
			MeinVersuchImpl.pattern_MeinVersuch_0_1_DasExplodiert_greenBFF(this);
			//nothing WirdErstellt istDa = (WirdErstellt) result1_green[1];
			//nothing WirdErstellt neu = (WirdErstellt) result1_green[2];
			i++;
			System.out.println("das wurde "+i+" mal gemacht");

		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JustCreatePackage.MEIN_VERSUCH__WIRD_ERSTELLTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getWirdErstellts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JustCreatePackage.MEIN_VERSUCH__WIRD_ERSTELLTS:
			return ((InternalEList<?>) getWirdErstellts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JustCreatePackage.MEIN_VERSUCH__WIRD_ERSTELLTS:
			return getWirdErstellts();
		case JustCreatePackage.MEIN_VERSUCH__NUMBER_OF_INSTANCES:
			return getNumberOfInstances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JustCreatePackage.MEIN_VERSUCH__WIRD_ERSTELLTS:
			getWirdErstellts().clear();
			getWirdErstellts().addAll((Collection<? extends WirdErstellt>) newValue);
			return;
		case JustCreatePackage.MEIN_VERSUCH__NUMBER_OF_INSTANCES:
			setNumberOfInstances((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JustCreatePackage.MEIN_VERSUCH__WIRD_ERSTELLTS:
			getWirdErstellts().clear();
			return;
		case JustCreatePackage.MEIN_VERSUCH__NUMBER_OF_INSTANCES:
			setNumberOfInstances(NUMBER_OF_INSTANCES_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JustCreatePackage.MEIN_VERSUCH__WIRD_ERSTELLTS:
			return wirdErstellts != null && !wirdErstellts.isEmpty();
		case JustCreatePackage.MEIN_VERSUCH__NUMBER_OF_INSTANCES:
			return numberOfInstances != NUMBER_OF_INSTANCES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case JustCreatePackage.MEIN_VERSUCH___MAKE_MORE:
			makeMore();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfInstances: ");
		result.append(numberOfInstances);
		result.append(')');
		return result.toString();
	}

	public static final Iterable<Object[]> pattern_MeinVersuch_0_1_DasExplodiert_blackB(MeinVersuch _this) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { _this });
		return _result;
	}

	public static final Object[] pattern_MeinVersuch_0_1_DasExplodiert_greenBFF(MeinVersuch _this) {
		WirdErstellt istDa = JustCreateFactory.eINSTANCE.createWirdErstellt();
		WirdErstellt neu = JustCreateFactory.eINSTANCE.createWirdErstellt();
		istDa.setMeinVersuch(_this);
		neu.setMeinVersuch(_this);
		return new Object[] { _this, istDa, neu };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MeinVersuchImpl
