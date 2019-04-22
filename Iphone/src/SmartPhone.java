//Mp3PlayerをSmartPhoneへ継承
public class SmartPhone extends Mp3Player{
	
	public void play(){
		System.out.println("再生（ハイレゾ機能）");//上書き（オーバーライド：こちらが実行される）
	}
	public void stop(){
		System.out.println("停止（ハイレゾ機能）");
	}
	public void next(){
		System.out.println("次へ（ハイレゾ機能）");
	}
	public void back(){
		System.out.println("戻る（ハイレゾ機能）");
	}
	//継承されたものは子クラスで再度書かなくてよい（上書きしてるから↑は書いてるだけ）
	
	//子クラスで追加
	public void call(){
		System.out.println("電話");
	}
	public void mail(){
		System.out.println("メール");
	}
	public void photo(){
		System.out.println("写真");
	}
	public void internet(){
		System.out.println("インターネット");
	}
}
