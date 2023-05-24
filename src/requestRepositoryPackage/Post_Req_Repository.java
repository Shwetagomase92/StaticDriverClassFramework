package requestRepositoryPackage;

public class Post_Req_Repository 
{   
	//declare base uri
	public static String baseURI() 
	{
		String baseURI="https://reqres.in/";
		return baseURI;
	}
	
	//declare resource
	public static String post_resource() 
	{
		String resource="/api/users";
		return resource;
	}
	
	//declare requestBody
	public static String post_req_tc1() 
	{
		String requestBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return requestBody;
		
	}

}
