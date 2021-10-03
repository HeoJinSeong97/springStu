package com.kim.app.product.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kim.app.product.ProductVO;

@Repository("productDAO")
public class ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertProduct(ProductVO vo) {
		String sql="insert into product (id,name,price) values((select nvl(max(id),0)+1 from product),?,?)";
		System.out.println("상품입력...");
		jdbcTemplate.update(sql, vo.getName(),vo.getPrice());
	}
	public void updateProduct(ProductVO vo) {
		String sql="update product set name=?,price=? where id=?";
		System.out.println("상품정보변경...");
		jdbcTemplate.update(sql, vo.getName(),vo.getPrice(),vo.getId());
	}
	public void deleteProduct(ProductVO vo) {
		String sql="delete product where id=?";
		System.out.println("상품삭제...");
		jdbcTemplate.update(sql, vo.getId());
	}
	public ProductVO getProduct(ProductVO vo) {
		String sql="select * from product where id=?";
		System.out.println("상품검색...");
		Object[] args= {vo.getId()};
		return jdbcTemplate.queryForObject(sql, args,new ProductRowMapper());
	}
	
	public List<ProductVO> getProductList(ProductVO vo){
		String sql="select * from product order by id asc";
		System.out.println("상품목록출력...");
		return jdbcTemplate.query(sql, new ProductRowMapper());
	}
	
}

class ProductRowMapper implements RowMapper{

	@Override
	public ProductVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductVO data=new ProductVO();
		data.setId(rs.getInt("id"));
		data.setName(rs.getString("name"));
		data.setPrice(rs.getInt("price"));
		return data;
	}
	
}
