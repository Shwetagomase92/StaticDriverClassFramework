package restAssuredDriverClassFramework1;

import java.io.IOException;
import testClassPackage.Post_TC1;

public class DriverClass 
{

	public static void main(String[] args) throws IOException 
	{
		//static driver class because we call the test class execute method
		Post_TC1.execute();

	}

}
