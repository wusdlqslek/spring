package com.myspring.org;

import java.sql.Connection;
import javax.inject.Inject;
import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DataSourceMyBatis1 {
	@Inject
	private DataSource datasource;		
	@Test
	public void dataSourceTest()  throws Exception{
		try {
			Connection con = datasource.getConnection();
			System.out.println(con);
		}
		catch(Exception e) {e.printStackTrace();}
	}
}
