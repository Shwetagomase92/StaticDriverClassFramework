package requestRepositoryPackage;

public class Post_Req_Repository 
{
	public static String baseURI() 
	{
		String baseURI="https://reqres.in/";
		return baseURI;
	}
	
	public static String post_resource() 
	{
		String resource="/api/users";
		return resource;
	}
	
	public static String post_req_tc1() 
	{
		String requestBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return requestBody;
		
	}

}
