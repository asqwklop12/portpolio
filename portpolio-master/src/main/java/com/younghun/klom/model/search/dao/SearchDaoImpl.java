package com.younghun.klom.model.search.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younghun.klom.model.search.vo.SearchVo;
  
@Repository
public class SearchDaoImpl implements SearchDao{

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "SearchMapper.";
	@Override
	public void insert(SearchVo searchVo) {
		sqlSession.insert(NAMESPACE + "result",searchVo);
	}
	@Override
	public List<SearchVo> list(String email) {
		return sqlSession.selectList(NAMESPACE + "list",email);
	}
	@Override
	public int user(String email) {
		return sqlSession.selectOne(NAMESPACE + "user",email);
	}
	@Override
	public int max() {
		return sqlSession.selectOne(NAMESPACE + "max");
	}
	@Override
	public void delete(SearchVo searchVo) {
		sqlSession.delete(NAMESPACE + "delete",searchVo);
	}
	@Override
	public void updateId(int id) {
		sqlSession.update(NAMESPACE + "downId",id);
	}
	@Override
	public void updateGroup(SearchVo searchVo) {
		sqlSession.update(NAMESPACE + "downGroup",searchVo);
	}
	

}
