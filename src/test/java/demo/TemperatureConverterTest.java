package demo;

import junit.framework.Assert;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import javax.inject.Inject;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ByteArrayAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.exp.TemperatureConverter;

@RunWith(Arquillian.class)
public class TemperatureConverterTest {
	@Inject
	private TemperatureConverter converter;

	@Deployment
	public static JavaArchive createTestArchive() {

		return ShrinkWrap.create(JavaArchive.class, "test.jar")

		.addClasses(TemperatureConverter.class)

		.addAsManifestResource(

		new ByteArrayAsset("<beans/>".getBytes()),

		ArchivePaths.create("beans.xml"));

	}

	@Test
	public void testConvertToCelsius() {

		System.out.println("cc=>"+converter);
		Assert.assertEquals(converter.convertToCelsius(32d), 0d);

		Assert.assertEquals(converter.convertToCelsius(212d), 100d);

	}

	@Test
	public void testConvertToFarenheit() {

		Assert.assertEquals(converter.convertToFarenheit(0d), 32d);

		Assert.assertEquals(converter.convertToFarenheit(100d), 212d);

	}
}
