<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="xslt/setCustomerInfo.map" md5sum="ebadfe4b50cada1592f2a1b6378851f8" version="7.0.101" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V7.0.101
*
*   Mapping file:		setCustomerInfo.map
*   Map declaration(s):	setCustomerInfo
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FCh6Library%252Fcom%252Fjunglesea%252Fch6%252Fmediations%252Finterfaces%252FCreditManagement%257DrequestCreditApprovalRequestMsg/xpath%3D%252Fbody/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FCh6Library%252Fcom%252Fjunglesea%252Fch6%252Fmediations%252Finterfaces%252FWashingtonCreditAgencyService%257DrequestCreditApprovalRequestMsg/xpath%3D%252Fbody/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:in="wsdl.http://Ch6Library/com/junglesea/ch6/mediations/interfaces/CreditManagement"
    xmlns:in2="http://Ch6Library/com/junglesea/ch6/mediations/interfaces/CreditManagement"
    xmlns:out="wsdl.http://Ch6Library/com/junglesea/ch6/mediations/interfaces/WashingtonCreditAgencyService"
    xmlns:io="http://www.w3.org/2003/05/soap-envelope"
    xmlns:io3="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io2="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:io4="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io5="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:out2="http://Ch6Library/com/junglesea/ch6/mediations/interfaces/WashingtonCreditAgencyService"
    xmlns:io6="http://Ch6Library"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:io7="http://www.w3.org/2005/08/addressing"
    xmlns:map="http://Ch6/xslt/setCustomerInfo"
    exclude-result-prefixes="in in2 map xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="no"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="body" mode="map:setCustomerInfo"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "body" to "body".  -->
  <xsl:template match="body"  mode="map:setCustomerInfo">
    <body>
      <out2:requestCreditApproval>
        <!-- a simple data mapping: "in2:requestCreditApproval/customerCreditRequest/id"(string) to "customerInfo"(string) -->
        <customerInfo>
          <xsl:value-of select="in2:requestCreditApproval/customerCreditRequest/id"/>
        </customerInfo>
      </out2:requestCreditApproval>
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