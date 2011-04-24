package demo;
import java.io.File;
import java.net.URI;

import org.jboss.arquillian.api.Deployment;

import org.jboss.arquillian.junit.Arquillian;

import org.jboss.shrinkwrap.api.ShrinkWrap;

import org.jboss.shrinkwrap.api.spec.WebArchive;

import org.junit.Test;

import org.junit.runner.RunWith;


@RunWith(Arquillian.class)

public class SipServeletFromWarCase {

   @Deployment

   public static WebArchive createTestArchive() {

	   
      return ShrinkWrap.createFromZipFile(WebArchive.class,new File("G:/workspaces/arq/demo_ws/arq_demo/src/test/resources/sip_failover.war"));
   }



   @Test

   public void shouldBeAbleToInjectEJB() throws Exception {
	   System.out.println("HEEEEEEEEEEEEEEEEEEEEEEEEEEELllllllllllllllll");
	  
   }

}