package de.thingweb.client.security;
import java.io.IOException;

import junit.framework.TestCase;

public class TestSecurity4NicePlugfest extends TestCase {
	
	boolean deactivateSecurityTests = true;
	
	public void testES256_1() throws IOException {
		if(deactivateSecurityTests) {
			System.err.println("Client security tests deactivated till AWS services are back at work");
			return;
		}
		// ES256
		Security4NicePlugfest s4p = new Security4NicePlugfest();
		Registration reg = s4p.requestRegistrationAM();
		if (reg != null) {
			String ast = s4p.requestASToken(reg);
			assertTrue(ast.length() > 0);// TODO better check
		}
	}
	
	public void testHS256_1() throws IOException {
		if(deactivateSecurityTests) {
			System.err.println("Client security tests deactivated till AWS services are back at work");
			return;
		}
		// HS256
		Security4NicePlugfest s4p = new Security4NicePlugfest();
		Registration regAS = s4p.requestRegistrationAS();
		if (regAS != null) {
			String ast = s4p.requestASToken(regAS);
			assertTrue(ast.length() > 0);// TODO better check
		}
	}

}
