// Copyright (c) 2003-2013, Jodd Team (jodd.org). All Rights Reserved.

package jodd.http;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class Echo2Servlet extends EchoServlet {

	protected void readAll(HttpServletRequest req) throws IOException {
		queryString = req.getQueryString();
		header = copyHeaders(req);
		params = copyParams(req);
	}

}