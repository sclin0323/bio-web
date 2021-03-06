package com.fubonlife.bio.entity.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="members")
public class Member extends BaseEntity {

	@Id
	private String memberId;
	
	private String name;
	
	public Member() {
		super();
	}
	
	public Member(String memberId, String name) {
		super();
		this.memberId = memberId;
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	
}
