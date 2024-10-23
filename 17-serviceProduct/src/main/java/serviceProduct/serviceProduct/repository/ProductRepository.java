package serviceProduct.serviceProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import serviceProduct.serviceProduct.entity.Category;
import serviceProduct.serviceProduct.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByCategory(Category category) ;
}
