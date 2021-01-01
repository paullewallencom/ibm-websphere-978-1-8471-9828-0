/**
 * CardBillingAccount.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class CardBillingAccount  {
    private java.lang.String firstName;
    private java.lang.String lastName;
    private PayMeLibrary.Address billAddress;
    private java.lang.String phone;
    private java.lang.String mobilePhone;
    private java.lang.String email;

    public CardBillingAccount() {
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public PayMeLibrary.Address getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(PayMeLibrary.Address billAddress) {
        this.billAddress = billAddress;
    }

    public java.lang.String getPhone() {
        return phone;
    }

    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

}
