
public class Robot {
	//インスタンスフィールド（記入用紙）
	public String name=null;
	
	//インスタンスメソッド→mainで呼出
	public void talk(){
		System.out.println(this.name+"が話す");
	}
	public void walk(){
		System.out.println(this.name+"が歩く");
	}
	public void run(){
		System.out.println(this.name+"が走る");
	}

}
