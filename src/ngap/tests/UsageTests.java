package ngap.tests;

import ngap.IActionTarget;
import ngap.actions.DontLikeAtAll;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class UsageTests {

	Mockery mockery = new Mockery();
	
	@Test(expected=NullPointerException.class)
	public void testDontLikeAtAll() {
		DontLikeAtAll l = new DontLikeAtAll(null);
		l.DoAction();
	}

	@Test
	public void testDoAction() {
		final IActionTarget t = mockery.mock(IActionTarget.class);
		mockery.checking(new Expectations() {{
			oneOf(t).getTargetName();
		}});
		DontLikeAtAll l = new DontLikeAtAll(t);
		l.DoAction();
	}

}
