package kr.or.yi.mybatis_c3p0_teacher;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import kr.or.yi.mybatis_c3p0_teacher.jdbc.MyBatisSqlSessionFactory;

public class MyBatisSqlSessionFactoryTest extends AbstractTest{

	@Test
	public void testOpenSession() {
		log.debug("testOpenSession()");

		SqlSession session = MyBatisSqlSessionFactory.openSession();
		log.debug("session " + session);
		Assert.assertNotNull(session);
	}

}
