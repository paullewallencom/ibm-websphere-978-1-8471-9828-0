<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/XSLTransformation2_req_1.map" md5sum="2e6e3121841d05db04fea609297efe83" version="7.0.101" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V7.0.101
*
*   Mapping file:		XSLTransformation2_req_1.map
*   Map declaration(s):	XSLTransformation2_req_1
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FCustomerDomain-v1_0%252Fcom%252Fjunglesea%252Fbusinessservices%252Finterfaces%252FMaintainCustomerInformation%257DcreateCustomerRequestMsg/xpath%3D%252Fbody/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FCustomerDomain-v1_0%252Fcom%252Fjunglesea%252Fbusinessservices%252Finterfaces%252FMaintainCustomerInformation%257DcreateCustomer_createCustomerFaultMsg/xpath%3D%252Fbody/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:io="http://www.w3.org/2003/05/soap-envelope"
    xmlns:io2="http://CustomerDomain-v1_0/com/junglesea/bo"
    xmlns:io3="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io8="http://CustomerDomain-v1_0/com/junglesea/businessservices/interfaces/MaintainCustomerInformation"
    xmlns:io10="http://CommonDomain-v1_0/com/junglesea/bo"
    xmlns:io4="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io5="wsdl.http://CustomerDomain-v1_0/com/junglesea/businessservices/interfaces/MaintainCustomerInformation"
    xmlns:io6="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:io7="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:io9="http://www.w3.org/2005/08/addressing"
    xmlns:io11="http://CustomerDomain-Msg/com/junglesea/bo"
    xmlns:ExsltDatetime="xalan://org.apache.xalan.lib.ExsltDatetime"
    xmlns:map="http://TestBed/xslt/XSLTransformation2_req_1"
    exclude-result-prefixes="ExsltDatetime map xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="no"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="body" mode="map:XSLTransformation2_req_1"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "body" to "body".  -->
  <xsl:template match="body"  mode="map:XSLTransformation2_req_1">
    <body>
      <io8:createCustomerFault1_createCustomerFault>
        <!-- a simple mapping with no associated source:  to "Timestamp"(dateTime) -->
        <Timestamp>
          <xsl:value-of select="ExsltDatetime:dateTime()"/>
        </Timestamp>
        <!-- a simple mapping with no associated source:  to "SuggestedAction"(string) -->
        <SuggestedAction>
          <xsl:text>Invalid City. Please Check</xsl:text>
        </SuggestedAction>
      </io8:createCustomerFault1_createCustomerFault>
    </body>
  </xsl:template>

  <!-- *****************    Utility Templates    ******************  -->
  <!-- copy the namespace declarations from the source to the target -->
  <xsl:template name="copyNamespaceDeclarations">
    <xsl:param name="root"/>
    <xsl:for-each select="$root/namespace::*">
      <xsl:copy/>
    </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>
