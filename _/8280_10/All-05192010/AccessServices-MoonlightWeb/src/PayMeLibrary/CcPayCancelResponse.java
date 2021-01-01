/**
 * CcPayCancelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class CcPayCancelResponse  {
    private java.lang.String confirmationId;
    private PayMeLibrary.CcPayCancelRequest originalRequest;

    public CcPayCancelResponse() {
    }

    public java.lang.String getConfirmationId() {
        return confirmationId;
    }

    public void setConfirmationId(java.lang.String confirmationId) {
        this.confirmationId = confirmationId;
    }

    public PayMeLibrary.CcPayCancelRequest getOriginalRequest() {
        return originalRequest;
    }

    public void setOriginalRequest(PayMeLibrary.CcPayCancelRequest originalRequest) {
        this.originalRequest = originalRequest;
    }

}
