package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Gateway;
import testComponents.BaseClass;

public class GatewayPage extends BaseClass {

	@Test
	public void demoGatewayPage() throws IOException {
		
		Gateway gt=new Gateway(driver);
		gt.pre_approval_dis().click();
	}
	
}
