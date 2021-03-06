package com.widebidders.models.service;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widebidders.models.db.ProductDaoImpl;
import com.widebidders.models.entities.Customer;
import com.widebidders.models.entities.Product;
import com.widebidders.models.entities.ProductImage;

@Service
public class ProductServiceImpl implements ProductService{
	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	
	@Autowired
    private ProductDaoImpl productDboImpl;
	
	public ProductServiceImpl() {
	}

	@Override
	public List getProducts() {
		return productDboImpl.getProducts();
		//return ProductMap;
	}

	@Override
	public int addProduct(Product product, Customer customer) {
		return productDboImpl.addProduct(product, customer);
	}

	@Override
	public Product getProductById(int id){
		return productDboImpl.getProductById(id);
	}

	@Override
	public void deleteProduct(int id) {
		productDboImpl.deleteProduct(id);
	}

	@Override
	public void updateProduct(Product product) {
		productDboImpl.updateProduct( product);
	}

	@Override
	public void addImage(ProductImage productImage) {
		logger.info("Inside Add Image of product service impl");
	}

	@Override
	public Set getImages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		return productDboImpl.getProductByCategory(category);
	}

	@Override
	public List<Product> getProductByProductName(String productName) {
		return productDboImpl.getProductProductName(productName);
	}


	@Override
	public List getProductByCustomerId(int customerId) {
		return  productDboImpl.getProductByCustomerId(customerId);
	}
}
