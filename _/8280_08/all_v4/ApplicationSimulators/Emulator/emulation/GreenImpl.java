package emulation;

import commonj.sdo.DataObject;
import com.ibm.websphere.sca.ServiceManager;

public class GreenImpl {
	/**
	 * Default constructor.
	 */
	public GreenImpl() {
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
	 * Method generated to support implementation of operation "createCustomerAccount" defined for WSDL port type 
	 * named "CustomerProfile".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public String createCustomerAccount(DataObject input1) {
		// To get or set attributes for DataObject input1, use the APIs as shown below:
		// To set a string attribute in input1, use input1.setString(stringAttributeName, stringValue)
		// To get a string attribute in input1, use input1.getString(stringAttributeName)
		// To set a dataObject attribute in input1, use input1.setDataObject(stringAttributeName, dataObjectValue)
		// To get a dataObject attribute in input1, use input1.getDataObject(stringAttributeName)
		return null;
	}

	/**
	 * Method generated to support implementation of operation "modifyCustomerAccount" defined for WSDL port type 
	 * named "CustomerProfile".
	 * 
	 * The presence of commonj.sdo.DataObject as the return type and/or as a parameter 
	 * type conveys that it is a complex type. Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public String modifyCustomerAccount(DataObject input1) {
		// To get or set attributes for DataObject input1, use the APIs as shown below:
		// To set a string attribute in input1, use input1.setString(stringAttributeName, stringValue)
		// To get a string attribute in input1, use input1.getString(stringAttributeName)
		// To set a dataObject attribute in input1, use input1.setDataObject(stringAttributeName, dataObjectValue)
		// To get a dataObject attribute in input1, use input1.getDataObject(stringAttributeName)
		return null;
	}

	/**
	 * Method generated to support implementation of operation "findCustomer" defined for WSDL port type 
	 * named "CustomerProfile".
	 * 
	 * Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public String findCustomer(String input1) {
		//TODO Needs to be implemented.
		return null;
	}

	/**
	 * Method generated to support implementation of operation "getCustomerDetails" defined for WSDL port type 
	 * named "CustomerProfile".
	 * 
	 * Please refer to the WSDL Definition for more information 
	 * on the type of input, output and fault(s).
	 */
	public String getCustomerDetails(String input1) {
		//TODO Needs to be implemented.
		return null;
	}

}