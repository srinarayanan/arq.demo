package demo;
import javax.ejb.EJB;

import org.jboss.arquillian.api.Deployment;

import org.jboss.arquillian.junit.Arquillian;

import org.jboss.shrinkwrap.api.ShrinkWrap;

import org.jboss.shrinkwrap.api.spec.JavaArchive;

import org.junit.Assert;

import org.junit.Test;

import org.junit.runner.RunWith;


@RunWith(Arquillian.class)

public class InjectionTestCase {

   @Deployment

   public static JavaArchive createTestArchive() {

      return ShrinkWrap.create(JavaArchive.class, "test.jar")

         .addClasses(GreetingManager.class, GreetingManagerBean.class);

   }


   @EJB

   private GreetingManager greetingManager;


   @Test

   public void shouldBeAbleToInjectEJB() throws Exception {

      String userName = "Earthlings";

      Assert.assertEquals("Hello " + userName, greetingManager.greet(userName));

   }

}