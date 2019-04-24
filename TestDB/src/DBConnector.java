import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	//JDBCドライバー名を変数driveNameへ代入
	private static String driverName="com.mysql.jdbc.Driver";

	//databaseのurl指定（変数urlへ代入）
	private static String url=
			"jdbc:mysql://localhost/test_db?autoReconnect=true&useSSL=false";

	//rootアカウント、パスワードを指定
	private static String user="root";
	private static String password="mysql";

	//getConnectionで接続状態にする
	public Connection getConnection(){
		Connection con=null;//初期化

		//try～catch：例外処理構文
		try{
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

}
