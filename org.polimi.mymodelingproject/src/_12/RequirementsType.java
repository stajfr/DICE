/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.RequirementsType#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getRequirementsType()
 * @model extendedMetaData="name='Requirements_._type' kind='elementOnly'"
 * @generated
 */
public interface RequirementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see _12._12Package#getRequirementsType_Requirement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TRequirement> getRequirement();

} // RequirementsType
