/**
 */
package _12;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDeployment Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.TDeploymentArtifact#getArtifactRef <em>Artifact Ref</em>}</li>
 *   <li>{@link _12.TDeploymentArtifact#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link _12.TDeploymentArtifact#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getTDeploymentArtifact()
 * @model extendedMetaData="name='tDeploymentArtifact' kind='elementOnly'"
 * @generated
 */
public interface TDeploymentArtifact extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Ref</em>' attribute.
	 * @see #setArtifactRef(QName)
	 * @see _12._12Package#getTDeploymentArtifact_ArtifactRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='artifactRef'"
	 * @generated
	 */
	QName getArtifactRef();

	/**
	 * Sets the value of the '{@link _12.TDeploymentArtifact#getArtifactRef <em>Artifact Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Ref</em>' attribute.
	 * @see #getArtifactRef()
	 * @generated
	 */
	void setArtifactRef(QName value);

	/**
	 * Returns the value of the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Type</em>' attribute.
	 * @see #setArtifactType(QName)
	 * @see _12._12Package#getTDeploymentArtifact_ArtifactType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='artifactType'"
	 * @generated
	 */
	QName getArtifactType();

	/**
	 * Sets the value of the '{@link _12.TDeploymentArtifact#getArtifactType <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Type</em>' attribute.
	 * @see #getArtifactType()
	 * @generated
	 */
	void setArtifactType(QName value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see _12._12Package#getTDeploymentArtifact_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link _12.TDeploymentArtifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TDeploymentArtifact
