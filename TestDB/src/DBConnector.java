import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	//DLしたJDBCドライバー名を変数driveNameに代入
	private static String driverName="com.mysql.jdbc.Driver";

	//DBを表すURLを指定、変数urlに代入
	private static String url="jdbc:mysql://localhost/test_db";

	//DB接続に用いるユーザー名、パスワードを設定
	private static String user="root";
	private static String password="mysql";

	//接続状態にする(DriveManagerで用意されてるgetConnectionメソッド使用)
	public Connection getConnection(){
		//接続状態を初期化
		Connection con=null;

		//try～catch：例外処理構文（try{エラー内容}）
		try{
			//ドライバーをロードし使える状態にする2行
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);

		//catchでエラー受取、printStackTraceでエラーに至る履歴を表示
		//エラー①クラスが見つからない場合、②データベース処理に関する例外
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

}
