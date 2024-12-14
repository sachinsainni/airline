package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Free HTML5 Templates</title>\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("  <link href=\"bootstrap-3.3.7-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("  <!-- modernizr enables HTML5 elements and feature detects -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"main\">\n");
      out.write("    <div>\n");
      out.write("<div class=\"login-box\">\n");
      out.write("      <div class=\"login-logo\">\n");
      out.write("        <a href=\"javascript:;\"><b>Geet Airlines</b></a>\n");
      out.write("      </div><!-- /.login-logo -->\n");
      out.write("      <div class=\"login-box-body\" style=\"background: #333;\">\n");
      out.write("        <p class=\"login-box-msg\">Sign in to start your session</p>\n");
      out.write("        <h5><span class=\"text-danger text-bold\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
session.removeAttribute("error");
      out.write("</span></h5>\n");
      out.write("        <form action=\"login\" method=\"post\">\n");
      out.write("          <div class=\"form-group has-feedback\">\n");
      out.write("            <input type=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("            <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group has-feedback\">\n");
      out.write("            <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("            <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-8\">\n");
      out.write("                <label>\n");
      out.write("                  <input type=\"checkbox\"> Remember Me\n");
      out.write("                </label>\n");
      out.write("            </div><!-- /.col -->\n");
      out.write("            <div class=\"col-xs-4\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">Sign In</button>\n");
      out.write("            </div><!-- /.col -->\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("        <a href=\"register.jsp\" class=\"text-center\">Register a new membership</a>\n");
      out.write("\n");
      out.write("      </div><!-- /.login-box-body -->\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </div><!--close main-->\n");
      out.write("     \n");
      out.write("  <!-- javascript at the bottom for fast page loading -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
