/**
 */
package org.wso2.developerstudio.datamapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.developerstudio.datamapper.Properties#getType <em>Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.datamapper.Properties#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.datamapper.Properties#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see org.wso2.developerstudio.datamapper.DataMapperPackage#getProperties()
 * @model
 * @generated
 */
public interface Properties extends Operator {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"STRING"</code>.
	 * The literals are from the enumeration {@link org.wso2.developerstudio.datamapper.SchemaDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.wso2.developerstudio.datamapper.SchemaDataType
	 * @see #setType(SchemaDataType)
	 * @see org.wso2.developerstudio.datamapper.DataMapperPackage#getProperties_Type()
	 * @model default="STRING"
	 * @generated
	 */
	SchemaDataType getType();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.datamapper.Properties#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.wso2.developerstudio.datamapper.SchemaDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(SchemaDataType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"default_name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.developerstudio.datamapper.DataMapperPackage#getProperties_Name()
	 * @model default="default_name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.datamapper.Properties#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"DEFAULT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.wso2.developerstudio.datamapper.DataMapperPackage#getProperties_Scope()
	 * @model default="DEFAULT"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.datamapper.Properties#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);
} // Properties
