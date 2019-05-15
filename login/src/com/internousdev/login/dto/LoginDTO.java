package com.internousdev.login.dto;

public class LoginDTO {
	//DB tableから取得するデータに対応したフィールド変数を宣言
	private int id;
	private String name;
	private String password;

	//Actionクラスから呼び出されたidの値をActionに返す
	public int getId(){
		return id;
	}
	//DAOから呼び出され、引数として受け取ったtableの値を自身のidフィールドへ格納
	public void setId(int id){
		this.id=id;
	}

	public String getName(){
		return name;
	}

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
