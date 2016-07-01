package de.eonas.opencms.install;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import javax.servlet.*;
import javax.servlet.descriptor.JspConfigDescriptor;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.el.ExpressionEvaluator;
import javax.servlet.jsp.el.VariableResolver;

public class FakePageContext extends PageContext {
	@SuppressWarnings("unchecked")
	Vector EMPTY = new Vector();

	public class FakeServletContext implements ServletContext {

		public Object getAttribute(String arg0) {
			return null;
		}

		@SuppressWarnings("unchecked")
		public Enumeration getAttributeNames() {
			return EMPTY.elements();
		}

		@Override
		public String getContextPath() {
			return null;
		}

		public ServletContext getContext(String arg0) {
			return null;
		}

		public String getInitParameter(String arg0) {
			return null;
		}

		@SuppressWarnings("unchecked")
		public Enumeration getInitParameterNames() {
			return EMPTY.elements();
		}

		@Override
		public boolean setInitParameter(String s, String s1) {
			return false;
		}

		public int getMajorVersion() {
			return 0;
		}

		public String getMimeType(String arg0) {
			return null;
		}

		public int getMinorVersion() {
			return 0;
		}

		@Override
		public int getEffectiveMajorVersion() {
			return 0;
		}

		@Override
		public int getEffectiveMinorVersion() {
			return 0;
		}

		public RequestDispatcher getNamedDispatcher(String arg0) {
			return null;
		}

		public String getRealPath(String arg0) {
			return base + "/" + arg0;
		}

		public RequestDispatcher getRequestDispatcher(String arg0) {
			return null;
		}

		public URL getResource(String arg0) throws MalformedURLException {	
			return new URL("file:///" + base + "/" + arg0);
		}

		public InputStream getResourceAsStream(String arg0) {
			try {
				return new FileInputStream(getRealPath(arg0));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		}

		@SuppressWarnings("unchecked")
		public Set getResourcePaths(String arg0) {
			return Collections.EMPTY_SET;
		}

		public String getServerInfo() {
			return "Apache Tomcat/5";
		}

		public Servlet getServlet(String arg0) throws ServletException {
			return null;
		}

		public String getServletContextName() {
			return "/opencms";
		}

		@Override
		public ServletRegistration.Dynamic addServlet(String s, String s1) {
			return null;
		}

		@Override
		public ServletRegistration.Dynamic addServlet(String s, Class<? extends Servlet> aClass) {
			return null;
		}

		@Override
		public <T extends Servlet> T createServlet(Class<T> aClass) throws ServletException {
			return null;
		}

		@Override
		public ServletRegistration getServletRegistration(String s) {
			return null;
		}

		@Override
		public Map<String, ? extends ServletRegistration> getServletRegistrations() {
			return null;
		}

		@Override
		public FilterRegistration.Dynamic addFilter(String s, String s1) {
			return null;
		}

		@Override
		public FilterRegistration.Dynamic addFilter(String s, Class<? extends Filter> aClass) {
			return null;
		}

		@Override
		public <T extends Filter> T createFilter(Class<T> aClass) throws ServletException {
			return null;
		}

		@Override
		public FilterRegistration getFilterRegistration(String s) {
			return null;
		}

		@Override
		public Map<String, ? extends FilterRegistration> getFilterRegistrations() {
			return null;
		}

		@Override
		public SessionCookieConfig getSessionCookieConfig() {
			return null;
		}

		@Override
		public void setSessionTrackingModes(Set<SessionTrackingMode> set) {

		}

		@Override
		public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
			return null;
		}

		@Override
		public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
			return null;
		}

		@Override
		public void addListener(String s) {

		}

		@Override
		public <T extends EventListener> void addListener(T t) {

		}

		@Override
		public void addListener(Class<? extends EventListener> aClass) {

		}

		@Override
		public <T extends EventListener> T createListener(Class<T> aClass) throws ServletException {
			return null;
		}

		@Override
		public JspConfigDescriptor getJspConfigDescriptor() {
			return null;
		}

		@Override
		public ClassLoader getClassLoader() {
			return null;
		}

		@Override
		public void declareRoles(String... strings) {

		}

		@SuppressWarnings("unchecked")
		public Enumeration getServletNames() {
			return (EMPTY).elements();
		}

		@SuppressWarnings("unchecked")
		public Enumeration getServlets() {
			return (new Vector()).elements();
		}

		public void log(String arg0) {
			System.out.println(arg0);
		}

		public void log(Exception arg0, String arg1) {
			System.out.println(arg0 + ":" + arg1);
		}

		public void log(String arg0, Throwable arg1) {
			// TODO Auto-generated method stub

		}

		public void removeAttribute(String arg0) {
			// TODO Auto-generated method stub

		}

		public void setAttribute(String arg0, Object arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public ServletRegistration.Dynamic addServlet(String var1, Servlet var2) {
			return null;
		}

		@Override
		public FilterRegistration.Dynamic addFilter(String s, Filter f) {
			return null;
		}


	}

	public class FakeServletConfig implements ServletConfig {

		public String getInitParameter(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@SuppressWarnings("unchecked")
		public Enumeration getInitParameterNames() {
			return EMPTY.elements();
		}

		public ServletContext getServletContext() {
			return context;
		}

		public String getServletName() {
			return null;
		}

	}

	String base;
	ServletConfig config;
	ServletContext context;
	
	public FakePageContext(String opencmsbasedir) {
		base = opencmsbasedir;
		config = new FakeServletConfig();
		context = new FakeServletContext();
	}

	@Override
	public void forward(String arg0) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Exception getException() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletRequest getRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletResponse getResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletConfig getServletConfig() { 
		return config;
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public HttpSession getSession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handlePageException(Exception arg0) throws ServletException,
			IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void handlePageException(Throwable arg0) throws ServletException,
			IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void include(String arg0) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void include(String arg0, boolean arg1) throws ServletException,
			IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(Servlet arg0, ServletRequest arg1,
			ServletResponse arg2, String arg3, boolean arg4, int arg5,
			boolean arg6) throws IOException, IllegalStateException,
			IllegalArgumentException {
		// TODO Auto-generated method stub

	}

	@Override
	public void release() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object findAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Enumeration getAttributeNamesInScope(int arg0) {
		return EMPTY.elements();
	}

	@Override
	public int getAttributesScope(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ExpressionEvaluator getExpressionEvaluator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JspWriter getOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableResolver getVariableResolver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAttribute(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAttribute(String arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAttribute(String arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAttribute(String arg0, Object arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
