import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {
	String name="";
	String password="";

	public void select(String name,String password){
		//DB接続の準備。mysqlへログイン
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		//user_name,passwordのデータがsqlに代入される
		String sql="select * from test_table where user_name=? and password=?";

		try{//DBまで運んでくれる箱
			PreparedStatement ps=con.prepareStatement(sql);

			//DBに入るデータ
			ps.setString(1,name);
			ps.setString(2,password);

			//executeQuery();:実行メソッド。必ずResultSetが返ってくる
			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
