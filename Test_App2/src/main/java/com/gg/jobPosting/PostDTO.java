package com.gg.jobPosting;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("jobpost")
@Getter
@Setter
@ToString
public class PostDTO {
    int POST_NO;			
	String COMPANY;		
	String POSITION;			
	String QUALIFY;	
	String EMPLOY_TYPE;	
	String REGI_DT;		
	
	public PostDTO() {}

	public PostDTO(int POST_NO, String COMPANY,
        String POSITION, String QUALIFY,
        String EMPLOY_TYPE, String REGI_DT) {
		super();
		this.POST_NO = POST_NO;
		this.COMPANY = COMPANY;
		this.POSITION = POSITION;
		this.QUALIFY = QUALIFY;
		this.EMPLOY_TYPE = EMPLOY_TYPE;
		this.REGI_DT = REGI_DT;
	}

	public PostDTO(String COMPANY) {
		super();
		this.COMPANY = COMPANY;
	}
}
