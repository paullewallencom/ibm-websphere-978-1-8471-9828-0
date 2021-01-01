package com.junglesea.solution.greeting.process.service;

import com.ibm.websphere.sca.ServiceManager;

public class getGreetingImpl {
	/**
	 * Default constructor.
	 */
	public getGreetingImpl() {
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
	 * Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public String getGreeting(Integer age) {
		//TODO Needs to be implemented.
		return null;
	}

}