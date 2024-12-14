package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Connection;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Geet Airlines</title>\n");
      out.write("        <meta name=\"description\" content=\"website description\" />\n");
      out.write("        <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("        <link href=\"bootstrap-3.3.7-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <link href=\"css/datepicker.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap-timepicker/css/bootstrap-timepicker.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- modernizr enables HTML5 elements and feature detects -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/modernizr-1.5.min.js\"></script>\n");
      out.write("        <style >\n");
      out.write("            .newfont{\n");
      out.write("                font-size: 15px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"main\">\n");
      out.write("        <div >\n");
      out.write("            ");

                String userid = (String) session.getAttribute("userid");
                String usertype = (String) session.getAttribute("usertype");
                if (userid != null && userid != "") {
                    String db = null;
                    String dbuser = null;
                    String dbpass = null;
                    db
                            = getServletContext().getInitParameter("mysql-db");
                    dbuser
                            = getServletContext().getInitParameter("mysql-user");
                    dbpass
                            = getServletContext().getInitParameter("mysql-pass");
                    String fid = request.getParameter("id");
                    int id = Integer.parseInt(fid);
                    String provider = null;
                    String source = null;
                    String destination = null;
                    String flightnumber = null;
                    String price = null;
                    String Duration = null;

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection connection = DriverManager.getConnection("jdbc:mysql:///" + db + "", dbuser, dbpass);
                        CallableStatement cstmt = null;
                        String SQL = "select * from flightmaster where flightid = " + id + "";

                        cstmt = connection.prepareCall(SQL);
                        ResultSet rs = cstmt.executeQuery(SQL);
                        while (rs.next()) {
                            provider = rs.getString("provider");
                            source = rs.getString("source");
                            destination = rs.getString("destination");
                            flightnumber = rs.getString("flightnumber");
                            price = rs.getString("price");
                            Duration = rs.getString("duration");
                        }
                    } catch (Exception e) {
                        out.print("EXCEPTION IS:" + e);

                    }
            
      out.write("\n");
      out.write("            <header>\n");
      out.write("                <div id=\"banner\">\n");
      out.write("                    <div id=\"welcome\">\n");
      out.write("                        <h2>Geet Airlines</h2>\n");
      out.write("                    </div><!--close welcome-->\t\t\t  \t\n");
      out.write("                </div><!--close banner-->\t\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <nav>\n");
      out.write("                <div id=\"menubar\">\n");
      out.write("                    <ul id=\"nav\">\n");
      out.write("                        <li ><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"viewflights.jsp\">All flights</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("                        <li><a href=\"logout\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!--close menubar-->\t\n");
      out.write("            </nav>\t\n");
      out.write("\n");
      out.write("            <div id=\"site_content\">\t\t\n");
      out.write("\n");
      out.write("                <div class=\"slideshow\">\n");
      out.write("                    <ul class=\"slideshow\">\n");
      out.write("                        <li class=\"show\"><img width=\"940\" height=\"300\" src=\"images/home_1.jpg\" alt=\"&quot;Enter your caption here&quot;\" /></li>\n");
      out.write("                        <li><img width=\"940\" height=\"300\" src=\"images/home_2.jpg\" alt=\"&quot;Enter your caption here&quot;\" /></li>\n");
      out.write("                    </ul> \n");
      out.write("                </div><!--close slideshow-->\t\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"content\" style=\"width:915px;\">\n");
      out.write("                    <div class=\"content_item\" style=\"width:915px;\">\n");
      out.write("                        <h4><span class=\"text-success pull-left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${success}", java.lang.String.class, (PageContext)_jspx_page_context, null));
