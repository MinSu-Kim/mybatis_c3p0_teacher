package kr.or.yi.mybatis_c3p0_teacher.dao;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.mybatis_c3p0_teacher.jdbc.MyBatisSqlSessionFactory;

public class ExecuteDao {

    protected <T> T processQueryItem(ExecuteItem<T> p) {
        try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
            return p.exectueQuery(sqlSession);
        }
    }

    protected int processQueryUpdate(ExecuteUpdate p) {
        try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
            int res = p.executeQuery(sqlSession);
            sqlSession.commit();
            return res;
        }
    }
}
