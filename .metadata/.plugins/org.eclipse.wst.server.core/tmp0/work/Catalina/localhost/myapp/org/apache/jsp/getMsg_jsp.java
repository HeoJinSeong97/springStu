/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2021-07-22 11:05:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getMsg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("\tMassively by HTML5 UP\r\n");
      out.write("\thtml5up.net | @ajlkn\r\n");
      out.write("\tFree for personal and commercial use under the CCA 3.0 license (html5up.net/license)\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>getMsg</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("\t\t<noscript><link rel=\"stylesheet\" href=\"assets/css/noscript.css\" /></noscript>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"is-preload\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Wrapper -->\r\n");
      out.write("\t\t\t<div id=\"wrapper\" class=\"fade-in\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Footer -->\r\n");
      out.write("\t\t\t\t\t<footer id=\"footer\">\r\n");
      out.write("\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t<form method=\"post\" action=\"updateMsg.do\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.mid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"mid\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"fields\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"writer\">Writer</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"writer\" id=\"writer\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"content\">Content</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"content\" id=\"content\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"actions\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"Update Message\" /></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t <a href=\"deleteMsg.do?mid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.mid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></a>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Copyright -->\r\n");
      out.write("\t\t\t\t\t<div id=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t<ul><li>&copy; Untitled</li><li>Design: <a href=\"https://html5up.net\">HTML5 UP</a></li></ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Scripts -->\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/browser.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
