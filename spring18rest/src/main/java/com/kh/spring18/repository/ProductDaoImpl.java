package com.kh.spring18.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring18.entity.ProductDto;
import com.kh.spring18.error.CannotFindException;
import com.kh.spring18.vo.ProductSearchVO;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public ProductDto save(ProductDto productDto) {
		int no = sqlSession.selectOne("product.sequence");
		productDto.setNo(no);
		sqlSession.insert("product.insert", productDto);
		return productDto;
	}

	@Override
	public List<ProductDto> list() {
		List<ProductDto> list = sqlSession.selectList("product.list");
		if(list.isEmpty()) throw new CannotFindException();
		return list;
	}

	@Override
	public List<ProductDto> complexSearch(ProductSearchVO productSearchVO) {
		List<ProductDto> list = sqlSession.selectList("product.complexSearch", productSearchVO);
		if(list.isEmpty()) throw new CannotFindException(); 
		return list;
	}

	@Override
	public List<ProductDto> search(String type, String keyword) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("type", type);
		param.put("keyword", keyword);
		return sqlSession.selectList("product.search", param);
	}

	@Override
	public ProductDto info(int no) {
		return sqlSession.selectOne("product.one", no);
	}

	@Override
	public ProductDto edit(ProductDto productDto) {
		int count = sqlSession.update("product.edit", productDto);
		if(count == 0) throw new CannotFindException();
		return sqlSession.selectOne("product.one", productDto.getNo());
	}

	@Override
	public void delete(int no) {
		if(sqlSession.delete("product.delete", no) == 0) {
			throw new CannotFindException();
		}
	}

}