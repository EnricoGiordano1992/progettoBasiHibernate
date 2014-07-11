/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2014-07-11 09:20:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.CartellaClinica;
import bean.RischiPaziente;
import java.sql.*;
import java.util.*;
import dbms.*;
import bean.*;

public final class PazientePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!-- Eseguo gli import necessari -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
 
    // Genero un oggetto della classe DBMS per gestire l'interzione con la base di dati
    DBMS dbms = new DBMS();
    String paziente;
    int i;

    if (request.getParameter("user") != null)
	    paziente = (String)request.getParameter("user");
    else
	    paziente = "";

    Paziente p = dbms.getPaziente(paziente);
    ArrayList<CartellaClinica> cartelle = dbms.getCartelleDelPaziente(p.getCodsan());
	ArrayList<RischiPaziente> rischi = dbms.getRischiDelPaziente(p.getCodsan());
	ArrayList<Medico> medici = dbms.getMediciDelPaziente(p.getCodsan());
	

      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<link href=\"css/default.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\tmedia=\"all\">\n");
      out.write("<link href=\"css/font.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<title>PazientePage</title>\n");
      out.write("\n");
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
      out.write("\t\t\t\t\t<li><a href=\"?ps=info\">Info</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"?ps=personale\">Personale</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"?ps=patologie\">Patologie</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"current_page_item\"><a href=\"?ps=login\">Login</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- end #menu -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br> <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div align=\"center\">\n");
      out.write("\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t<h1>PAGINA PERSONALE</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div align=\"center\">\n");
      out.write("\t\t\t<div class=\"title2\">\n");
      out.write("\t\t\t\t<h2>PAZIENTE</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<h1>\n");
      out.write("\t\t\t\t<a class=\"icon icon-arrow-right button\">");
      out.print( p.getCodsan() );
      out.write("</a>\n");
      out.write("\t\t\t</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"page\" class=\"container\">\n");
      out.write("\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t\t<h2>DATI DI REPARTO</h2>\n");
      out.write("\t\t\t\t\t<span class=\"byline\">Cliccare sulla cartella per accedere alle\n");
      out.write("\t\t\t\t\t\tsingole cartelle cliniche</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tMedici che hanno diagnosticato il paziente:\n");
      out.write("\t\t\t\t\t<strong>");
      out.print( medici.size() );
      out.write("</strong></p>\n");
      out.write("\t\t\t\t");
 
if(medici.size() > 0) {
	for(i = 0; i < medici.size(); i++) {

      out.write("\n");
      out.write("\t\t\t\t<p><strong>");
      out.print( medici.get(i).getNome() + " " + medici.get(i).getCognome() );
      out.write("</strong></p>\n");
      out.write("\t\t\t\t");
 }
}
	else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<p>Il paziente non e' stato diagnosticato da medici\n");
      out.write("\t\t\t\t\tdell'ospedale</p>\n");
      out.write("\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
 
if(cartelle.size() > 0) {
	for(i = 0; i < cartelle.size(); i++) {

      out.write("\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a class=\"icon icon-arrow-right button2\"\n");
      out.write("\t\t\t\t\t\thref=\"?ps=cartella&cartella=");
      out.print( cartelle.get(i).getId() );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t");
      out.print( cartelle.get(i).getId() );
      out.write("\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t(");
      out.print( cartelle.get(i).getDataRicovero() );
      out.write("\n");
      out.write("\t\t\t\t\t-\n");
      out.write("\t\t\t\t\t");
      out.print( cartelle.get(i).getDataDimissione() );
      out.write(")\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t");
 }
}
	else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<p>Il paziente non ha cartelle cliniche</p>\n");
      out.write("\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"sidebar\">\n");
      out.write("\t\t\t\t<div class=\"box2\">\n");
      out.write("\t\t\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t\t\t<h2>dati personali</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<ul class=\"style2\">\n");
      out.write("\t\t\t\t\t\t<li>Nome: <strong>");
      out.print( p.getNome()  );
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<li>Cognome: <strong>");
      out.print( p.getCognome()  );
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<li>Nascita: <strong>");
      out.print( p.getNascita()  );
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<li>Citta': <strong>");
      out.print( p.getCitta()  );
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<li>Via: <strong>");
      out.print( p.getVia()  );
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<li>Provincia: <strong>");
      out.print( p.getProv()  );
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<li>CAP: <strong>");
      out.print( p.getCap()  );
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<li>Civico: <strong>");
      out.print( p.getCivico()  );
      out.write("</strong>\n");
      out.write("\t\t\t\t\t\t<li>Rischi del paziente: <strong>");
 
if(rischi.size() > 0) {
	for(i = 0; i < rischi.size(); i++) {

      out.write(" <br>");
      out.print( rischi.get(i).getFattoriRischio().getNome() );
      out.write(' ');
 }
}	else {
      out.write(" <br>Il paziente non ha fattori a rischio ");
 } 
      out.write("</strong>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
