
public class Person {
	//インスタンスフィールド（記入用紙）
	public String name=null;
	public int age=0;
	
	public Person(){}//指定しないときは不要
	
	//コンストラクタ（型 引数）
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public Person(String name){
		this.name=name;
		this.age=0;
	}
	
	public Person(int age){
		this.name="名前なし";
		this.age=age;
	}
	
	public Person(int age, String name){
		this.name=name;
		this.age=age;
	}

}
