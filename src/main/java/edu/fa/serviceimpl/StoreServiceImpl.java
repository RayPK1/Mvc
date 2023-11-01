package edu.fa.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Product;
import edu.fa.repository.StoreRepository;
import edu.fa.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService{
	@Autowired
	private StoreRepository storeRepository;

	@Override
	public Iterable<Product> getAllProduct() {
		return storeRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		return storeRepository.findById(id);
	}

	@Override
	public void addProduct(Product p) {
		storeRepository.save(p);
		
	}

	@Override
	public void updateProduct(Product p) {
		storeRepository.save(p);
		
	}

	@Override
	public void deleteProduct(int id) {
		storeRepository.delete(id);
		
	}

	
}
