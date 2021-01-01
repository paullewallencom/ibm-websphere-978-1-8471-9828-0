/**
 * CcPayCancelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class CcPayCancelRequest  {
    private PayMeLibrary.CcPayRequest originalPaymentRequest;
    private java.lang.String payConfirmationId;

    public CcPayCancelRequest() {
    }

    public PayMeLibrary.CcPayRequest getOriginalPaymentRequest() {
        return originalPaymentRequest;
    }

    public void setOriginalPaymentRequest(PayMeLibrary.CcPayRequest originalPaymentRequest) {
        this.originalPaymentRequest = originalPaymentRequest;
    }

    public java.lang.String getPayConfirmationId() {
        return payConfirmationId;
    }

    public void setPayConfirmationId(java.lang.String payConfirmationId) {
        this.payConfirmationId = payConfirmationId;
    }

}
