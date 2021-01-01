<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/XSLTransformation1_req_3.map" md5sum="7a7181bf6bf0c38b77576ab37c0f5751" version="7.0.101" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V7.0.101
*
*   Mapping file:		XSLTransformation1_req_3.map
*   Map declaration(s):	XSLTransformation1_req_3
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FCustomerDomain-v1_0%252Fcom%252Fjunglesea%252Fbusinessservices%252Finterfaces%252FProcessCustomerPayments%257DprocessPaymentRequestMsg/xpath%3D%252Fbody/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FCustomerDomain-v1_0%252Fcom%252Fjunglesea%252Fbusinessservices%252Finterfaces%252FProcessCustomerPayments%257DprocessPaymentResponseMsg/xpath%3D%252Fbody/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:io="http://CustomerDomain-v1_0/com/junglesea/businessservices/interfaces/ProcessCustomerPayments"
    xmlns:io2="http://www.w3.org/2003/05/soap-envelope"
    xmlns:io3="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io4="http://BillingDomain-Msg/com/junglesea/bo"
    xmlns:io5="wsdl.http://CustomerDomain-v1_0/com/junglesea/businessservices/interfaces/ProcessCustomerPayments"
    xmlns:io6="http://BillingDomain-v1_0/com/junglesea/bo/msg"
    xmlns:io8="http://ProductDomain-v1_0/com/junglesea/bo"
    xmlns:io7="http://CommonDomain-v1_0/com/junglesea/bo"
    xmlns:io9="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io10="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:io11="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:io12="http://BillingDomain-v1_0/com/junglesea/bo"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:io13="http://www.w3.org/2005/08/addressing"
    xmlns:map="http://TestBed/xslt/XSLTransformation1_req_3"
    exclude-result-prefixes="map xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="no"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="body" mode="map:XSLTransformation1_req_3"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "body" to "body".  -->
  <xsl:template match="body"  mode="map:XSLTransformation1_req_3">
    <body>
      <io:processPaymentResponse>
        <outputParams xsi:nil="true"/>
      </io:processPaymentResponse>
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