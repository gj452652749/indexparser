package com.zkyunso.parser.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.zkyunso.db.mybatis.transaction.DbHandler;
import com.zkyunso.mongo.service.MongoDao;
@SessionAttributes(value={"userName","coreName"})
@Controller
@RequestMapping("/parser")
public class ParserController {
	@Autowired
	DbHandler dbHandler;
	@Autowired
	MongoDao mongoDao;
	@ResponseBody
	@RequestMapping(value = "/init", produces = "text/plain;charset=UTF-8")
	public String init(HttpSession session, Map<String,Object> map) {// 2
		String userName="gj";
		String coreName="core1";
		map.put("userName", userName);
		map.put("coreName", coreName);
		return mongoDao.getParserPageInitData(userName, coreName);// 返回首页
	}
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(@ModelAttribute("userName") String userName
			,@ModelAttribute("coreName") String coreName,@RequestBody String modal) {// 2
		System.out.println("userName:"+userName);
		mongoDao.put(userName, coreName, modal);
		return mongoDao.getParserPageInitData(userName, coreName);// 返回首页
	}
}
