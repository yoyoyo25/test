package com.internousdev.login.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	//DLしたドライバーの名前を変数に代入
	private static String driverName="com.mysql.jdbc.Driver";
	//MySQLのデータベースを指定（localhost:自分の使ってるPC）
	private static String url="jdbc:mysql://localhost/logindb_yoshihira";

	//MySQLにログインするための値を準備
	private static String user="root";
	private static String password="mysql";

	//接続状態にして、一度状態を初期化
	public Connection getConnection(){
		Connection con=null;

		try{
			//ドライバーをロードし使える状態にする
			Class.forName(driverName);
			con=(Connection)DriverManager.getConnection(url,user,password);

		 //	tryにて発生したエラーをcatchで受ける。（）内はエラー内容
		}catch(ClassNotFoundException e){
			//処理内容（エラー履歴を赤文字で表示）
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

		//MySQLに接続した結果を呼び出し元へ返す処理
		return con;
	}

}
