package lab5;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import balloon.Balloon;

public class BalloonTest {
	
	// margin of error for floating-point comparisons
    // private static final double EPSILON = 10e-07;
	private Balloon b;

	@Before
	public void Setup()
	{
		b = new Balloon(6000);
	}
	
	@Test
	public void initialRadiusTest()
	{
		Balloon bb = new Balloon(2147483647);
		assertEquals(0, bb.getRadius());
	}
	
	@Test
	public void initialPopped()
	{
		Balloon bb = new Balloon(2147483647);
		assertEquals(false, bb.isPopped());
	}
	
	@Test
	public void blowUp()
	{
		b = new Balloon(6000);
		b.blow(500);
		assertEquals(500, b.getRadius());
	}
	
	@Test
	public void deflate()
	{
		b = new Balloon(6000);
		b.blow(500);
		b.deflate();
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void PostDeflateBlow()
	{
		b = new Balloon(6000);
		b.blow(500);
		b.deflate();
		b.blow(5247);
		assertEquals(5247, b.getRadius());
	}
	
	@Test
	public void DeflatePopTest()
	{
		b = new Balloon(6000);
		b.blow(500);
		b.deflate();
		assertEquals(false, b.isPopped());
	}
	
	@Test
	public void TestBlowPop()
	{
		b = new Balloon(6000);
		b.blow(600000000);
		assertEquals(true, b.isPopped());
	}
	
	@Test
	public void TestPop()
	{
		b = new Balloon(6000);
		b.blow(500);
		b.pop();
		assertEquals(true, b.isPopped());
	}
	
	@Test
	public void TestPopRadius()
	{
		b = new Balloon(6000);
		b.blow(2147483647);
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void TestinitialZeroMaxRadius()
	{
		b = new Balloon(-2147483648);
		b.blow(1);
		assertEquals(true, b.isPopped());
	}
	
	@Test
	public void TestNegativeBlowAmount()
	{
		b = new Balloon(-2147483648);
		b.blow(-2147483648);
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void TestPostPopBlowing()
	{
		b = new Balloon(2147483647);
		b.blow(500);
		b.pop();
		b.blow(7000000);
		assertEquals(0, b.getRadius());
	}
	
	@Test
	public void TestDualBlowing()
	{
		b = new Balloon(2147483647);
		b.blow(1);
		b.blow(2);
		assertEquals(3, b.getRadius());
	}
	
}
