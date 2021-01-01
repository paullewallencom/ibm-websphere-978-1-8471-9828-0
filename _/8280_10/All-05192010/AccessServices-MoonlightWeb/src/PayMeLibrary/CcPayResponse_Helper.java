/**
 * CcPayResponse_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230904.14 v13009114817
 */

package PayMeLibrary;

public class CcPayResponse_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(CcPayResponse.class);

    static {
        typeDesc.setOption("buildNum","cf230904.14");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("confirmationId");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "confirmationId"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("rejection");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "rejection"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://PayMeLibrary/com/junglesea/apps/payme", "Rejection"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("origRequest");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "origRequest"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://PayMeLibrary/com/junglesea/apps/payme", "ccPayRequest"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
    };

    /**
     * Return type metadata object
     */
    public static com.ibm.ws.webservices.engine.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new CcPayResponse_Ser(
            javaType, xmlType, typeDesc);
    };

    /**
     * Get Custom Deserializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new CcPayResponse_Deser(
            javaType, xmlType, typeDesc);
    };

}
