/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-10-11 18:18:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class group_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/include/mainHead.jsp", Long.valueOf(1602422550000L));
    _jspx_dependants.put("/include/nav.jsp", Long.valueOf(1602422550000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1597151583242L));
    _jspx_dependants.put("jar:file:/C:/Users/82107/Desktop/1.001/finalproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/withWork/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      out.write("    \r\n");
      out.write("    <script src=\"https://developers.kakao.com/sdk/js/kakao.js\"></script>\r\n");
      out.write("    <script src=\"https://apis.google.com/js/platform.js?onload=init\" async defer></script>\r\n");
      out.write("    <script src=\"js/nav.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- 임시 css -->\r\n");
      out.write("<style>\r\n");
      out.write("\t.addedR, .addedD {\r\n");
      out.write("\t\tcursor: pointer;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--상단 네비게이션-->\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t    <div id=\"header\">\r\n");
      out.write("\t    \t<h1><a href=\"main.do\">WITHWORK</a></h1>\r\n");
      out.write("\t        <ul class=\"leftNav\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t        </ul>\r\n");
      out.write("\t    </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    <!--로그인 창-->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"popup loginPopup\">\r\n");
      out.write("        <dl>\r\n");
      out.write("            <dt>LOGIN</dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("                <form class=\"navForm loginForm\" action=\"login.do\" method=\"post\">\r\n");
      out.write("                    <input type=\"email\" name=\"email\" id=\"email\" placeholder=\"이메일을 입력하세요\">\r\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"비밀번호를 입력하세요\">\r\n");
      out.write("                    <div id=\"findIdPwd\">\r\n");
      out.write("                        <a class=\"findId\">이메일 찾기 </a>ㅣ\r\n");
      out.write("                        <a class=\"findPwd\">비밀번호 찾기 </a>ㅣ\r\n");
      out.write("                        <a href=\"join.do\">회원가입</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"navLoginBtn\">\r\n");
      out.write("                    \t<button type=\"submit\" class=\"defaultBtn loginBtn\">LOGIN</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <form class=\"otherLoginForm google\" action=\"otherLogin.do\" method=\"post\">\r\n");
      out.write("\t                <div class=\"navLoginBtn\">\r\n");
      out.write("\t                    <button type=\"button\" class=\"googleBtn\" onclick=\"\r\n");
      out.write("\t                    \tgauth.signIn().then(function(){\r\n");
      out.write("\t                    \t\tconsole.log('gauth.signIn()');\r\n");
      out.write("\t                    \t\tinit();\r\n");
      out.write("\t                    \t});\r\n");
      out.write("\t                    \">GOOGLE LOGIN</button>\r\n");
      out.write("\t                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            <!-- \r\n");
      out.write("            \t카카오로그인은 사용하지 않음\r\n");
      out.write("            \r\n");
      out.write("                <form class=\"otherLoginForm kakao\" action=\"otherLogin.do\" method=\"post\">\r\n");
      out.write("                \t<div class=\"navBtn\">\r\n");
      out.write("                \t\t<button type=\"button\" class=\"kakaoBtn\" onclick=\"\r\n");
      out.write("\t                    \tloginWithKakao();\r\n");
      out.write("\t                    \">Kakao 로그인</button>\r\n");
      out.write("                \t</div>\r\n");
      out.write("                </form>\r\n");
      out.write("            -->\r\n");
      out.write("            </dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"popup findIdPwd\">\r\n");
      out.write("    \t<dl>\r\n");
      out.write("    \t\t<dt>WithWork</dt>\r\n");
      out.write("    \t\t<dd>\r\n");
      out.write("    \t\t\t<div class=\"displayNone findPwdPopup\">\r\n");
      out.write("\t\t\t\t\t<form class=\"navForm findPwdForm\" action=\"findPassword.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"email\" id=\"findEmail\" placeholder=\"이메일\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"g_name\" id=\"findName\" placeholder=\"이름\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"navBtn\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"defaultBtn chkId\">확 인</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"displayNone findPwdPopup2\">\r\n");
      out.write("\t\t\t\t\t<form class=\"navForm findPwdForm2\" action=\"updatePassword.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"chkPwd\" placeholder=\"비밀번호\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"password2\" id=\"chkPwd2\" placeholder=\"비밀번호 확인\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"Email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resultId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t<div class=\"navBtn\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"defaultBtn updatePwd\">확 인</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"displayNone findIdPopup\">\r\n");
      out.write("\t\t\t\t\t<form class=\"navForm findIdForm\" action=\"findId.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"email\" id=\"findEmail2\" placeholder=\"이메일 \">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"g_name\" id=\"findName2\" placeholder=\"이름\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"navBtn\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"defaultBtn chkId2\">확 인</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("    \t\t</dd>\r\n");
      out.write("    \t</dl>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"darkBack\"></div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- EL 로드가 안되어 따로 지정해놓음. -->\r\n");
      out.write("    <script>\r\n");
      out.write("    \tvar result = '");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("    \tvar email = '");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("    \tvar authstatus = '");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\t<form id=\"signup\" action=\"insertGroup.do\" method=\"post\">\r\n");
      out.write("\t\t<div class=\"mainInner\">\r\n");
      out.write("\t\t\t<div class=\"innerTit\">\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>협업을 위한 그룹을 생성해보세요.</dt>\r\n");
      out.write("\t\t\t\t\t<dd>withWork의 회원이라면 누구든 그룹을 생성할 수 있습니다.</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t        <table class=\"mainTableForm\">\r\n");
      out.write("\t        \t<colgroup>\r\n");
      out.write("\t        \t\t<col width=\"20%\"/>\r\n");
      out.write("\t        \t\t<col width=\"70%\"/>\r\n");
      out.write("\t        \t</colgroup>\r\n");
      out.write("\t        \t<tr>\r\n");
      out.write("\t        \t\t<th>그룹 이름</th>\r\n");
      out.write("\t        \t\t<td>\r\n");
      out.write("\t\t\t            <input type=\"text\" id=\"groupName\" name=\"name\" placeholder=\"그룹이름을 입력하세요.\">        \t\t\r\n");
      out.write("\t        \t\t</td>\r\n");
      out.write("\t        \t</tr>\r\n");
      out.write("\t        \t<tr>\r\n");
      out.write("\t        \t\t<th>그룹 테마</th>\r\n");
      out.write("\t        \t\t<td>\r\n");
      out.write("\t\t\t            <input type=\"text\" id=\"groupSub\" name=\"subject\" placeholder=\"그룹주제를 입력하세요.\">        \t\t      \t\t\r\n");
      out.write("\t        \t\t</td>\r\n");
      out.write("\t        \t</tr>\r\n");
      out.write("\t        \t<tr>\r\n");
      out.write("\t        \t\t<th rowspan=\"2\">부서</th>\r\n");
      out.write("\t        \t\t<td id=\"departResult\"></td>\r\n");
      out.write("\t        \t</tr>\r\n");
      out.write("\t        \t<tr>\r\n");
      out.write("\t        \t\t<td>\r\n");
      out.write("\t        \t\t\t<input type=\"text\" id=\"addD\" placeholder=\"부서를 입력하세요\">\r\n");
      out.write("\t        \t\t\t<button type=\"button\" class=\"addD\">추가</button>\r\n");
      out.write("        \t\t\t</td>\r\n");
      out.write("\t        \t</tr>\r\n");
      out.write("\t        \t<tr>\r\n");
      out.write("\t        \t\t<th rowspan=\"2\">직책</th>\r\n");
      out.write("\t        \t\t<td id=\"roleResult\"></td>\r\n");
      out.write("\t        \t</tr>\r\n");
      out.write("\t        \t<tr>\r\n");
      out.write("\t        \t\t<td>\r\n");
      out.write("\t        \t\t\t<input type=\"text\" id=\"addR\" placeholder=\"직책을 입력하세요\">\r\n");
      out.write("\t        \t\t\t<button type=\"button\" class=\"addR\">추가</button>\r\n");
      out.write("        \t\t\t</td>\r\n");
      out.write("\t        \t</tr>\r\n");
      out.write("\t        </table>\r\n");
      out.write("\t        <div class=\"navBtn\">\r\n");
      out.write("\t            <input type=\"hidden\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t            <button class=\"defaultBtn insertGroup\">그룹 생성</button>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\t/* EL 변수 */\r\n");
      out.write("\tvar g_num = '");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            \t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            \t");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /include/nav.jsp(10,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.email}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("           \t\t<li class=\"login\">LOGIN</li>\r\n");
          out.write("            \t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("           \t\t<li class=\"client\">\r\n");
          out.write("           \t\t\t<a href=\"myPage.do\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${guest.g_name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" 님 환영합니다</a>\r\n");
          out.write("           \t\t</li>\r\n");
          out.write("\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t<select onchange=\"if(this.value) location.href=(this.value);\" class=\"navMyGroup\">\r\n");
          out.write("\t\t\t\t\t\t<option value=\"#\" selected>나의 그룹</option>\r\n");
          out.write("\t\t\t\t\t</select>\r\n");
          out.write("\t            \t<script>\r\n");
          out.write("            \t\t\tgetProjectMe(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${guest.g_num }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(");\r\n");
          out.write("            \t\t</script>\r\n");
          out.write("           \t\t\t<!-- <ul class=\"subMenu\">\r\n");
          out.write("           \t\t\t\t<li><a href=\"#\">나의 그룹</a></li>\r\n");
          out.write("           \t\t\t\t<li><a href=\"insertGroup.do\">그룹 생성</a></li>\r\n");
          out.write("           \t\t\t\t<li><a href=\"myPage.do\">마이 페이지</a></li>\r\n");
          out.write("           \t\t\t</ul> -->\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("           \t\t<li class=\"logout\"><button type=\"button\" id=\"logout\" onclick=\"\r\n");
          out.write("           \t\t\tif(authstatus == 'google') {\r\n");
          out.write("            \t\t\tgauth.signOut().then(function(){\r\n");
          out.write("                    \t\tconsole.log('gauth.signOut()');\r\n");
          out.write("                    \t});\r\n");
          out.write("           \t\t\t} else if(authstatus == 'kakao') {\r\n");
          out.write("           \t\t\t\tKakao.Auth.logout(function() {\r\n");
          out.write("          \t\t\t\t\t\tconsole.log(Kakao.Auth.getAccessToken());\r\n");
          out.write("          \t\t\t\t\t});\r\n");
          out.write("           \t\t\t}\r\n");
          out.write("           \t\t\tjavascript:location.href='logout.do';\r\n");
          out.write("           \t\t\">LOGOUT</button></li>\r\n");
          out.write("            \t");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /include/nav.jsp(132,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${regResult}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /include/nav.jsp(133,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.email}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f2_reused = false;
    try {
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent(null);
      // /include/nav.jsp(134,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.authstatus}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      _jspx_th_c_005fout_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f3_reused = false;
    try {
      _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f3.setParent(null);
      // /group.jsp(76,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${guest.g_num}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
      if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      _jspx_th_c_005fout_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f3_reused);
    }
    return false;
  }
}
