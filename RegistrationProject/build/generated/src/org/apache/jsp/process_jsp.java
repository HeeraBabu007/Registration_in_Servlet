package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class process_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("\t\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("\r\n");
      out.write("\t<title>Transport Company</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" charset=\"utf-8\" />\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"outer\">\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("      <div id=\"body-bot\">\r\n");
      out.write("        <div id=\"body-top\">\r\n");
      out.write("          <div id=\"logo\">\r\n");
      out.write("            <h1>TRANSPORT COMPANY</h1>\r\n");
      out.write("            <p>We care about your cargo</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"nav\">\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"home.jsp\">HOME</a></li>\r\n");
      out.write("              <li><a href=\"ritruck.jsp\">RECENTLY INSTALLED TRUCKS</a></li>\r\n");
      out.write("              <li><a href=\"status.jsp\">STATUS</a></li>\r\n");
      out.write("              <li><a href=\"towards.jsp\">TOWARDS HERE</a></li>\r\n");
      out.write("              <li><a href=\"services.jsp\">SERVICES</a></li>\r\n");
      out.write("              <li><a href=\"contactus.jsp\">CONTACT US</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"clear\"> </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <div id=\"page-title\">\r\n");
      out.write("\t\t\t\t  <span>\r\n");
      out.write("\t\t\t\t\t <h2 style=\"color:#4f7202;\">MOST CONVINIENT & RELIABLE</h2>\r\n");
      out.write("\t\t\t\t\t <h2 style=\"color:#4f7202;\">TRANSPORT SERVICES</h2>\r\n");
      out.write("\t\t\t\t   </span>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t   <p>\r\n");
      out.write("\t\t\t\t\t<a href=\"http://www.javatpoint.com\">Click here for details</a>\r\n");
      out.write("\t\t\t\t  </p>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("          <div id=\"gbox\">\r\n");
      out.write("            <div id=\"gbox-top\"> </div>\r\n");
      out.write("            <div id=\"gbox-bg\">\r\n");
      out.write("              <div id=\"gbox-grd\">\r\n");
      out.write("                <h2>WELCOME TO OUR TRUCK TRACKING COMPANY</h2>\r\n");
      out.write("\t\t\t\t<p>You can find All the Information regarding our transport company's services ,Trucks and can contact us to get your vehicle installed in our company</p>\r\n");
      out.write("\r\n");
      out.write("<p>You can find how many vehicle is on road through my company to your city or closest to it</p>\r\n");
      out.write("                <div id=\"features\">\r\n");
      out.write("                  <h2>FEATURED SERVICES</h2>\r\n");
      out.write("                  <ul>\r\n");
      out.write("                    <li><a href=\"http://www.javatpoint.com\">Free Core java tutorial</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.javatpoint.com\">Jsp tutorial</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.javatpoint.com\">Free Android Tutorial</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.javatpoint.com\">Struts and Hibernet Tutorial</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                  </ul>\r\n");
      out.write("                  <ul>\r\n");
      out.write("\t\t\t\t  \t<li><a href=\"http://www.javatpoint.com\">More Project</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.cstpoint.com\">C,C++ Tutorial</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.javatpoint.com/forum/\">The forum</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.cstpoint.com\">Html,Sql Tutorial</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                  <div class=\"clear\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"newsletter\">\r\n");
      out.write("                  <h2>Login Form</h2>\r\n");
      out.write("                  \r\n");
      out.write("                  ");

                  if(request.getAttribute("notlogin_msg")!=null){
                  
                  out.print(request.getAttribute("notlogin_msg"));
                  }
                   
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                  ");

                  if(request.getAttribute("Error")!=null){
                  
                  out.print(request.getAttribute("Error"));
                  }
                   
      out.write("\r\n");
      out.write("                  <form action=\"loginprocess.jsp\" method=\"get\" accept-charset=\"utf-8\">\r\n");
      out.write("                   <select name=\"branch\">\r\n");
      out.write("                   <option >Select a Branch</option>\r\n");
      out.write("                    <option>Kanpur</option>\r\n");
      out.write("                    <option>Agra</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"Delhi\">Delhi</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"Ghaziabad\">Ghaziabad</option>\r\n");
      out.write("                    </select><br/>\r\n");
      out.write("                    Username:<input type=\"text\" name=\"username\"/>\r\n");
      out.write("                    Password:<input type=\"password\" name=\"userpass\"/>\r\n");
      out.write("                    <input type=\"submit\" value=\"Login\"><a href=\"test.jsp\">Login as Admin</a>\r\n");
      out.write("                  </form>\r\n");
      out.write("                  <p><a href=\"http://www.javatpoint.com\">Click here for details</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"events\">\r\n");
      out.write("                  <h2>FEATURED EVENTS</h2>\r\n");
      out.write("                  <ul>\r\n");
      out.write("                  <li><a href=\"http://www.javatpoint.com\">More Project</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.cstpoint.com\">C,C++ Tutorial</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.javatpoint.com/forum/\">The forum</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.cstpoint.com\">Html,Sql Tutorial</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"> </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"gbox-bot\"> </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\t\t   \r\n");
      out.write("          <div id=\"greybox\" >\r\n");
      out.write("             \r\n");
      out.write("\t\t\t  <img src=\"images/pic_1.jpg\" width=\"164\" height=\"167\"></td><td> <img src=\"images/pic_2.jpg\" width=\"164\" height=\"167\">\r\n");
      out.write("\t\t\t  <img src=\"images/pic_3.jpg\" width=\"164\" height=\"167\"></td><td> <img src=\"images/pic_4.jpg\" width=\"164\" height=\"167\">\r\n");
      out.write("\t\t\t  <img src=\"images/pic_5.jpg\" width=\"164\" height=\"167\"></td><td> <img src=\"images/pic_6.jpg\" width=\"164\" height=\"167\">\r\n");
      out.write("\t\t\t  <img src=\"images/pic_7.jpg\" width=\"164\" height=\"167\"></td><td> <img src=\"images/pic_8.jpg\" width=\"164\" height=\"167\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("          </div>\r\n");
      out.write("\t\t  \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"copyright\">\r\n");
      out.write("   Copyright 2012 ,All Rights Reserved,For more information plz visit <a href=\"http://www.javatpoint.com\">Click Here </a>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
