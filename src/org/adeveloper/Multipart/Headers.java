package org.adeveloper.Multipart;

import java.util.HashMap;
import java.util.Map;

public class Headers
{

	private Map<String, String> headers;
	
	public Headers()
	{
		headers = new HashMap<String, String>();
	}
	
	
	public void add(String name, String value)
	{
		headers.put(name, value);
	}
	
	public Map<String, String> getHeaders()
	{
		return headers;
	}

}
