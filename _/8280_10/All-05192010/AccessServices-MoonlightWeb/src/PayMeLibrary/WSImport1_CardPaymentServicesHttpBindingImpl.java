/**
 * WSImport1_CardPaymentServicesHttpBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class WSImport1_CardPaymentServicesHttpBindingImpl implements PayMeLibrary.CardPaymentServices{
    public PayMeLibrary.CcPayResponse ccMakePayment(PayMeLibrary.CcPayRequest input1) throws java.rmi.RemoteException {
    	
    	CcPayResponse ccPayRes = new CcPayResponse();
    		ccPayRes.setConfirmationId("abdfe3746346bcbd");
    		ccPayRes.setOrigRequest(input1);
        return null;
    }

    public java.lang.String ccMakeSettlement(java.lang.String input1) throws java.rmi.RemoteException {
        return null;
    }

    public PayMeLibrary.CcPayCancelResponse ccDoCancel(PayMeLibrary.CcPayCancelRequest input1) throws java.rmi.RemoteException {
        return null;
    }

}
