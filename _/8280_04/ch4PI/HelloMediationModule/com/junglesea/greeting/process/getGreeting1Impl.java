package com.junglesea.greeting.process;

import commonj.sdo.DataObject;
import com.ibm.websphere.sca.ServiceManager;

public class getGreeting1Impl {
	/**
	 * Default constructor.
	 */
	public getGreeting1Impl() {
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
		String returnGreeting = new String();
		int age = personInfo.getInt("age");
		String name = personInfo.getString("FirstName") + " "
				+ personInfo.getString("LastName");
		returnGreeting = "Whats up " + name
				+ "! Congrats on your first hello world BPEL. ";
		return returnGreeting;
	}



}