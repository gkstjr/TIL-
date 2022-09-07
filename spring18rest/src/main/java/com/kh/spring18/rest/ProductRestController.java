package com.kh.spring18.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring18.entity.ProductDto;
import com.kh.spring18.repository.ProductDao;
import com.kh.spring18.vo.ProductSearchVO;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private ProductDao productDao;

	@PostMapping("/")
	public ProductDto save(@RequestBody ProductDto productDto) {
		return productDao.save(productDto);
	}

	@GetMapping("/")
	public List<ProductDto> list() {
		return productDao.list();
	}

	@PostMapping("/complex")
	public List<ProductDto> complex(@RequestBody ProductSearchVO productSearchVO) {
		return productDao.complexSearch(productSearchVO);
	}

	@GetMapping("/type/{type}/keyword/{keyword}")
	public List<ProductDto> search(@PathVariable String type, @PathVariable String keyword){
		return productDao.search(type, keyword);
	}

	@GetMapping("/no/{no}")
	public ProductDto find(@PathVariable int no) {
		return productDao.info(no);
	}

	@PutMapping("/")
	public ProductDto edit(@RequestBody ProductDto productDto) {
		return productDao.edit(productDto);
	}

	@DeleteMapping("/{no}")
	public void delete(@PathVariable int no) {
		productDao.delete(no);
	}

}