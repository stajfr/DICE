/**
 */
package _12;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclude Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.ExcludeType#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getExcludeType()
 * @model extendedMetaData="name='Exclude_._type' kind='empty'"
 * @generated
 */
public interface ExcludeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see _12._12Package#getExcludeType_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link _12.ExcludeType#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // ExcludeType
