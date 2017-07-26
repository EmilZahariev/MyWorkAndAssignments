import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTriangle {
	private Triangle t;

	@Before
	public void setUp() throws Exception {
		t = new Triangle(3, 4, 5);
	}

	@Test
	public void scaleneOk() {
		assertTrue(t.isScalene());
	}
}