session.removeAttribute("success");
      out.write("</span></h4>\n");
      out.write("                        <h4><span class=\"text-danger pull-left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
session.removeAttribute("error");
      out.write("</span></h4>\n");
      out.write("                     <div align=\"center\"><span><h1>Book flight</h1></span></div> \n");
      out.write("                        <form class=\"form-horizontal\" id=\"bookingform\" method=\"POST\" action=\"book\" >\n");
      out.write("                            <input type=\"hidden\" name=\"flightno\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"\" class=\"col-sm-4 control-label newfont\" >Flight number</label>\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <input readonly type=\"text\" class=\"form-control input-sm\" required id=\"inputName\" value=\"");
      out.print(flightnumber);
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\" >\n");
      out.write("                                <label for=\"\" class=\"col-sm-4 control-label newfont\" >Provider</label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                    <input readonly type=\"text\" class=\"form-control input-sm\" required id=\"inputName\" value=\"");
      out.print(provider);
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"\" class=\"col-sm-4 control-label newfont\" >Source</label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                    <input readonly type=\"text\" class=\"form-control input-sm\" required id=\"inputName\" value=\"");
      out.print(source);
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"\" class=\"col-sm-4 control-label newfont\" >Destination</label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                   <input readonly type=\"text\" class=\"form-control input-sm\" required id=\"inputName\" value=\"");
      out.print(destination);
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"\" class=\"col-sm-4 control-label newfont\" >Total flight time</label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                    <input  type=\"text\" readonly class=\"form-control input-sm\" value=\"");
      out.print(Duration);
      out.write("\" required placeholder=\"Total flight time\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"\" class=\"col-sm-4 control-label newfont\" >Price</label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                    <input type=\"number\" name=\"price\" class=\"form-control input-sm\" required value=\"");
      out.print(price);
      out.write("\" readonly  placeholder=\"Price\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-4 control-label newfont\">Flight date </label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                    <input required readonly type=\"text\" class=\"form-control input-sm\" name=\"fdate\" id=\"fdate\">                                     \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-4 control-label newfont\">Flight Time </label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                    <input required readonly type=\"text\" class=\"form-control input-sm\" name=\"ftime\" id=\"ftime\">                                     \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-4 control-label newfont\">Enter Card no.</label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                    <input required type=\"number\" name=\"cardno\" class=\"form-control input-sm\" maxlength=\"16\" minlength=\"14\" id=\"cardno\">                                     \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-4 control-label newfont\">Enter CVV</label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                    <input type=\"number\" required name=\"CVV\" class=\"form-control input-sm\" maxlength=\"3\" minlength=\"3\" id=\"CVV\">                                     \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-4 control-label newfont\">Expiry date</label>\n");
      out.write("                                <div class=\"col-sm-6\" >\n");
      out.write("                                    <input name=\"expiry\" readonly required class=\"form-control input-sm\" id=\"expiry\">                                     \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"hidden\"  id=\"hiddentime\" value=\"");
      out.print(id);
      out.write("\" name=\"hiddenid\">\n");
      out.write("                            <div align=\"center\">\n");
      out.write("                                <input class=\"btn btn-primary\" type=\"submit\" onclick=\"submittime()\" value=\"Book\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div><!--close content_item-->\n");
      out.write("                </div><!--close content-->   \n");
      out.write("\n");
      out.write("            </div><!--close site_content-->  \t\n");
      out.write("\n");
      out.write("            <footer>\n");
      out.write("                <a href=\"index.jsp\">Home</a> | <a href=\"book.jsp\">Book Movies</a> | <a href=\"contact.jsp\">Contact</a><br/><br/>\n");
      out.write("            </footer> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- javascript at the bottom for fast page loading -->\n");
      out.write("            <script src=\"js/jquery-2.1.1.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"bootstrap-3.3.7-dist/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script type=\"text/javascript\" src=\"js/image_slide.js\"></script>\n");
      out.write("            <script src=\"js/jquery.validate.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"js/bootstrap-datepicker.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script src=\"bootstrap-timepicker/js/bootstrap-timepicker.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            <script>\n");
      out.write("                 $(function ( ) {\n");
      out.write("\n");
      out.write("                $(\"#bookingform\").validate();\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("                $('#fdate').datepicker();\n");
      out.write("                $('#expiry').datepicker();\n");
      out.write("                $('#ftime').timepicker();\n");
      out.write("            </script>\n");
      out.write("            ");

                } else {
                    out.print("<div style='padding: 200px 0px 0px 520px;'><h1><span style='color:white;font-size:45px;'>Login as admin  </span></h1><br><div  style='padding: 0px 0px 0px 90px;'><div class='button_small'><a style='padding-left:20px;' href='login.jsp' >Login</a></div></div></div>");
                }
            
      out.write("\n");
      out.write("        </div><!--close main-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
