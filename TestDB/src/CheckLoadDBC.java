
public class CheckLoadDBC {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		String msg="";

		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg="ﾄﾞﾗｲﾊﾞｰのﾛｰﾄﾞに成功しました";
		}catch(ClassNotFoundException e){
			msg="ﾄﾞﾗｲﾊﾞｰのﾛｰﾄﾞに失敗しました";
		}
		System.out.println(msg);

	}

}
