/**
 */
package _12;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.NodeTypeReferenceType#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getNodeTypeReferenceType()
 * @model extendedMetaData="name='NodeTypeReference_._type' kind='empty'"
 * @generated
 */
public interface NodeTypeReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' attribute.
	 * @see #setTypeRef(QName)
	 * @see _12._12Package#getNodeTypeReferenceType_TypeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='typeRef'"
	 * @generated
	 */
	QName getTypeRef();

	/**
	 * Sets the value of the '{@link _12.NodeTypeReferenceType#getTypeRef <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' attribute.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(QName value);

} // NodeTypeReferenceType
