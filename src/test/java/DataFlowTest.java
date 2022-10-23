import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * <p>Title: </p>
 * <p>Copyright (c) 2022</p>
 * <p>Company: </p>
 *
 * @author Nguyen Van Linh
 * @version 1.0
 */
public class DataFlowTest
{
	@Test
	public void test1()
	{
		String password = "12345678";
		Assertions.assertEquals(Main.checkPassword(password), Main.Status.VALID);
	}

	@Test
	public void test2()
	{
		String password = "1234";
		Assertions.assertEquals(Main.checkPassword(password), Main.Status.INVALID);
	}
}
