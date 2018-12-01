package kr.or.yi.mybatis_c3p0_teacher.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_c3p0_teacher.dto.Title;

public class TitleDaoImpl extends ExecuteDao implements TitleDao {
	private static final String namespace = "kr.or.yi.mybatis_c3p0_teacher.dao.TitleDao";

	@Override
	public List<Title> selectTitleByAll() {
		return processQueryItem((SqlSession sqlSession)->sqlSession.selectList(namespace + ".selectTitleByAll"));
	}

	@Override
	public Title selectTitleByCode(Title title) {
		return processQueryItem((SqlSession sqlSession)->sqlSession.selectOne(namespace + ".selectTitleByCode", title));
	}

	@Override
	public int insertTitle(Title title) {
		return processQueryUpdate((SqlSession sqlSession)->sqlSession.insert(namespace + ".insertTitle", title));
	}

	@Override
	public int deleteTitle(int code) {
		return processQueryUpdate((SqlSession sqlSession)->sqlSession.delete(namespace + ".deleteTitle", code));
	}

	@Override
	public int updateTitle(Title title) {
		return processQueryUpdate((SqlSession sqlSession)->sqlSession.update(namespace + ".updateTitle", title));
	}

	   
/*	@Override
	public List<Title> selectTitleByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectList(namespace + ".selectTitleByAll");
		}
	}

	@Override
	public Title selectTitleByCode(Title title) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectTitleByCode", title);
		}
	}

	@Override
	public int insertTitle(Title title) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.insert(namespace + ".insertTitle", title);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteTitle(int code) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.delete(namespace + ".deleteTitle", code);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int updateTitle(Title title) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.update(namespace + ".updateTitle", title);
			sqlSession.commit();
			return res;
		}
	}*/

}
