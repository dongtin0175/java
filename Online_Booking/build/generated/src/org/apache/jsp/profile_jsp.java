package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("                        <html>\n");
      out.write("                            <head>\n");
      out.write("                                <meta charset='utf-8'>\n");
      out.write("                                <meta name='viewport' content='width=device-width, initial-scale=1'>\n");
      out.write("                                <title>Snippet - BBBootstrap</title>\n");
      out.write("                                <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' rel='stylesheet'>\n");
      out.write("                                <link href='' rel='stylesheet'>\n");
      out.write("                                <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\n");
      out.write("                                <style>@import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');\n");
      out.write("\n");
      out.write("* {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    font-family: 'Poppins', sans-serif;\n");
      out.write("    background-color: aliceblue\n");
      out.write("}\n");
      out.write("\n");
      out.write(".wrapper {\n");
      out.write("    padding: 30px 50px;\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    margin: 10px auto;\n");
      out.write("    max-width: 600px\n");
      out.write("}\n");
      out.write("\n");
      out.write("h4 {\n");
      out.write("    letter-spacing: -1px;\n");
      out.write("    font-weight: 400\n");
      out.write("}\n");
      out.write("\n");
      out.write(".img {\n");
      out.write("    width: 70px;\n");
      out.write("    height: 70px;\n");
      out.write("    border-radius: 6px;\n");
      out.write("    object-fit: cover\n");
      out.write("}\n");
      out.write("\n");
      out.write("#img-section p,\n");
      out.write("#deactivate p {\n");
      out.write("    font-size: 12px;\n");
      out.write("    color: #777;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    text-align: justify\n");
      out.write("}\n");
      out.write("\n");
      out.write("#img-section b,\n");
      out.write("#img-section button,\n");
      out.write("#deactivate b {\n");
      out.write("    font-size: 14px\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    margin-bottom: 0;\n");
      out.write("    font-size: 14px;\n");
      out.write("    font-weight: 500;\n");
      out.write("    color: #777;\n");
      out.write("    padding-left: 3px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control {\n");
      out.write("    border-radius: 10px\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[placeholder] {\n");
      out.write("    font-weight: 500\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control:focus {\n");
      out.write("    box-shadow: none;\n");
      out.write("    border: 1.5px solid #0779e4\n");
      out.write("}\n");
      out.write("\n");
      out.write("select {\n");
      out.write("    display: block;\n");
      out.write("    width: 100%;\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    height: 40px;\n");
      out.write("    padding: 5px 10px\n");
      out.write("}\n");
      out.write("\n");
      out.write("select:focus {\n");
      out.write("    outline: none\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("    background-color: #fff;\n");
      out.write("    color: #0779e4\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {\n");
      out.write("    background-color: #0779e4;\n");
      out.write("    color: #fff\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-primary {\n");
      out.write("    background-color: #0779e4\n");
      out.write("}\n");
      out.write("\n");
      out.write(".danger {\n");
      out.write("    background-color: #fff;\n");
      out.write("    color: #e20404;\n");
      out.write("    border: 1px solid #ddd\n");
      out.write("}\n");
      out.write("\n");
      out.write(".danger:hover {\n");
      out.write("    background-color: #e20404;\n");
      out.write("    color: #fff\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(max-width:576px) {\n");
      out.write("    .wrapper {\n");
      out.write("        padding: 25px 20px\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #deactivate {\n");
      out.write("        line-height: 18px\n");
      out.write("    }\n");
      out.write("}</style>\n");
      out.write("                                </head>\n");
      out.write("                                <body oncontextmenu='return false' class='snippet-body'>\n");
      out.write("                                <div class=\"wrapper bg-white mt-sm-5\">\n");
      out.write("    <h4>User profile</h4>\n");
      out.write("    <h6 class=\"pb-4 border-bottom\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\n");
      out.write("    <form action=\"profile\" method=\"post\">\n");
      out.write("        <div class=\"d-flex align-items-start py-3 border-bottom\"> <img src=\"https://images.pexels.com/photos/1037995/pexels-photo-1037995.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500\" class=\"img\" alt=\"\">\n");
      out.write("        <div class=\"pl-sm-4 pl-2\" id=\"img-section\"> <b>Profile Photo</b>\n");
      out.write("            <p>Accepted file type .png. Less than 1MB</p> <button class=\"btn button border\"><b>Upload</b></button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"py-2\">\n");
      out.write("        <div class=\"row py-2\">\n");
      out.write("            <div class=\"col-md-6\"> <label for=\"ID\">ID</label> <input type=\"text\" name=\"id\" class=\"bg-light form-control\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.useId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> </div>\n");
      out.write("            <div class=\"col-md-6 pt-md-0 pt-3\"> <label for=\"userName\">User Name</label> <input type=\"text\" name=\"uname\" class=\"bg-light form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row py-2\">\n");
      out.write("            <div class=\"col-md-6\"> <label for=\"firstname\">First Name</label> <input type=\"text\" name=\"fname\" class=\"bg-light form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> </div>\n");
      out.write("            <div class=\"col-md-6 pt-md-0 pt-3\"> <label for=\"lastname\">Last Name</label> <input type=\"text\" name=\"lname\" class=\"bg-light form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row py-2\">\n");
      out.write("            <div class=\"col-md-6\"> <label for=\"email\">Email Address</label> <input type=\"text\" name=\"email\" class=\"bg-light form-control\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> </div>\n");
      out.write("            <div class=\"col-md-6 pt-md-0 pt-3\"> <label for=\"phone\">Phone Number</label> <input type=\"tel\" name=\"phone\" class=\"bg-light form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> </div>\n");
      out.write("        </div>\n");
      out.write("                <div class=\"row py-2\">\n");
      out.write("            <div class=\"col-md-6\"> <label for=\"role\">Role</label> <select name=\"role\" id=\"country\" class=\"bg-light\">\n");
      out.write("                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                    <option value=\"admin\">Admin</option>\n");
      out.write("                    <option value=\"booker\">Booker</option>\n");
      out.write("                    <option value=\"owner\">Owner</option>\n");
      out.write("                </select> </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"py-3 pb-4 border-bottom\"> <input type=\"submit\" name=\"submit\" value=\"Save\" class=\"btn btn-primary mr-3\"> <input type=\"submit\" name=\"submit\" value=\"Cancel\" class=\"btn border button\"> </div>\n");
      out.write("    </div>\n");
      out.write("        </form>\n");
      out.write("</div>\n");
      out.write("                                <script type='text/javascript' src='https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js'></script>\n");
      out.write("                                <script type='text/javascript'></script>\n");
      out.write("                                </body>\n");
      out.write("                            </html>\n");
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
