package com.hcl.cf.webstore.test.strutstest;

import com.hcl.cf.webstore.web.struts.actions.DisplayProductAction;

public class DisplayProductActionTest extends BaseStrutsTestCase { 

	public DisplayProductActionTest(String name) {
		super(name);
	}

	/** 
	 * Invoke all interceptors and specify value of the action 
	 * class' domain objects directly. 
	 * @throws Exception Exception 
	 */
	public void testInterceptorsBySettingDomainObjects() 
	throws Exception { 
		DisplayProductAction action = (DisplayProductAction) createAction(DisplayProductAction.class, 
				"/webstore", "getProduct"); 
		action.setId(1); 
		String result = proxy.execute(); 
		assertEquals(result, "success"); 
	} 

	/** 
	 * Skip interceptors and specify value of action class' 
	 * domain objects by setting them directly. 
	 * @throws Exception Exception 
	 */
	public void testActionAndSkipInterceptors() throws Exception { 
		DisplayProductAction action = (DisplayProductAction) createAction(DisplayProductAction.class, 
				"/webstore", "getProduct"); 
		action.setId(1); 
		String result = action.execute(); 
		assertEquals(result, "success"); 
	} 
}