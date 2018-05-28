package com.fubonlife.bio.test;

import java.lang.reflect.Field;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fubonlife.bio.entity.mongo.Member;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleTest {

	Logger log = LoggerFactory.getLogger(MongoImageTest.class);
	
	@Test
    public void test() throws Exception {
		
		Object o = getExample(Member.class);
		
		Gson gson = new Gson();
		log.info(gson.toJson(o));
		
//		Object o = new Member("E123398017","SAM");
//		Class<?> c = o.getClass();
//
//		Field f = c.getDeclaredField("memberId");
//		f.setAccessible(true);
//		f.set(o, "E123456789");
//
//		String memberId = (String) f.get(o);
//		
//		log.info(memberId);
		
		
	}

	private Object getExample(Class clazz) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		Object o = clazz.newInstance();
		Class<?> c = o.getClass();
		
		Field f = c.getDeclaredField("memberId");
		f.setAccessible(true);
		f.set(o, "E123456789");
		
		
		
		return o;
		
	}
	
	
}
