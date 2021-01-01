package com.junglesea.solutions.creditagency;

import commonj.sdo.DataObject;

import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.ServiceManager;

public class NewYorkCreditAgencyImpl {
	/**
	 * Default constructor.
	 */
	public NewYorkCreditAgencyImpl() {
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
	 * Method generated to support implementation of operation "requestCreditApproval" defined for WSDL port type 
	 * named "CreditManagement".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public DataObject requestCreditApproval(DataObject customerInfo) {
		ServiceManager serviceManager = ServiceManager.INSTANCE;
		BOFactory boFactory = (BOFactory)serviceManager.locateService("com/ibm/websphere/bo/BOFactory");
		DataObject customerCreditApproval = boFactory.create("http://Ch6Library","CustomerCreditApproval");
		customerCreditApproval.setString("id",customerInfo.getString("id"));
		customerCreditApproval.setString("approvalStatus","Approved");
		customerCreditApproval.setString("approvalCode","0000");
		customerCreditApproval.setString("approvalDescription","Credit has been approved");
		customerCreditApproval.setString("creditScore","740");
		customerCreditApproval.setString("ratingAgency","New York Rating Agency"); 
		System.out.println ("**********************New York Credti Agency Invoked ***********");
		return customerCreditApproval;
	}

}