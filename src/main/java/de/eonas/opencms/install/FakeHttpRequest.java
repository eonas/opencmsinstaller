package de.eonas.opencms.install;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class FakeHttpRequest implements HttpServletRequest {
	@SuppressWarnings("unchecked")
	Map parameter;
	@SuppressWarnings("unchecked")
	Vector EMPTY = new Vector();
	private HttpSession session;
	
	@SuppressWarnings("unchecked")
	public FakeHttpRequest ( Map in_parameter )
	{
		this.parameter = in_parameter;
		this.session = new FakeSession();
	}

	public String getAuthType() {
		return null;
	}

	public String getContextPath() {
		return null;
	}

	public Cookie[] getCookies() {
		return new Cookie[0];
	}

	public long getDateHeader(String arg0) {
		return 0;
	}

	public String getHeader(String arg0) {
		return null;
	}

	public Enumeration getHeaderNames() {
		return EMPTY.elements();
	}

	public Enumeration getHeaders(String arg0) {
		return EMPTY.elements();
	}

	public int getIntHeader(String arg0) {
		return 0;
	}

	public String getMethod() {
		return "GET";
	}

	public String getPathInfo() {
		return "";
	}

	public String getPathTranslated() {
		return null;
	}

	public String getQueryString() {
		return null;
	}

	public String getRemoteUser() {
		return null;
	}

	public String getRequestURI() {
		return null;
	}

	public StringBuffer getRequestURL() {
		return null;
	}

	public String getRequestedSessionId() {
		return null;
	}

	public String getServletPath() {
		return null;
	}

	public HttpSession getSession() {
		return session;
	}

	public HttpSession getSession(boolean arg0) {
		return null;
	}

	public Principal getUserPrincipal() {
		return null;
	}

	public boolean isRequestedSessionIdFromCookie() {
		return false;
	}

	public boolean isRequestedSessionIdFromURL() {
		return false;
	}

	public boolean isRequestedSessionIdFromUrl() {
		return false;
	}

	@Override
	public boolean authenticate(HttpServletResponse httpServletResponse) throws IOException, ServletException {
		return false;
	}

	@Override
	public void login(String s, String s1) throws ServletException {

	}

	@Override
	public void logout() throws ServletException {

	}

	@Override
	public Collection<Part> getParts() throws IOException, ServletException {
		return null;
	}

	@Override
	public Part getPart(String s) throws IOException, ServletException {
		return null;
	}

	public boolean isRequestedSessionIdValid() {
		return false;
	}

	public boolean isUserInRole(String arg0) {
		return false;
	}

	public Object getAttribute(String arg0) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public Enumeration getAttributeNames() {
		return null;
	}

	public String getCharacterEncoding() {
		return null;
	}

	public int getContentLength() {
		return 0;
	}

	public String getContentType() {
		return null;
	}

	public ServletInputStream getInputStream() throws IOException {
		
		return null;
	}

	public String getLocalAddr() {
		
		return null;
	}

	public String getLocalName() {
		
		return null;
	}

	public int getLocalPort() {
		
		return 0;
	}

	@Override
	public ServletContext getServletContext() {
		return null;
	}

	@Override
	public AsyncContext startAsync() throws IllegalStateException {
		return null;
	}

	@Override
	public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException {
		return null;
	}

	@Override
	public boolean isAsyncStarted() {
		return false;
	}

	@Override
	public boolean isAsyncSupported() {
		return false;
	}

	@Override
	public AsyncContext getAsyncContext() {
		return null;
	}

	@Override
	public DispatcherType getDispatcherType() {
		return null;
	}

	public Locale getLocale() {
		
		return null;
	}

	@SuppressWarnings("unchecked")
	public Enumeration getLocales() {
		
		return null;
	}

	public String getParameter(String arg0) {
		return (String)parameter.get(arg0);
	}

	@SuppressWarnings("unchecked")
	public Map<String, String[]> getParameterMap() {
		Map<String, String[]> map = new HashMap<String, String[]>();

        for (Object o : parameter.keySet()) {
            String key = (String) o;
            Object obj = parameter.get(key);
            if ( obj instanceof String ) {
                String[] arr = new String[1];
                arr[0] = (String)obj;
                map.put(key, arr);
            } else {
                map.put(key, (String[])obj);
            }
        }
        return map;
	}

	@SuppressWarnings("unchecked")
	public Enumeration getParameterNames() {
		
		return null;
	}

	public String[] getParameterValues(String arg0) {
		
		return null;
	}

	public String getProtocol() {
		
		return null;
	}

	public BufferedReader getReader() throws IOException {
		
		return null;
	}

	public String getRealPath(String arg0) {
		
		return null;
	}

	public String getRemoteAddr() {
		
		return null;
	}

	public String getRemoteHost() {
		
		return null;
	}

	public int getRemotePort() {
		
		return 0;
	}

	public RequestDispatcher getRequestDispatcher(String arg0) {
		
		return null;
	}

	public String getScheme() {
		
		return null;
	}

	public String getServerName() {
		
		return null;
	}

	public int getServerPort() {
		
		return 0;
	}

	public boolean isSecure() {
		
		return false;
	}

	public void removeAttribute(String arg0) {
		

	}

	public void setAttribute(String arg0, Object arg1) {
		

	}

	public void setCharacterEncoding(String arg0)
			throws UnsupportedEncodingException {
		

	}

}
