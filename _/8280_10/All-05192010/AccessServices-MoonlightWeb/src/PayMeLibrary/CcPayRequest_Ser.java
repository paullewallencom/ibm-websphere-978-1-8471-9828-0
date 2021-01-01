/**
 * CcPayRequest_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class CcPayRequest_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public CcPayRequest_Ser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    public void serialize(
        javax.xml.namespace.QName name,
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        context.startElement(name, addAttributes(attributes, value, context));
        addElements(value, context);
        context.endElement();
    }
    protected org.xml.sax.Attributes addAttributes(
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        CcPayRequest bean = (CcPayRequest) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_0_0;
          propValue = bean.getAmount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_3,
              false,null,context);
          propQName = QName_0_1;
          propValue = bean.getCard();
          serializeChild(propQName, null, 
              propValue, 
              QName_2_4,
              false,null,context);
          propQName = QName_0_2;
          propValue = bean.getBillDetails();
          serializeChild(propQName, null, 
              propValue, 
              QName_2_5,
              false,null,context);
        }
    }
    private final static javax.xml.namespace.QName QName_1_3 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "double");
    private final static javax.xml.namespace.QName QName_0_2 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "billDetails");
    private final static javax.xml.namespace.QName QName_0_1 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "card");
    private final static javax.xml.namespace.QName QName_0_0 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "amount");
    private final static javax.xml.namespace.QName QName_2_4 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://PayMeLibrary/com/junglesea/apps/payme",
                  "Card");
    private final static javax.xml.namespace.QName QName_2_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://PayMeLibrary/com/junglesea/apps/payme",
                  "CardBillingAccount");
}
