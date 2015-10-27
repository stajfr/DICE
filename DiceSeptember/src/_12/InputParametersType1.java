/**
 */
package _12;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameters Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link _12.InputParametersType1#getInputParameter <em>Input Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see _12._12Package#getInputParametersType1()
 * @model extendedMetaData="name='InputParameters_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface InputParametersType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link _12.TParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter</em>' containment reference list.
	 * @see _12._12Package#getInputParametersType1_InputParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InputParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParameter> getInputParameter();

} // InputParametersType1
