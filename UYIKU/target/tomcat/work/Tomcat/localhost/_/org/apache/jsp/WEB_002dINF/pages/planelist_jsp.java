/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-03-06 05:42:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class planelist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/staticfile/js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<title>jquery突显图片效果</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url('/staticfile/images/welcome.jpg');\r\n");
      out.write("\tbackground-size:100% 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body, div, ul, li, img {\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".all {\r\n");
      out.write("\twidth: 1050px;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tmargin: 300px auto;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tpadding: 10px 0 0 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 186px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-right: 10px;\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".side-bar a, .chat-tips i {\r\n");
      out.write("\tbackground: url(right_bg.png) no-repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".side-bar {\r\n");
      out.write("\twidth: 66px;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tbottom: 20px;\r\n");
      out.write("\tright: 25px;\r\n");
      out.write("\tfont-size: 0;\r\n");
      out.write("\tline-height: 0;\r\n");
      out.write("\tz-index: 100;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".side-bar a {\r\n");
      out.write("\twidth: 66px;\r\n");
      out.write("\theight: 66px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tbackground-color: #ddd;\r\n");
      out.write("\tmargin-bottom: 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".side-bar .back {\r\n");
      out.write("\tbackground-position: 0 -62px;\r\n");
      out.write("}\r\n");
      out.write("#back{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom:60px;\r\n");
      out.write("\tright:100px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$('li').mouseover(function(e) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(this).siblings().stop().fadeTo(500, 0.4);\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('li').mouseout(function(e) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(this).siblings().stop().fadeTo(500, 1);\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"all\" id=\"box\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit1.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit2.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit3.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit4.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit5.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit6.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit7.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit8.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit9.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<a href=\"toplaneInfo.action\">\r\n");
      out.write("\t\t\t<li><img src=\"images/suits/suit10.jpg\" width=\"200\" height=\"186\" /></li>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"back\">\r\n");
      out.write("\t\t<a href=\"togarde.action\"><img src=\"/staticfile/images/back.png\"></a>\r\n");
      out.write("\t</div> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}