package com.junglesea.solution.greeting.process.service;

import commonj.sdo.DataObject;
import com.ibm.websphere.sca.ServiceManager;

public class getGreetingImpl3 {
	/**
	 * Default constructor.
	 */
	public getGreetingImpl3() {
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
	 * Method generated to support implementation of operation "getGreeting" defined for WSDL port type 
	 * named "customGreeting".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public String getGreeting(DataObject personInfo) {
		// To get or set attributes for DataObject personInfo, use the APIs as shown below:
		// To set a string attribute in personInfo, use personInfo.setString(stringAttributeName, stringValue)
		// To get a string attribute in personInfo, use personInfo.getString(stringAttributeName)
		// To set a dataObject attribute in personInfo, use personInfo.setDataObject(stringAttributeName, dataObjectValue)
		// To get a dataObject attribute in personInfo, use personInfo.getDataObject(stringAttributeName)
		String returnGreeting = new String();
		int age = personInfo.getInt("age");
		String name = personInfo.getString("FirstName")+" " +personInfo.getString("LastName");
		if ( age <= 25 ){
			returnGreeting = "Whats up " + name + "! Congrats on your first hello world BPEL." ;
		}
		else if ( age > 25 && age <= 65){
			returnGreeting = "Hey " + name + "! Congrats on your first hello world BPEL." ;
		}
		else {
			returnGreeting = "Greetings " + name +"! Congrats on your first hello world BPEL." ;
		}
		return returnGreeting;
	}

}