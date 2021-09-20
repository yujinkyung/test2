package com.gg.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("company")
@Getter
@Setter
@ToString
public class UserDTO {
	int CO_no;			// 기업 no
	String COMPANY;		// 회사명
	String HR;			// HR 담당자명
	String CO_EMAIL;	// 이메일
	String categoryID;	// 회사분야
	String sizeID;		// 회사 규모
	
	public UserDTO() {}

	public UserDTO(int CO_no, String COMPANY, String HR, String CO_EMAIL, String categoryID, String sizeID) {
		super();
		this.CO_no = CO_no;
		this.COMPANY = COMPANY;
		this.HR = HR;
		this.CO_EMAIL = CO_EMAIL;
		this.categoryID = categoryID;
		this.sizeID = sizeID;
	}

	public UserDTO(String COMPANY) {
		super();
		this.COMPANY = COMPANY;
	}

}
