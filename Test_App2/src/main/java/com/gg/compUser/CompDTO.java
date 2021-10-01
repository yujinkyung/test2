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
	int CO_no;			// ��� no
	String COMPANY;		// ȸ���
	String HR;			// HR ����ڸ�
	String CO_EMAIL;	// �̸���
	String categoryID;	// ȸ��о�
	String sizeID;		// ȸ�� �Ը�
	
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
