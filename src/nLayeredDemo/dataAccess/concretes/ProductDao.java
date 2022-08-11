package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.List;
import nLayeredDemo.dataAccess.abstracts.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
<Product> getAll();

}
