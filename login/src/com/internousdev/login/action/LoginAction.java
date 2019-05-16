package com.internousdev.login.action;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

//struts2が持つAction Supportクラスを継承
public class LoginAction extends ActionSupport{

	//JSP（フロント）から受け取る変数を定義
	private String name;
	private String password;

	public String execute() throws SQLException{
		//メソッドの戻り値retを定義、初期値にERRORを代入
		String ret=ERROR;


		//インスタンス化
		LoginDAO dao=new LoginDAO();
		LoginDTO dto=new LoginDTO();

		//DAOクラスのselectメソッド（=DAOの処理全て）を呼出、DAOで取得した結果をDTOに代入
		dto=dao.select(name,password);

		//ユーザー入力内容とDTOに格納された値（name,pw）が一致しているか確認
		//一致→retをSUCCESSに書き換え
		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassword())){
				ret=SUCCESS;
			}
		}
	return ret;
	}

public String getName(){
	return name;
}
//setter定義→JSPでユーザーが入力した値が格納される（setter/getter?）
public void setName(String name){
	this.name=name;
}
public String getPassword(){
	return password;
}
public void setPassword(String password){
	this.password=password;
}

}
