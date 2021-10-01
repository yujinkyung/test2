package com.gg.indvUser;

import org.apache.ibatis.type.Alias;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("indvuser")
@Getter
@Setter
@ToString
public class IndvDTO {
	String P_ID;
	String P_PW;
	String NAME;
	String P_EMAIL;	// ¿Ã∏ﬁ¿œ
	String PHONE;
	Date BIRTH_DATE;
	int AGE;
	int GENDER;
	
	public IndvDTO() {}

	public IndvDTO(
			String P_ID, String P_PW, String NAME,
			String P_EMAIL, String PHONE, Date BIRTH_DATE,
			int AGE, int GENDER) {
		super();
		this.P_ID = P_ID;
		this.P_PW = P_PW;
		this.NAME = NAME;
		this.P_EMAIL = P_EMAIL;
		this.PHONE = PHONE;
		this.BIRTH_DATE = BIRTH_DATE;
		this.AGE = AGE;
		this.GENDER = GENDER;
	}

	public IndvDTO(String NAME) {
		super();
		this.NAME = NAME;
	}
	
}
