/**
 * CcPayRequest.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class CcPayRequest  {
    private java.lang.Double amount;
    private PayMeLibrary.Card card;
    private PayMeLibrary.CardBillingAccount billDetails;

    public CcPayRequest() {
    }

    public java.lang.Double getAmount() {
        return amount;
    }

    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    public PayMeLibrary.Card getCard() {
        return card;
    }

    public void setCard(PayMeLibrary.Card card) {
        this.card = card;
    }

    public PayMeLibrary.CardBillingAccount getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(PayMeLibrary.CardBillingAccount billDetails) {
        this.billDetails = billDetails;
    }

}
