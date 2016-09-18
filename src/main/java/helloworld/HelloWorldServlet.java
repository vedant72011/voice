package helloworld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazon.speech.speechlet.servlet.SpeechletServlet;

public class HelloWorldServlet extends SpeechletServlet {
	  public HelloWorldServlet() {
		  super();
		  this.setSpeechlet(new HelloWorldSpeechlet());
	  }
	  
	  
	  @Override
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			  throws ServletException, IOException
			  {
/*		  String protocol = req.getProtocol();
		  String msg = lStrings.getString("http.method_get_not_supported");
		  if (protocol.endsWith("1.1")) {
			  resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, msg);
		  } else {
			  resp.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
		  }*/
			  }
	  
}
