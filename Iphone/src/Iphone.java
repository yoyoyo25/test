
public class Iphone {

	public static void main(String[] args) {
		//インスタンス化→変数iphoneに代入（型=クラス名）
		SmartPhone iphone=new SmartPhone();
		
		//メソッド呼出（変数に格納されたメソッド）
		iphone.play();
		iphone.stop();
		iphone.next();
		iphone.back();
		iphone.call();
		iphone.mail();
		iphone.photo();
		iphone.internet();
		
		System.out.println("-----------------------");
		
		SmartPhone android=new SmartPhone();
		android.play();
		android.stop();
		android.next();
		android.back();
		android.call();
		android.mail();
		android.photo();
		android.internet();
		
		

	}

}
