/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-10-11 17:34:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/include/mainHead.jsp", Long.valueOf(1602422550000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <!-- font-family: 'Montserrat', sans-serif; -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,500i,600,600i,700\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&subset=korean\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- js -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <title>withWork</title>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"joinFormHeader\">\r\n");
      out.write("        <h1><a href=\"main.do\">WITHWORK</a></h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <form id=\"joinForm\">\r\n");
      out.write("        <ul class=\"join_box\">\r\n");
      out.write("            <li class=\"checkBox check01\">\r\n");
      out.write("                <ul class=\"clearfix\">\r\n");
      out.write("                    <li class=\"checkAllBtn\">\r\n");
      out.write("                        <input type=\"checkbox\" name=\"chkAll\" id=\"chk\" class=\"chkAll\">\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"checkAllContent\">\r\n");
      out.write("                        이용약관, 개인정보 수집 및 이용,\r\n");
      out.write("                        위치정보 이용약관(선택), 프로모션 정보 수신(선택)\r\n");
      out.write("                        에 모두 동의합니다.\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"checkBox check02\">\r\n");
      out.write("                <ul class=\"clearfix\">\r\n");
      out.write("                    <li class=\"checkBtn\">\r\n");
      out.write("                        <input type=\"checkbox\" name=\"chk\" class=\"requiredBtn1\">\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>이용약관 동의<span>(필수)</span></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <textarea>\r\n");
      out.write("                    여러분을 환영합니다.\r\n");
      out.write("                    네이버 서비스 및 제품(이하 ‘서비스’)을 이용해 주셔서 감사합니다. 본 약관은 다양한 네이버 서비스의 이용과 관련하여 네이버 서비스를 제공하는 네이버 주식회사(이하 ‘네이버’)와 이를 이용하는 네이버 서비스 회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의 네이버 서비스 이용에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다.\r\n");
      out.write("\r\n");
      out.write("                    네이버 서비스를 이용하시거나 네이버 서비스 회원으로 가입하실 경우 여러분은 본 약관 및 관련 운영 정책을 확인하거나 동의하게 되므로, 잠시 시간을 내시어 주의 깊게 살펴봐 주시기 바랍니다.\r\n");
      out.write("\r\n");
      out.write("                    다양한 네이버 서비스를 즐겨보세요.\r\n");
      out.write("                </textarea>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"checkBox check03\">\r\n");
      out.write("                <ul class=\"clearfix\">\r\n");
      out.write("                    <li class=\"checkBtn\">\r\n");
      out.write("                        <input type=\"checkbox\" name=\"chk\" class=\"requiredBtn2\">\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>개인정보 수집 및 이용 동의<span>(필수)</span></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <textarea>\r\n");
      out.write("                    여러분을 환영합니다.\r\n");
      out.write("                    네이버 서비스 및 제품(이하 ‘서비스’)을 이용해 주셔서 감사합니다. 본 약관은 다양한 네이버 서비스의 이용과 관련하여 네이버 서비스를 제공하는 네이버 주식회사(이하 ‘네이버’)와 이를 이용하는 네이버 서비스 회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의 네이버 서비스 이용에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다.\r\n");
      out.write("\r\n");
      out.write("                    네이버 서비스를 이용하시거나 네이버 서비스 회원으로 가입하실 경우 여러분은 본 약관 및 관련 운영 정책을 확인하거나 동의하게 되므로, 잠시 시간을 내시어 주의 깊게 살펴봐 주시기 바랍니다.\r\n");
      out.write("\r\n");
      out.write("                    다양한 네이버 서비스를 즐겨보세요.\r\n");
      out.write("                </textarea>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"checkBox check04\">\r\n");
      out.write("                <ul class=\"clearfix\">\r\n");
      out.write("                    <li class=\"checkBtn\">\r\n");
      out.write("                        <input type=\"checkbox\" name=\"chk\">\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>위치정보 이용약관 동의<span>(선택)</span></li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                <textarea>\r\n");
      out.write("                    여러분을 환영합니다.\r\n");
      out.write("                    네이버 서비스 및 제품(이하 ‘서비스’)을 이용해 주셔서 감사합니다. 본 약관은 다양한 네이버 서비스의 이용과 관련하여 네이버 서비스를 제공하는 네이버 주식회사(이하 ‘네이버’)와 이를 이용하는 네이버 서비스 회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의 네이버 서비스 이용에 도움이 될 수 있는 유익한 정보를 포함하고 있습니다.\r\n");
      out.write("\r\n");
      out.write("                    네이버 서비스를 이용하시거나 네이버 서비스 회원으로 가입하실 경우 여러분은 본 약관 및 관련 운영 정책을 확인하거나 동의하게 되므로, 잠시 시간을 내시어 주의 깊게 살펴봐 주시기 바랍니다.\r\n");
      out.write("\r\n");
      out.write("                    다양한 네이버 서비스를 즐겨보세요.\r\n");
      out.write("                </textarea>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"checkBox check04\">\r\n");
      out.write("                <ul class=\"clearfix\">\r\n");
      out.write("                    <li class=\"checkBtn\">\r\n");
      out.write("                        <input type=\"checkbox\" name=\"chk\">\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>프로모션 정보 수신 동의<span>(선택)</span></li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                <textarea>\r\n");
      out.write("                    네이버에서 제공하는 이벤트/혜택 등 다양한 정보를 휴대전화(네이버앱 알림 또는 문자), 이메일로 받아보실 수 있습니다. 일부 서비스(별도 회원 체계로 운영하거나 네이버 가입 이후 추가 가입하여 이용하는 서비스 등)의 경우, 개별 서비스에 대해 별도 수신 동의를 받을 수 있으며, 이때에도 수신 동의에 대해 별도로 안내하고 동의를 받습니다.\r\n");
      out.write("                </textarea>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul class=\"footBtwrap clearfix\">\r\n");
      out.write("            <li><button class=\"fpmgBt1\"><a href=\"register.do\">동의</a></button></li>\r\n");
      out.write("            <li><button class=\"fpmgBt2\"><a href=\"main.do\">비동의</a></button></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
