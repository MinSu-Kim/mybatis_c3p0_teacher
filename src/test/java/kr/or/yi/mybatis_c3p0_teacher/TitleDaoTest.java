package kr.or.yi.mybatis_c3p0_teacher;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.yi.mybatis_c3p0_teacher.dao.TitleDao;
import kr.or.yi.mybatis_c3p0_teacher.dao.TitleDaoImpl;
import kr.or.yi.mybatis_c3p0_teacher.dto.Title;

public class TitleDaoTest {
	private static TitleDao dao; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new TitleDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao = null;
	}

	@Test
	public void test01InsertTitle() {
		Title title = new Title();
		title.setCode(1);
		title.setName("사장");
		
		int res = dao.insertTitle(title);
		Assert.assertEquals(1, res);
	}

}
