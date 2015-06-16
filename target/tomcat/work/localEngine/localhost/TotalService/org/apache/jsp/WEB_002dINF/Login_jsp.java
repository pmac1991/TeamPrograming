package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("    <meta name=\"description\" content=\"\" />\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta name=\"language\" content=\"en\" />\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("<link href=\"site.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>Hello my friend!!!</title>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"main\">\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("           <center> <h1><a href=\"#\">Login</a></h1> </center>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"menu\">\r\n");
      out.write("            <ul><!--  \r\n");
      out.write("                <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                <li><a href=\"#\">About us</a></li>\r\n");
      out.write("                <li><a href=\"http://localhost:8080/TotalService/firms\">Firms</a></li>\r\n");
      out.write("                <li><a href=\"#\">Help</a></li>\r\n");
      out.write("                <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("               <li><a href=\"http://localhost:8080/TotalService/login\">Login</a></li>\r\n");
      out.write("               \r\n");
      out.write("\t\t\t\t-->\r\n");
      out.write("                \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"middle\">\r\n");
      out.write("            <div id=\"sidebar\"><div id=\"sidebar2\">\r\n");
      out.write("                    <h2> </h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                                           \r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <h2> </h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <h2></h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    </ul>\r\n");
      out.write("            </div></div>\r\n");
      out.write("            <div id=\"right\"><div id=\"right2\">\r\n");
      out.write("                    <h2>  </h2>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("                        <p></p>\r\n");
      out.write("                    </div>\r\n");
      out.write(" \r\n");
      out.write("\t\t<form action=\"login\" method=\"post\">\r\n");
      out.write("\t\t\t<h2>Login:</h2><br>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"login\"><br>\r\n");
      out.write("\t\t\tpassword:<br>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"password\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"login\" value=\"Enter\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginError}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <h2></h2>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"Registeruser\">Registration as a user</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                      <ul>\r\n");
      out.write("                        <li><a href=\"Registerfirm\">Registration as a firm</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                            \r\n");
      out.write("                        \r\n");
      out.write("                        <p> </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h2></h2>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("                         \r\n");
      out.write("                    </div>\r\n");
      out.write("            </div></div>\r\n");
      out.write("            <div class=\"clearing\">&nbsp;</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("            <p>Copyright &copy; Your Name, designed by <a href=\"http://www.alphastudio.pl\" target=\"_blank\">Alpha Studio</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
