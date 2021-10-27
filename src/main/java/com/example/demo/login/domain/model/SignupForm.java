package com.example.demo.login.domain.model;

import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {
	
	@NotBlank(groups=ValidGroup1.class) //入力必須
	@Email(groups=ValidGroup2.class) //メールアドレス形式
	private String userId; //ユーザーID
	
	@NotBlank(groups=ValidGroup1.class)
	@Length(min=4, max=100, groups=ValidGroup2.class) //長さ4から100桁まで
	@Pattern(regexp="^[a-zA-Z0-9]+$", groups=ValidGroup3.class) //半角英数字のみ
	private String password; //パスワード
	
	@NotBlank(groups=ValidGroup1.class)
	private String userName; //ユーザー名
	
	@NotNull(groups=ValidGroup1.class)
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birthday; //誕生日
	
	//値が20〜100まで
	@Min(value=20, groups=ValidGroup2.class)
	@Max(value=100, groups=ValidGroup2.class)
	private int age; //年齢
	
	@AssertFalse(groups=ValidGroup2.class) //falseのみ可能
	private boolean marriage; //結婚ステータス
	
}
