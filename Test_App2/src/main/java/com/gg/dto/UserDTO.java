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
	int CO_no;			// ��� no
	String COMPANY;		// ȸ���
	String HR;			// HR ����ڸ�
	String CO_EMAIL;	// �̸���
	String categoryID;	// ȸ��о�
	String sizeID;		// ȸ�� �Ը�
	
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
