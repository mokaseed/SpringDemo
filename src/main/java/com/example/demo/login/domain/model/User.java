package com.example.demo.login.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private String userID; //ユーザーID
	private String password; //パスワード
	private String userNmae; //ユーザー名
	private Date birthday; //誕生日
	private int age; //年齢
	private boolean marriage; //結婚ステータス
	private String role; //ロール
	
}
