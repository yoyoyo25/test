package com.internousdev.login.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;


public class LoginDAO {
	public class LoginDTO select(String name, String password) throws SQLException{
		LoginDTO dto=new LoginDTO();
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="select * from user where user_name=? and password=?";

	try{
		//定義したSQL文↑の1番目？にActionから送られたname,2番目にpasswordが入る
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2,password);

		//SQL文実行メソッドをrs(ResultSet)へ代入
		ResultSet rs=ps.executeQuery();

		if(rs.next()){
			//select文でDBから取得した情報をString型に変換、DTOに格納
			dto.setName(rs.getString("user_name"));
			dto.setPassword(rs.getString("password"));
		}
	 //処理中にSQL関連のエラーが発生した際に実行する処理
	}catch(SQLException e){
		e.printStackTrace();

	 //DB接続終了の際必ず書くメソッド
	}finally{
		con.close();
	}

	//dtoに入った値をActionクラスに渡す
	return dto;

	}

}
