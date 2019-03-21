/**
 * generated by Xtext 2.16.0
 */
package sdu.mmmi.mdsd.mathInterpreter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mmmi.mdsd.mathInterpreter.Plus#getLeft <em>Left</em>}</li>
 *   <li>{@link sdu.mmmi.mdsd.mathInterpreter.Plus#getOp <em>Op</em>}</li>
 *   <li>{@link sdu.mmmi.mdsd.mathInterpreter.Plus#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see sdu.mmmi.mdsd.mathInterpreter.MathInterpreterPackage#getPlus()
 * @model
 * @generated
 */
public interface Plus extends Exp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Exp)
   * @see sdu.mmmi.mdsd.mathInterpreter.MathInterpreterPackage#getPlus_Left()
   * @model containment="true"
   * @generated
   */
  Exp getLeft();

  /**
   * Sets the value of the '{@link sdu.mmmi.mdsd.mathInterpreter.Plus#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Exp value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see sdu.mmmi.mdsd.mathInterpreter.MathInterpreterPackage#getPlus_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link sdu.mmmi.mdsd.mathInterpreter.Plus#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Exp)
   * @see sdu.mmmi.mdsd.mathInterpreter.MathInterpreterPackage#getPlus_Right()
   * @model containment="true"
   * @generated
   */
  Exp getRight();

  /**
   * Sets the value of the '{@link sdu.mmmi.mdsd.mathInterpreter.Plus#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Exp value);

} // Plus
