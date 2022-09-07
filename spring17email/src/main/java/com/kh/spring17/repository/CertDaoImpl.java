package com.kh.spring17.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring17.entity.CertDto;

@Repository
public class CertDaoImpl implements CertDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(CertDto certDto) {
		CertDto findDto = sqlSession.selectOne("cert.one", certDto.getCertTarget());
		if(findDto == null) {
			sqlSession.insert("cert.insert", certDto);
		}
		else {
			sqlSession.update("cert.edit", certDto);
		}
	}

}