/**
 * CcPayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class CcPayResponse  {
    private java.lang.String confirmationId;
    private PayMeLibrary.Rejection rejection;
    private PayMeLibrary.CcPayRequest origRequest;

    public CcPayResponse() {
    }

    public java.lang.String getConfirmationId() {
        return confirmationId;
    }

    public void setConfirmationId(java.lang.String confirmationId) {
        this.confirmationId = confirmationId;
    }

    public PayMeLibrary.Rejection getRejection() {
        return rejection;
    }

    public void setRejection(PayMeLibrary.Rejection rejection) {
        this.rejection = rejection;
    }

    public PayMeLibrary.CcPayRequest getOrigRequest() {
        return origRequest;
    }

    public void setOrigRequest(PayMeLibrary.CcPayRequest origRequest) {
        this.origRequest = origRequest;
    }

}
