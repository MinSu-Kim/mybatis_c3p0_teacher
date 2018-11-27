package kr.or.yi.mybatis_c3p0_teacher.dao;

import java.util.List;

import kr.or.yi.mybatis_c3p0_teacher.dto.Title;

public interface TtileDao {
	List<Title> selectTitleByAll();
	Title selectTitlebyCode(Title title);
	int insertTitle(Title title);
	int deleteTitle(Title title);
	int updateTitle(Title title);
}
