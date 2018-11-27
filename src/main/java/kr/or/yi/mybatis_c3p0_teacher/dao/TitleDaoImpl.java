package kr.or.yi.mybatis_c3p0_teacher.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_c3p0_teacher.dto.Title;
import kr.or.yi.mybatis_c3p0_teacher.jdbc.MyBatisSqlSessionFactory;

public class TitleDaoImpl implements TitleDao {
	private static final String namespace = "kr.or.yi.mybatis_c3p0_teacher.dao.TitleDao";
	
	@Override
	public List<Title> selectTitleByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Title selectTitlebyCode(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertTitle(Title title) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
            int res = sqlSession.insert(namespace + ".insertTitle", title);
            sqlSession.commit();
            return res;
        }
	}

	@Override
	public int deleteTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

}
