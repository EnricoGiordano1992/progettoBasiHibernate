/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2014-07-14 11:57:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import dbms.*;
import bean.*;

public final class Info_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- Eseguo gli import necessari -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    // Genero un oggetto della classe DBMS per gestire l'interzione con la base di dati
    DBMS dbms = new DBMS();
    
    Medico primario = dbms.getPrimario(); 


      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<link href=\"css/default.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\tmedia=\"all\">\n");
      out.write("<link href=\"css/font.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div id=\"header-wrapper\">\n");
      out.write("\t\t\t<div id=\"header\" class=\"container\">\n");
      out.write("\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Ospedale San Gibbordano</a>\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t<p>Divisione ospedaliera di Medicina</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"menu-wrapper\">\n");
      out.write("\t\t\t<div id=\"menu\" class=\"container\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"?\">Homepage</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"current_page_item\"><a href=\"?ps=info\">Info</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"?ps=personale\">Personale</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"?ps=patologie\">Patologie</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"?ps=login\">Login</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- end #menu -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br> <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div align=\"center\">\n");
      out.write("\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t<h1>PRESENTAZIONE</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div align=\"center\">\n");
      out.write("\t\t\t<div class=\"title2\">\n");
      out.write("\t\t\t\t<h2>PRIMARIO</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<a class=\"button\">");
      out.print( "" + primario.getNome() + " " + primario.getCognome() );
      out.write("</a>\n");
      out.write("\t\t\t<br><br><br>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"title, style2\" style=\"margin-left:10%;margin-right:10%;\" align=\"center\">\n");
      out.write("\t\t\t<p>Il reparto di Medicina Generale ha come obiettivo quello di curare i pazienti portatori di patologie internistiche con un approccio globale e rigoroso.</p>\n");
      out.write("\t\t\t<img style=\"width:100%;\" src=\"css/images/pic01.jpg\" alt=\"image#1\" />\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\t\t\t<p>Il Reparto di Medicina &egrave situato al 6&ordm piano dell&prime;Ospedale S. Gibbordano (Blocco D) La dotazione &egrave di 31 posti-letto ubicati in 6 stanze da 2 letti e in 5 stanze da 4 letti tutte con servizio igienico, (tranne una a 2 letti).</p>\n");
      out.write("\t\t\t<img style=\"width:100%;\" src=\"css/images/pic06.jpg\" alt=\"image#1\" />\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\t\t\t<p>In Reparto vi sono poi due locali attrezzati di personal computer per il lavoro medico. In uno di questi &egrave presente anche un lettino per visita medica. Vi &egrave inoltre una stanza per il lavoro infermieristico e una per la Coordinatrice Infermieristica.</p>\n");
      out.write("\t\t\t<img style=\"width:100%;\" src=\"css/images/pic07.png\" alt=\"image#1\" />\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\t\t\t<p>Antistante al Reparto vi sono due ambulatori: uno per lo studio del sistema nervoso autonomo e uno per ecocardiografia.</p>\n");
      out.write("\t\t\t<img style=\"width:100%;\" src=\"css/images/pic08.jpg\" alt=\"image#1\" />\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\t\t\t<p>L&prime;attivit&agrave di Day-Hospital (DH) &egrave svolta al 1&ordm piano dove &egrave situato il DH Generale di tutto l&prime;Ospedale S.Gibbordano.</p>\n");
      out.write("\t\t\t<img style=\"width:100%;\" src=\"css/images/pic09.jpg\" alt=\"image#1\" />\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"banner3\"></div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
