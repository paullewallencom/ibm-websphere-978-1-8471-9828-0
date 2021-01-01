<?xml version="1.0" encoding="UTF-8"?>
<!-- @generated mapFile="com/junglesea/transforms/SupplierPartnerOrderMSG_2_PurchaseOrderType.map" md5sum="b7b3a2b9f7bf54126fa36cde01bbf2bf" version="7.0.101" -->
<!--
*****************************************************************************
*   This file has been generated by the IBM XML Mapping Editor V7.0.101
*
*   Mapping file:		SupplierPartnerOrderMSG_2_PurchaseOrderType.map
*   Map declaration(s):	SupplierPartnerOrderMSG_2_PurchaseOrderType
*   Input file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FSupplierPartnerDomain-v1_0%252Fcom%252Fjunglesea%252Fbusinessservices%252Finterfaces%252FProcessSPOrders%257DsubmitSupplierOrderRequestMsg/xpath%3D%252Fbody/smo.xsd
*   Output file(s):		smo://smo/name%3Dwsdl-primary/message%3D%257Bhttp%253A%252F%252FMoonlightLibrary%252Fcom%252Fjunglesea%252Fapps%252Fmoonlight%252FProcessPurchaseOrder%257DprocessOrderRequestMsg/xpath%3D%252Fbody/smo.xsd
*
*   Note: Do not modify the contents of this file as it is overwritten
*         each time the mapping model is updated.
*****************************************************************************
-->
<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:in="http://CustomerDomain-v1_0/com/junglesea/bo"
    xmlns:in2="http://SupplierPartnerDomain-v1_0/com/junglesea/bo/msg"
    xmlns:in3="http://ProductDomain-v1_0/com/junglesea/bo"
    xmlns:in4="http://CommonDomain-v1_0/com/junglesea/bo"
    xmlns:in5="wsdl.http://SupplierPartnerDomain-v1_0/com/junglesea/businessservices/interfaces/ProcessSPOrders"
    xmlns:in6="http://BillingDomain-v1_0/com/junglesea/bo"
    xmlns:in7="http://SupplierPartnerDomain-v1_0/com/junglesea/businessservices/interfaces/ProcessSPOrders"
    xmlns:in8="http://CustomerDomain-Msg/com/junglesea/bo"
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
    xmlns:map="http://AccessServices-Moonlight2/com/junglesea/transforms/SupplierPartnerOrderMSG_2_PurchaseOrderType"
    exclude-result-prefixes="in in2 in3 in4 in5 in6 in7 in8 map xalan"
    version="1.0">
  <xsl:output method="xml" encoding="UTF-8" indent="no"/>

  <!-- root template  -->
  <xsl:template match="/">
    <xsl:apply-templates select="body" mode="map:SupplierPartnerOrderMSG_2_PurchaseOrderType"/>
  </xsl:template>

  <!-- This rule represents an element mapping: "body" to "body".  -->
  <xsl:template match="body"  mode="map:SupplierPartnerOrderMSG_2_PurchaseOrderType">
    <body>
      <out:processOrder>
        <purchaseOrder>
          <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/DeliveryDate"(date) to "orderDate"(date) -->
          <xsl:if test="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/DeliveryDate">
            <xsl:attribute name="orderDate">
              <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/DeliveryDate"/>
            </xsl:attribute>
          </xsl:if>
          <shipTo>
            <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/County"(string) to "country"(NMTOKEN) -->
            <xsl:if test="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/County">
              <xsl:attribute name="country">
                <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/County"/>
              </xsl:attribute>
            </xsl:if>
            <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/LineOne"(string) to "street"(string) -->
            <street>
              <xsl:value-of select="concat(in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/LineOne, in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/LineTwo, in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/LineThree, in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/Unit)"/>
            </street>
            <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/City"(string) to "city"(string) -->
            <city>
              <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/City"/>
            </city>
            <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/StateOrProvince"(string) to "state"(string) -->
            <state>
              <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/StateOrProvince"/>
            </state>
            <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/PostalCode"(string) to "zip"(decimal) -->
            <zip>
              <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingAddress/PostalCode"/>
            </zip>
          </shipTo>
          <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/Notes"(string) to "comment"(string) -->
          <xsl:if test="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/Notes">
            <comment>
              <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/Notes"/>
            </comment>
          </xsl:if>
          <items>
            <item>
              <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/PurchasedItem/SKU"(string) to "partNum"(SKU) -->
              <xsl:attribute name="partNum">
                <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/PurchasedItem/SKU"/>
              </xsl:attribute>
              <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/PurchasedItem/ProductDetails/ItemName"(string) to "productName"(string) -->
              <productName>
                <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/PurchasedItem/ProductDetails/ItemName"/>
              </productName>
              <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/PurchasedItem/ProductDetails/ItemQuantity"(int) to "quantity"(<positiveInteger>) -->
              <quantity>
                <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/PurchasedItem/ProductDetails/ItemQuantity"/>
              </quantity>
              <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/PurchasedItem/ProductDetails/ItemUnitPrice"(double) to "USPrice"(decimal) -->
              <USPrice>
                <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/PurchasedItem/ProductDetails/ItemUnitPrice"/>
              </USPrice>
              <!-- a simple data mapping: "in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingDate"(date) to "shipDate"(date) -->
              <xsl:if test="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingDate">
                <shipDate>
                  <xsl:value-of select="in7:submitSupplierOrder/inputParams/SupplierPartnerOrder/OrderItems/ShippingDate"/>
                </shipDate>
              </xsl:if>
            </item>
          </items>
        </purchaseOrder>
      </out:processOrder>
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