package org.apache.jsp.WEB_002dINF.partials;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/partials/../css/custom_css_v1.css");
    _jspx_dependants.add("/WEB-INF/partials/../javascript/appController.js");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html ng-app=\"app\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Samp Web Project</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.2.1.min.js\"\n");
      out.write("            integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\"\n");
      out.write("            crossorigin=\"anonymous\">\n");
      out.write("        </script>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.1/angular.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.1/angular-route.min.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Palanquin:500\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            ");
      out.write("/*regular*/\r\n");
      out.write("body {\r\n");
      out.write("    font-family: 'Palanquin', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-top: 1%;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    z-index: -1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*classes*/\r\n");
      out.write(".right-nav-item {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    left: 245%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".thumbnail {\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   border: none;\r\n");
      out.write("   background-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("item-image {\r\n");
      out.write("    transition: 1s all;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".item-info{\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".item-box {\r\n");
      out.write("    background-color: white;\r\n");
      out.write("    margin: 4%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".down-arrow-menu {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 2em;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-box {\r\n");
      out.write("    margin: 18% 35%;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    background-color: #d9d9d9;\r\n");
      out.write("    padding: 5%;\r\n");
      out.write("    border: 1px solid #bfbfbf;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".usermessage {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    width: 50%;\r\n");
      out.write("    margin: 0.5% auto;\r\n");
      out.write("    margin-bottom: 1%;\r\n");
      out.write("    padding: 1% 5%;\r\n");
      out.write("    border-style: outset;\r\n");
      out.write("    border-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".badinput-message {\r\n");
      out.write("    background-color: rgba(255, 214, 51 , 0.5); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("    border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/*id's*/\r\n");
      out.write("\r\n");
      out.write("#shopMenu {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    background-color: whitesmoke;\r\n");
      out.write("    padding-left: 0;\r\n");
      out.write("    border: 1px solid whitesmoke;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#shopHeadLine{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 2%;\r\n");
      out.write("    font-size: 2rem;\r\n");
      out.write("    margin-bottom: 1%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*#itemsGallery {\r\n");
      out.write("    border: 1px solid whitesmoke;\r\n");
      out.write("    width: 800px;\r\n");
      out.write("    height: 300px;\r\n");
      out.write("    border-style: solid;\r\n");
      out.write("}*/\r\n");
      out.write("\r\n");
      out.write("/*others*/\r\n");
      out.write("\r\n");
      out.write(".navbar , footer {\r\n");
      out.write("    background-color: #4d4d4d;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr.hr-style { \r\n");
      out.write("  height: 30px; \r\n");
      out.write("  border-style: solid; \r\n");
      out.write("  border-color: #8c8b8b; \r\n");
      out.write("  border-width: 1px 0 0 0; \r\n");
      out.write("  border-radius: 20px; \r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("hr.hr-style:before { \r\n");
      out.write("  display: block; \r\n");
      out.write("  content: \"\"; \r\n");
      out.write("  height: 30px; \r\n");
      out.write("  margin-top: -31px; \r\n");
      out.write("  border-style: solid; \r\n");
      out.write("  border-color: #8c8b8b; \r\n");
      out.write("  border-width: 0 0 1px 0; \r\n");
      out.write("  border-radius: 20px; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li.menu-option {\r\n");
      out.write("    padding: 2%;\r\n");
      out.write("    font-size: medium;\r\n");
      out.write("    display: block;\r\n");
      out.write("    border-radius: 0;\r\n");
      out.write("    transition: 1s all;\r\n");
      out.write("    background-color: whitesmoke;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li.menu-option:hover {\r\n");
      out.write("    background-color: black;\r\n");
      out.write("    color:white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav a {\r\n");
      out.write("    color: white;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    transition: 1s all;\r\n");
      out.write("}\r\n");
      out.write(".nav a:hover {\r\n");
      out.write("    color: black; \r\n");
      out.write("}");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            var app = angular.module('app' , []);\n");
      out.write("            ");
      out.write("/* \n");
      out.write(" * To change this license header, choose License Headers in Project Properties.\n");
      out.write(" * To change this template file, choose Tools | Templates\n");
      out.write(" * and open the template in the editor.\n");
      out.write(" */\n");
      out.write("app.controller('ctrl' ,function($scope , $http){\n");
      out.write("    \n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("                <li class=\"left-nav-item\"><a href=\"/\">Home</a></li>\n");
      out.write("                <li class=\"left-nav-item\"><a href=\"/products\">products</a></li>\n");
      out.write("                ");
 if(request.getSession(false).getAttribute("user") != null){
                        String output ="<li class=\"right-nav-item\"><a href=\"/logout\">logout</a><span>";
                        output += " logged as " + request.getSession(false).getAttribute("user");
                        output += "</span></li>";
                        out.println(output);
                    }
                    else{
                        out.println("<li class=\"right-nav-item\"><a href=\"/login\">login</a></li>");
                        out.println("<li class=\"right-nav-item\"><a href=\"/register\">register</a></li>");
                    }
                
      out.write("\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("                \n");
      out.write("                ");
 if(request.getAttribute("userMessage") != null){ 
      out.write("\n");
      out.write("                <p class=\"usermessage badinput-message\">");
out.print(request.getSession(false).getAttribute("userMessage"));
      out.write("</p>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                \n");
      out.write("                        \n");
      out.write("        \n");
      out.write("            \n");
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
