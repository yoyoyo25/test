//Servletクラス関連のクラスをインポート
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//URLパターン設定
@WebServlet("/HelloServlet")

/* HttpServletの継承:サーブレットクラスの元となるクラス。
 * これを継承することで一からサーブレットクラスを作成する必要がなくなる*/
public class HelloServlet extends HttpServlet {

    public HelloServlet() {
        super();
    }

    //サーブレットクラスがブラウザからリクエスト→doGet()メソッドが実行
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//HTML出力（レスポンス）
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<H3>HelloServlet</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
	}
}

