
public class Test {

	public static void main(String[] args) {
		//今までと同じ：インスタンス化→値セット
		Person taro=new Person();
		taro.name="taro";
		taro.age=18;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println("--------------");
		
		//Personでコンストラクタ使用
		Person jiro=new Person("jiro",20);//引数の型一致
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println("--------------");
			
		Person saburo=new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		System.out.println("--------------");
		
		Person sakura=new Person(25);
		System.out.println(sakura.name);
		System.out.println(sakura.age);
		System.out.println("--------------");
		
		Person hanako=new Person("hanako",17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		
	}

}
