package kr.or.yi.mybatis_c3p0_teacher;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_c3p0_teacher.dao.TitleDao;
import kr.or.yi.mybatis_c3p0_teacher.dao.TitleDaoImpl;
import kr.or.yi.mybatis_c3p0_teacher.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleDaoTest extends AbstractTest{

	private static TitleDao titleDao; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		titleDao = new TitleDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		titleDao = null;
	}

	@Test
	public void test01insertTitle() {
		log.debug("test01insertTitle()");
		Title title = new Title();
		title.setCode(5);
		title.setName("인턴");
		
		int res = titleDao.insertTitle(title);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test02selectTitleByAll() {
		log.debug("test0selectTitleByAll()");
		List<Title> titleList = titleDao.selectTitleByAll();
		Assert.assertNotNull(titleList);
	}
	

	@Test
	public void test03selectTitlebyCode() {
		log.debug("test03selectTitlebyCode()");
		Title title = new Title();
		title.setCode(5);
		Title searchTitle = titleDao.selectTitleByCode(title);
		log.debug("searchTitle : " + searchTitle);
		Assert.assertNotNull(searchTitle);
	}
	
		
	@Test
	public void test04updateTitle() {
		log.debug("test04updateTitle()");
		Title title = new Title();
		title.setCode(5);
		title.setName("무기계약직");
		int res = titleDao.updateTitle(title);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test05deleteTitle() {
		log.debug("test05deleteTitle()");
		int res = titleDao.deleteTitle(5);
		Assert.assertEquals(1, res);
	}
}
