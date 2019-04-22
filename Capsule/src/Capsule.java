
public class Capsule {

	public static void main(String[] args) {
		
		//インスタンス化（引数をこの時点で指定：コンストラクタ）
		Person taro=new Person("山田太郎",20);
		//privateでもgetNameでreturn this.nameを取得可
		System.out.println(taro.getName());
		
		//名前の書き換え（setNameでthis.name=nameと記述しているから可）
		taro.setName("花子");
		
		//書換後の値を取得
		System.out.println(taro.getName());
		
		//ageの値(20)取得可
		System.out.println(taro.getAge());
		
		//ageの書き換え
		taro.setAge(30);
		
		//書換後の値取得
		System.out.println(taro.getAge());
		
	}

}
