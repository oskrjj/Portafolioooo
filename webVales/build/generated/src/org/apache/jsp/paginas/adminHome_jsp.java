package org.apache.jsp.paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("       \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.css\"/>\n");
      out.write("      \n");
      out.write(" \n");
      out.write("         <style>\n");
      out.write("             padding-left: 11em;\n");
      out.write("            body {background-color:  #000\\9;}\n");
      out.write("            h1   {color: buttonface;}\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("        <title>JSP Admin Home</title>\n");
      out.write("    </head>\n");
      out.write("    <div id=\"divcabezera\">\n");
      out.write("        \n");
      out.write("        <div id=\"tituloAdmin\">\n");
      out.write("          <h1 style=\"text-align:center;\">Menu Administrador</h1>  \n");
      out.write("        </div> \n");
      out.write("    <body\n");
      out.write("                <ul class=\"nav nav-tabs\">\n");
      out.write("            <li class=\"active\"><a href=\"#\"><span class=\"glyphicon glyphicon-home\"></span>Home</a></li>\n");
      out.write("            <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Perfil</a></li>\n");
      out.write("            <li><a href=\"#\"><span class=\"glyphicon glyphicon glyphicon-log-in\"></span> Cerrar Session</a></li>\n");
      out.write("                </ul>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("     \n");
      out.write("          <div class=\"container\" >\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    \n");
      out.write("                    <div id=\"adminPersonal\" class=\"divMenu\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary btn-lg btn-block\">Admistrar Usuarios</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"adminVales\" class=\"divMenu\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary btn-lg btn-block\">Admistrar Vales</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"adminMenu\" class=\"divMenu\">\n");
      out.write("                         <button type=\"button\" class=\"btn btn-primary btn-lg btn-block\">Admistrar Menú</button>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div id=\"adminTurnos\" class=\"divMenu\">\n");
      out.write("                         <button type=\"button\" class=\"btn btn-primary btn-lg btn-block\">Admistrar Turnos</button>\n");
      out.write("                    </div>\n");
      out.write("                 \n");
      out.write("                </div>\n");
      out.write("            </div>                                     \n");
      out.write("        </div>   \n");
      out.write("   \n");
      out.write("    </body>\n");
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
