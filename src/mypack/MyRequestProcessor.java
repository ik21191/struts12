package mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.RequestProcessor;

public class MyRequestProcessor extends RequestProcessor
{
	@Override
	protected boolean processPreprocess(HttpServletRequest request,
			HttpServletResponse response)
	{
		try{
		
		System.out.println("MyRequestProcessor is called.");
	return true;}catch(Exception e){System.out.println(e);}
	return false;
	}
}
