import static org.junit.Assert.*;

import org.junit.Test;

public class MathLibTest {

	@Test
	public void testAdd() {
		MathLib obj = new MathLib();
		assert(-1.0==obj.Add(0.5,-1.5));
	}
	
	@Test
	public void testSub() {
		MathLib obj = new MathLib();
		assert(1==obj.Sub(2,1));
	}

}
