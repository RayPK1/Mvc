package edu.fa.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.model.Product;

@Repository
@Transactional
public interface StoreRepository extends CrudRepository<Product, Integer> {
	
	Product findById(int id);
	
	/*@Autowired
	DataSource dataSource;
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	public List<Product> getAllProduct() {
		jdbcTemplate.setDataSource(dataSource);
		String query = "select * from Product";
		return jdbcTemplate.query(query, new productMapper());
	}
	
	public Product getProductById(int id) {
		jdbcTemplate.setDataSource(dataSource);
		String query = "select * from Product where id = ?";
		return jdbcTemplate.queryForObject(query, new Object[] {id}, new productMapper());
	}
	
	public void addProduct(Product p) {
		jdbcTemplate.setDataSource(dataSource);
		String query = "insert into Product(name, quantity, price) values ('" + p.getName() + "'," + p.getQuantity() + "," + p.getPrice() + ")";
		jdbcTemplate.execute(query);
	}
	
	public void updateProduct(Product p) {
		jdbcTemplate.setDataSource(dataSource);
		String query = "update product set name = '" + p.getName() + "', quantity = '" + p.getQuantity() + "', price = " + p.getPrice() + " where id = " + p.getId();
		jdbcTemplate.execute(query);
	}
	
	public void deleteProduct(int id) {
		jdbcTemplate.setDataSource(dataSource);
		String query = "delete from Product where id = " + id;
		jdbcTemplate.execute(query);
	} 
	
	public static final class productMapper implements RowMapper<Product> {
		public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			return new Product(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("quantity"), resultSet.getLong("price"));
		}
		
	}*/
}
