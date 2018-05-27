package com.fubonlife.bio.entity.mongo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="memberFaces")
public class MemberFace extends BaseEntity{

	@Id
	private ObjectId memberFaceId;
	
	private byte[] image;
	
	@DBRef
	private Member member;

	public ObjectId getMemberFaceId() {
		return memberFaceId;
	}

	public void setMemberFaceId(ObjectId memberFaceId) {
		this.memberFaceId = memberFaceId;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	
}
