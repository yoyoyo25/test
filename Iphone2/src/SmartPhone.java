//implementsでインターフェースをクラスへ実装
public class SmartPhone extends Phone implements Mp3Player,NewFunction{
	//extendsでPhone（親クラス）を継承
	
	//ルールはクラスで上書き、処理内容を書く
		public void play(){
			System.out.println("再生");
		}
		public void stop(){
			System.out.println("停止");
		}
		public void next(){
			System.out.println("次へ");
		}
		public void back(){
			System.out.println("戻る");
		}
		//1行目で継承してるので↑は消してもok
}
