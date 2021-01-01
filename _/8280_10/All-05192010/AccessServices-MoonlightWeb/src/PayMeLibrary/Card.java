/**
 * Card.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class Card  {
    private java.lang.String cardNumber;
    private PayMeLibrary.CardExpiry expiryDate;
    private java.lang.String cardType;
    private java.lang.String securityCode;

    public Card() {
    }

    public java.lang.String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public PayMeLibrary.CardExpiry getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(PayMeLibrary.CardExpiry expiryDate) {
        this.expiryDate = expiryDate;
    }

    public java.lang.String getCardType() {
        return cardType;
    }

    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }

    public java.lang.String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(java.lang.String securityCode) {
        this.securityCode = securityCode;
    }

}
