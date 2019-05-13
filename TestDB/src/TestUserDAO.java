import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {
	String name="";
	String password="";

//③名前、パスワードで選択
public void select(String name,String password){
	//DBへの接続準備コード。DBConnectorのgetConnection呼出→mysqlへログイン
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	//test_tableに入るデータ（user_name,password）を変数sqlへ代入
	String sql="select * from test_table  where user_name=? and password=?";

	try{
		//?PreparedStatement：DBまでデータを入れて運ぶ箱
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();//実行メソッド

		//？データが存在していたら戻り値をtrueで返す。なければfalse
		if(rs.next()){
			System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		//DBとの接続を終了
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}
}
//⑤全データ取得
public void selectAll(){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	//test_tableの全データを代入
	String sql="select * from test_table";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();

		//表1行目から実行、データがなくなるまで
		while(rs.next()){
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

//⑦名前で取得データ選択
public void selectByName(String name){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="select * from test_table where user_name=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,name);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
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

//⑨パスワードで取得データ選択
public void selectByPassword(String password){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="select * from test_table where password=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, password);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
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

//⑪ユーザー名の変更
public void updateUserNameByUserName(String oldName, String newName){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="update test_table set user_name=? where user_name=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, newName);
		ps.setString(2,oldName);

		//executeUpdate()：データの件数（数値int）を返す
		//変数iに件数代入
		int i=ps.executeUpdate();

		if(i>0){
			System.out.println(i+"件更新されました");
		}else{
			System.out.println("該当するデータはありませんでした");
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

//⑬データ追加
public void insert(int user_id,String name, String password){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="insert into test_table values(?,?,?)";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, user_id);
		ps.setString(2, name);
		ps.setString(3,password);

		int i=ps.executeUpdate();
		if(i>0){
			System.out.println(i+"件登録されました");
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

//⑮データ削除（名前で選択）
public void delete(String name){
	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	String sql="delete from test_table where user_name=?";
	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,name);

		int i=ps.executeUpdate();
		if(i>0){
			System.out.println(i+"件削除されました");
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



