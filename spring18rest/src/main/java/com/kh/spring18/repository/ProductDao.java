package com.kh.spring18.repository;

import java.util.List;

import com.kh.spring18.entity.ProductDto;
import com.kh.spring18.vo.ProductSearchVO;

public interface ProductDao {

	ProductDto save(ProductDto productDto);
	List<ProductDto> list();
	List<ProductDto> complexSearch(ProductSearchVO productSearchVO);
	List<ProductDto> search(String type, String keyword);
	ProductDto info(int no);
	ProductDto edit(ProductDto productDto);
	void delete(int no);

}