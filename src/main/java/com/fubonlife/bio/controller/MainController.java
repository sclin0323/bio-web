package com.fubonlife.bio.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fubonlife.bio.entity.mongo.Menu;
import com.fubonlife.bio.util.WebRestResponse;


@RestController
@RequestMapping(value="/web/main")
public class MainController {
	
	Logger log = LoggerFactory.getLogger(MainController.class);
	
	@ResponseBody
	@RequestMapping(value = "/readmenus", method = RequestMethod.GET)
	public WebRestResponse read(HttpServletRequest request) throws IOException {
		
		// Demo Menus
		List<Menu> menus = new ArrayList<Menu>();
		
		Menu m1 = new Menu();
		m1.setMenuId("M1");
		m1.setText("系統測試M1");
		m1.setOrder(10);
		m1.setLeaf(false);
		
		Menu m11 = new Menu();
		
		m11.setMenuId("M11");
		m11.setText("會員資料管理");
		m11.setView("Bio.web.ext.view.member.Member");
		m11.setOrder(10);
		m11.setLeaf(true);
		
		Menu m12 = new Menu();
		
		m12.setMenuId("M12");
		m12.setText("系統測試M12");
		m12.setView("xxx.xxx.xxx");
		m12.setOrder(10);
		m12.setLeaf(true);
		
		List<Menu> menuItems = new ArrayList<Menu>();
		menuItems.add(m11);
		menuItems.add(m12);
		
		m1.setData(menuItems);
		
		
		menus.add(m1);

		
		WebRestResponse response = WebRestResponse.success(menus, menus.size());
		
		return response;
		
	}
}
