package com.gg.compUser;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("company")
@Getter
@Setter
@ToString
public class CompDTO {
	int CO_no;			// 기업 no
	String COMPANY;		// 회사명
	String HR;			// HR 담당자명
	String CO_EMAIL;	// 이메일
	String categoryID;	// 회사분야
	String sizeID;		// 회사 규모
	
	public CompDTO() {}

	public CompDTO(int CO_no, String COMPANY, String HR, String CO_EMAIL, String categoryID, String sizeID) {
		super();
		this.CO_no = CO_no;
		this.COMPANY = COMPANY;
		this.HR = HR;
		this.CO_EMAIL = CO_EMAIL;
		this.categoryID = categoryID;
		this.sizeID = sizeID;
	}

	public CompDTO(String COMPANY) {
		super();
		this.COMPANY = COMPANY;
	}
}
