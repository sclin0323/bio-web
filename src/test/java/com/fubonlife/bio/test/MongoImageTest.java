package com.fubonlife.bio.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fubonlife.bio.config.MongoConfig;
import com.fubonlife.bio.entity.mongo.Member;
import com.fubonlife.bio.entity.mongo.MemberFace;
import com.fubonlife.bio.repository.mongo.MemberFaceRepository;
import com.fubonlife.bio.repository.mongo.MemberRepository;

@Import(value = {MongoConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoImageTest {
	
	Logger log = LoggerFactory.getLogger(MongoImageTest.class);

	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	MemberFaceRepository memberFaceRepository;
	
	
	
	@Test
    public void createMember() throws Exception {
		
		Member m1 = new Member("E123398017","SHANG CHUN, LIN");
		
		memberRepository.save(m1);
		
	}
	
	@Test
    public void createMemberFace() throws Exception {
		
		// Test Image
		BufferedImage image = ImageIO.read(new File("src/main/resources/images/kairos-elizabeth.jpg"));
		
		log.info("=================");
		log.info("Width: "+image.getWidth());
		log.info("Height: "+image.getHeight());
		
		//Base64.getEncoder().encodeToString(image.);
		
		/*
		Member m1 = memberRepository.findById("E123398017").get();

		MemberFace o = new MemberFace();
		
		
		o.setMemberFaceId(new ObjectId());
		o.setMember(m1);
		
		memberFaceRepository.save(o);
		*/
		
	}
	
	
	@Test
    public void findMemberFace() throws Exception {
		
		List<MemberFace> lists = memberFaceRepository.findAll();
		
		log.info("====================================================");
		for(MemberFace o : lists) {
			log.info(o.getMemberFaceId()+" "+o.getMember().getName());
		}
		
	}
	
	@Test
    public void findMemberFaceByMember() throws Exception {
		
		Member m1 = memberRepository.findById("E123398017").get();
		
		List<Member> lists = memberFaceRepository.findByMember(m1);
		
		log.info("====================================================");
		for(Member o : lists) {
			log.info(o.getMemberId()+" "+o.getName());		// o.getName => null 沒有辦法自動查詢
		}
		
	}
	
	
	
}
