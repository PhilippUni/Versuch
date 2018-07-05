/**
 */
package JustCreate.impl;

import JustCreate.JustCreatePackage;
import JustCreate.MeinVersuch;
import JustCreate.WirdErstellt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wird Erstellt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JustCreate.impl.WirdErstelltImpl#getMeinVersuch <em>Mein Versuch</em>}</li>
 *   <li>{@link JustCreate.impl.WirdErstelltImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WirdErstelltImpl extends EObjectImpl implements WirdErstellt {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WirdErstelltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JustCreatePackage.Literals.WIRD_ERSTELLT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeinVersuch getMeinVersuch() {
		if (eContainerFeatureID() != JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH)
			return null;
		return (MeinVersuch) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeinVersuch(MeinVersuch newMeinVersuch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMeinVersuch, JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeinVersuch(MeinVersuch newMeinVersuch) {
		if (newMeinVersuch != eInternalContainer()
				|| (eContainerFeatureID() != JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH && newMeinVersuch != null)) {
			if (EcoreUtil.isAncestor(this, newMeinVersuch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMeinVersuch != null)
				msgs = ((InternalEObject) newMeinVersuch).eInverseAdd(this,
						JustCreatePackage.MEIN_VERSUCH__WIRD_ERSTELLTS, MeinVersuch.class, msgs);
			msgs = basicSetMeinVersuch(newMeinVersuch, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH,
					newMeinVersuch, newMeinVersuch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JustCreatePackage.WIRD_ERSTELLT__INDEX, oldIndex,
					index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMeinVersuch((MeinVersuch) otherEnd, msgs);
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
		case JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH:
			return basicSetMeinVersuch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH:
			return eInternalContainer().eInverseRemove(this, JustCreatePackage.MEIN_VERSUCH__WIRD_ERSTELLTS,
					MeinVersuch.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH:
			return getMeinVersuch();
		case JustCreatePackage.WIRD_ERSTELLT__INDEX:
			return getIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH:
			setMeinVersuch((MeinVersuch) newValue);
			return;
		case JustCreatePackage.WIRD_ERSTELLT__INDEX:
			setIndex((Integer) newValue);
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
		case JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH:
			setMeinVersuch((MeinVersuch) null);
			return;
		case JustCreatePackage.WIRD_ERSTELLT__INDEX:
			setIndex(INDEX_EDEFAULT);
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
		case JustCreatePackage.WIRD_ERSTELLT__MEIN_VERSUCH:
			return getMeinVersuch() != null;
		case JustCreatePackage.WIRD_ERSTELLT__INDEX:
			return index != INDEX_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //WirdErstelltImpl
