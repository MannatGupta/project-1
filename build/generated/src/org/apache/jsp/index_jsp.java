package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE h+tml>\r\n");
      out.write("<!--[if lt IE 7 ]> <html lang=\"en\" class=\"no-js ie6 lt8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7 ]>    <html lang=\"en\" class=\"no-js ie7 lt8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8 ]>    <html lang=\"en\" class=\"no-js ie8 lt8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 9 ]>    <html lang=\"en\" class=\"no-js ie9\"> <![endif]-->\r\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!--> <html lang=\"en\" class=\"no-js\"> <!--<![endif]-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">  -->\r\n");
      out.write("        <title>Find Your Apartment | Login </title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \r\n");
      out.write("        <meta name=\"description\" content=\"Login and Registration Form with HTML5 and CSS3\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"html5, css3, form, switch, animation, :target, pseudo-class\" />\r\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate-custom.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!--/ Codrops top bar -->\r\n");
      out.write("            <header>\r\n");
      out.write("                <h1>Finding Your <span>Dream Home </span>Is Easier now</h1>\r\n");
      out.write("            </header>\r\n");
      out.write("            <section>\t\t\t\t\r\n");
      out.write("                <div id=\"container_demo\" >\r\n");
      out.write("                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->\r\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\r\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\r\n");
      out.write("                    <div id=\"wrapper\">\r\n");
      out.write("                        <div id=\"login\" class=\"animate form\">\r\n");
      out.write("                            <form  action=\"login\" autocomplete=\"on\" method=\"post\"> \r\n");
      out.write("                                <h1>Log in</h1> \r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"username\" class=\"uname\" data-icon=\"u\" > Your email or username </label>\r\n");
      out.write("                                    <input id=\"username\" name=\"username\" required=\"required\" type=\"text\" />\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> Your password </label>\r\n");
      out.write("                                    <input id=\"password\" name=\"password\" required=\"required\" type=\"password\"  /> \r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p class=\"keeplogin\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"loginkeeping\" id=\"loginkeeping\" value=\"loginkeeping\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"loginkeeping\">Keep me logged in</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                                <p class=\"login button\"> \r\n");
      out.write("                                    <input type=\"submit\" value=\"Login\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                                <p class=\"change_link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tNot a member yet ?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#toregister\" class=\"to_register\">Join us</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"register\" class=\"animate form\">\r\n");
      out.write("                            <form  action=\"Signup\" autocomplete=\"on\" method=\"post\"> \r\n");
      out.write("                                <h1> Sign up </h1> \r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"emailsignup\" class=\"youmail\" data-icon=\"e\" > Your Username or email</label>\r\n");
      out.write("                                    <input id=\"emailsignup\" name=\"username\" required=\"required\" type=\"text\" /> \r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\">Your Name</label>\r\n");
      out.write("                                    <input id=\"usernamesignup\" name=\"first_name\" required=\"required\" type=\"text\"  />\r\n");
      out.write("                                </p>\r\n");
      out.write("                                \r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"passwordsignup\" class=\"youpasswd\" data-icon=\"p\">Your password </label>\r\n");
      out.write("                                    <input id=\"passwordsignup\" name=\"password\" required=\"required\" type=\"password\" />\r\n");
      out.write("                                </p>\r\n");
      out.write("                                \r\n");
      out.write("                                <p class=\"signin button\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Sign up\"/> \r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                                <p class=\"change_link\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\tAlready a member ?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#tologin\" class=\"to_register\"> Go and log in </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>  \r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
