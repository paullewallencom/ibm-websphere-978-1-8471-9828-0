/**
 * CcPayCancelResponse_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class CcPayCancelResponse_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public CcPayCancelResponse_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new PayMeLibrary.CcPayCancelResponse();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_6) {
          ((CcPayCancelResponse)value).setConfirmationId(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_0_14) {
          ((CcPayCancelResponse)value).setOriginalRequest((PayMeLibrary.CcPayCancelRequest)objValue);
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_14 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "originalRequest");
    private final static javax.xml.namespace.QName QName_0_6 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "confirmationId");
}
