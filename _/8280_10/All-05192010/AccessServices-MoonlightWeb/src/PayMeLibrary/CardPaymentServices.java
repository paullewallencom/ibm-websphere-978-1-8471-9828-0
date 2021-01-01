/**
 * CardPaymentServices.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public interface CardPaymentServices extends java.rmi.Remote {
    public PayMeLibrary.CcPayResponse ccMakePayment(PayMeLibrary.CcPayRequest input1) throws java.rmi.RemoteException;
    public java.lang.String ccMakeSettlement(java.lang.String input1) throws java.rmi.RemoteException;
    public PayMeLibrary.CcPayCancelResponse ccDoCancel(PayMeLibrary.CcPayCancelRequest input1) throws java.rmi.RemoteException;
}
