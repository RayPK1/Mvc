package edu.fa.service;


import edu.fa.model.Product;

public interface StoreService {

	Iterable<Product> getAllProduct();

	Product getProductById(int id);

	void addProduct(Product p);

	void updateProduct(Product p);

	void deleteProduct(int id);
}
