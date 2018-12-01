package kr.or.yi.mybatis_c3p0_teacher.dao;

import org.apache.ibatis.session.SqlSession;

public interface ExecuteItem<T> {
	T exectueQuery(SqlSession sqlSession);
}
