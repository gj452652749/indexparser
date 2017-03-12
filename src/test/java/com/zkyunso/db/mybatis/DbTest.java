package com.zkyunso.db.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zkyunso.db.mybatis.bean.ParserTask;
import com.zkyunso.db.mybatis.transaction.DbHandler;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class DbTest {
	@Autowired
	DbHandler dbHandler;
	@Test
	public void add() {
		ParserTask bean=new ParserTask();
		bean.setName("gj");
		bean.setRemark("test");
		bean.setConfigJsonId(111);
		dbHandler.addTask(bean);
	}

}
