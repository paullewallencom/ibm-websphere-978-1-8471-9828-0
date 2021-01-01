<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="com/junglesea/transforms/moonAdapterOut_2_moonAdapterFacade_res_1.map" md5sum="99b548cb51c0fcfb3c4d6a320d6ae552" version="7.0.101" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V7.0.101
*
*   Mapping file:		moonAdapterOut_2_moonAdapterFacade_res_1.map
*   Map declaration(s):	moonAdapterOut_2_moonAdapterFacade_res_1
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FAccessServices-Moonlight2%252FMoonlightJDBCAdapterImport%257DcreateDb2adminSupplierordersBGResponseMsg/xpath%3D%252Fbody/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FMoonlightLibrary%252Fcom%252Fjunglesea%252Fapps%252Fmoonlight%252FProcessPurchaseOrder%257DprocessOrderResponseMsg/xpath%3D%252Fbody/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:in="http://www.ibm.com/xmlns/prod/websphere/j2ca/jdbc/existsresult"
    xmlns:in2="wsdl.http://AccessServices-Moonlight2/MoonlightJDBCAdapterImport"
    xmlns:in3="http://com/ibm/j2ca/fault"
    xmlns:in4="http://www.ibm.com/xmlns/prod/websphere/j2ca/jdbc/db2adminsupplierorders"
    xmlns:in5="http://www.ibm.com/xmlns/prod/websphere/bo/6.0.0"
    xmlns:in6="http://AccessServices-Moonlight2/MoonlightJDBCAdapterImport"
    xmlns:in7="http://www.ibm.com/xmlns/prod/websphere/j2ca/jdbc/db2adminsupplierordersbg"
    xmlns:in8="http://com/ibm/j2ca/fault/afcfault"
    xmlns:io="http://www.w3.org/2003/05/soap-envelope"
    xmlns:out="http://MoonlightLibrary/com/junglesea/apps/moonlight/ProcessPurchaseOrder"
    xmlns:io3="http://www.ibm.com/xmlns/prod/websphere/mq/sca/6.0.0"
    xmlns:io2="http://www.ibm.com/websphere/sibx/smo/v6.0.1"
    xmlns:io4="http://schemas.xmlsoap.org/ws/2004/08/addressing"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:io5="http://www.ibm.com/xmlns/prod/websphere/http/sca/6.1.0"
    xmlns:out2="wsdl.http://MoonlightLibrary/com/junglesea/apps/moonlight/ProcessPurchaseOrder"
    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    xmlns:io6="http://www.w3.org/2005/08/addressing"
    xmlns:map="http://AccessServices-Moonlight2/com/junglesea/transforms/moonAdapterOut_2_moonAdapterFacade_res_1"
    exclude-result-prefixes="in in2 in3 in4 in5 in6 in7 in8 map xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="no"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="body" mode="map:moonAdapterOut_2_moonAdapterFacade_res_1"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "body" to "body".  -->
  <xsl:template match="body"  mode="map:moonAdapterOut_2_moonAdapterFacade_res_1">
    <body>
      <out:processOrderResponse>
        <!-- a simple data mapping: "in6:createDb2adminSupplierordersBGResponse/in6:createDb2adminSupplierordersBGOutput/Db2adminSupplierorders/sp_order_id"(string) to "purchaseOrder"(string) -->
        <purchaseOrder>
          <!-- variables for custom code -->
          <xsl:variable name="sp_order_id" select="in6:createDb2adminSupplierordersBGResponse/in6:createDb2adminSupplierordersBGOutput/Db2adminSupplierorders/sp_order_id"/>
          <xsl:value-of select="concat("Order Successfully Created with the Supplier / Partner. Order reference is : " , $sp_order_id )"/>
        </purchaseOrder>
      </out:processOrderResponse>
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