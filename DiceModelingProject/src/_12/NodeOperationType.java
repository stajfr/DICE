/**
 */
package _12;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.NodeOperationType#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link _12.NodeOperationType#getNodeRef <em>Node Ref</em>}</li>
 *   <li>{@link _12.NodeOperationType#getOperationName <em>Operation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getNodeOperationType()
 * @model extendedMetaData="name='NodeOperation_._type' kind='empty'"
 * @generated
 */
public interface NodeOperationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see _12._12Package#getNodeOperationType_InterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='interfaceName'"
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link _12.NodeOperationType#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>Node Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Ref</em>' attribute.
	 * @see #setNodeRef(String)
	 * @see _12._12Package#getNodeOperationType_NodeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='nodeRef'"
	 * @generated
	 */
	String getNodeRef();

	/**
	 * Sets the value of the '{@link _12.NodeOperationType#getNodeRef <em>Node Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Ref</em>' attribute.
	 * @see #getNodeRef()
	 * @generated
	 */
	void setNodeRef(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see _12._12Package#getNodeOperationType_OperationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='operationName'"
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link _12.NodeOperationType#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

} // NodeOperationType
