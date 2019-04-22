
public class Test {

	public static void main(String[] args) {
		
		Person taro=new Person();//newでインスタンス化
		
		//値をセット
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="090-123-456";
		taro.address="東京";
		
		//値を取得
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		//メソッド呼出
		taro.talk();
		taro.walk();
		System.out.println("---------------------------");
		
		
		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="123-456";
		jiro.address="大阪";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println("---------------------------");
		
		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="456789";
		hanako.address="長野";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println("---------------------------");
		
		Person chika=new Person();
		chika.name="吉平千賀";
		chika.age=25;
		chika.phoneNumber="567-8910";
		chika.address="神奈川";
		
		System.out.println(chika.name);
		System.out.println(chika.age);
		System.out.println(chika.phoneNumber);
		System.out.println(chika.address);
		System.out.println("---------------------------");
		
		
		Robot aibo=new Robot();
		aibo.name="アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println("---------------------------");
		
		Robot asimo=new Robot();
		asimo.name="アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();
		System.out.println("---------------------------");
		
		Robot pepper=new Robot();
		pepper.name="ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();
		System.out.println("---------------------------");
		
	}

}
