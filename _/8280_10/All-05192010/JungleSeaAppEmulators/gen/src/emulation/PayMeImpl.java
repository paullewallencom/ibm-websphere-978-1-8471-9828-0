package emulation;

import com.ibm.websphere.sca.ServiceManager;
import commonj.sdo.DataObject;

public class PayMeImpl {
	/**
	 * Default constructor.
	 */
	public PayMeImpl() {
		super();
	}

	/**
	 * Return a reference to the component service instance for this implementation
	 * class.  This method should be used when passing this service to a partner reference
	 * or if you want to invoke this component service asynchronously.    
	 *
	 * @generated (com.ibm.wbit.java)
	 */
	@SuppressWarnings("unused")
	private Object getMyService() {
		return (Object) ServiceManager.INSTANCE.locateService("self");
	}

	/**
	 * Method generated to support implementation of operation "ccMakePayment" defined for WSDL port type 
	 * named "CardPaymentServices".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject ccMakePayment(DataObject input1) {
		java.lang.String __result__1 = "Payment Succesful. Transaction Identifier is 0a0bd03e213";
		commonj.sdo.DataObject __result__2;
		{// create ccPayResponse
			com.ibm.websphere.bo.BOFactory factory = (com.ibm.websphere.bo.BOFactory) new com.ibm.websphere.sca.ServiceManager()
					.locateService("com/ibm/websphere/bo/BOFactory");
			__result__2 = factory.create(
					"http://PayMeLibrary/com/junglesea/apps/payme",
					"ccPayResponse");
		}
		return __result__2;

		//@generated:com.ibm.wbit.activity.ui
		//<?xml version="1.0" encoding="UTF-8"?>
		//<com.ibm.wbit.activity:CompositeActivity xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:com.ibm.wbit.activity="http:///com/ibm/wbit/activity.ecore" name="ActivityMethod">
		//  <parameters name="input1">
		//    <type xsi:type="com.ibm.wbit.activity:XSDElementType" name="ccPayRequest" namespace="http://PayMeLibrary/com/junglesea/apps/payme"/>
		//  </parameters>
		//  <result name="Result">
		//    <type xsi:type="com.ibm.wbit.activity:XSDElementType" name="ccPayResponse" namespace="http://PayMeLibrary/com/junglesea/apps/payme"/>
		//  </result>
		//  <executableElements xsi:type="com.ibm.wbit.activity:Expression" value="&quot;Payment Succesful. Transaction Identifier is 0a0bd03e213&quot;" assignable="false">
		//    <type xsi:type="com.ibm.wbit.activity:XSDElementType" name="string" namespace="http://www.w3.org/2001/XMLSchema"/>
		//  </executableElements>
		//  <executableElements xsi:type="com.ibm.wbit.activity:LibraryActivity" name="create ccPayResponse" description="create a new ccPayResponse {http://PayMeLibrary/com/junglesea/apps/payme}" category="SCA and BO services" template="com.ibm.websphere.bo.BOFactory factory = &#xA;   (com.ibm.websphere.bo.BOFactory) new com.ibm.websphere.sca.ServiceManager().locateService(&quot;com/ibm/websphere/bo/BOFactory&quot;);&#xA; &lt;%return%> factory.create(&quot;http://PayMeLibrary/com/junglesea/apps/payme&quot;,&quot;ccPayResponse&quot;);">
		//    <result>
		//      <dataOutputs target="//@executableElements.2"/>
		//      <type xsi:type="com.ibm.wbit.activity:XSDElementType" name="ccPayResponse" namespace="http://PayMeLibrary/com/junglesea/apps/payme" nillable="false"/>
		//    </result>
		//  </executableElements>
		//  <executableElements xsi:type="com.ibm.wbit.activity:ReturnElement" dataInputs="//@executableElements.1/@result/@dataOutputs.0"/>
		//  <executableGroups executableElements="//@executableElements.0"/>
		//  <executableGroups executableElements="//@executableElements.1 //@executableElements.2"/>
		//</com.ibm.wbit.activity:CompositeActivity>
		//@generated:end
		//!SMAP!*S WBIACTDBG
		//!SMAP!*L
		//!SMAP!1:1,1
		//!SMAP!2:2,6
		//!SMAP!3:8,1
		//!SMAP!1000000:39,1
	}

	/**
	 * Method generated to support implementation of operation "ccMakeSettlement" defined for WSDL port type 
	 * named "CardPaymentServices".
	 * 
	 * Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public String ccMakeSettlement(String input1) {
		//TODO Needs to be implemented.
		return null;
	}

	/**
	 * Method generated to support implementation of operation "ccDoCancel" defined for WSDL port type 
	 * named "CardPaymentServices".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject ccDoCancel(DataObject input1) {
		// To get or set attributes for DataObject input1, use the APIs as shown below:
		// To set a string attribute in input1, use input1.setString(stringAttributeName, stringValue)
		// To get a string attribute in input1, use input1.getString(stringAttributeName)
		// To set a dataObject attribute in input1, use input1.setDataObject(stringAttributeName, dataObjectValue)
		// To get a dataObject attribute in input1, use input1.getDataObject(stringAttributeName)
		return null;
	}

}