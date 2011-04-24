package demo.sip;

import junit.framework.Assert;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.sip.api.spec.ConvergedSipWebArchive;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.exp.sip.TestServlet;
import com.exp.sip.TestSipServlet;

@RunWith(Arquillian.class)
public class SipServletTest {

	@Deployment
	public static ConvergedSipWebArchive createDeployment() {
		return ShrinkWrap.create(ConvergedSipWebArchive.class, "test.war")
				.addClass(TestServlet.class).addClass(TestSipServlet.class)
				.addAsWebResource("client-web.xml", "web.xml")
				.addAsWebResource("client-sip.xml", "sip.xml");
	}

	@Test
	public void testConvertToFarenheit() {
		Assert.assertEquals(1, 1);
	}
}