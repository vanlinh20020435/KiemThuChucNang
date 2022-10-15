/**
 * <p>Title: </p>
 * <p>Copyright (c) 2022</p>
 * <p>Company: </p>
 *
 * @author Nguyen Van Linh
 * @version 1.0
 */
public class Main
{
	public static enum Status
	{
		VALID, INVALID
	}

	public static Status checkPassword(String password)
	{
		int length = password.length();
		Status status;
		if (length < 6 || length > 12)
			status = Status.INVALID;
		else
			status = Status.VALID;
		return status;
	}
}
