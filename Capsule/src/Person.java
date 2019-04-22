
public class Person {
	//インスタンスフィールド（空）
	private  String name=null;
	private int age=0;
	
	//コンストラクタ宣言
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	//get:値の取得　this.name（値）の取得→returnで呼出元へ返す
	public String getName(){
		return this.name;
	}
	
	//set:値の登録　処理（名前の書き換え）
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
}
