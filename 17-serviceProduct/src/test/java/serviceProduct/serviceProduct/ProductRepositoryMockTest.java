package serviceProduct.serviceProduct;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import serviceProduct.serviceProduct.entity.Category;
import serviceProduct.serviceProduct.entity.Product;
import serviceProduct.serviceProduct.repository.ProductRepository;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private ProductRepository productRepository ;

    @Test
    public void whenFindByCategory_thenReturnListProduct(){
        Product product01 = Product.builder()
                .name("computer")
                .category(Category.builder().id(1L).build())
                .descripcion("")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1240.99"))
                .status("Created")
                .createAt(new Date()).build() ;
        productRepository.save(product01) ;

        List<Product> found = productRepository.findByCategory(product01.getCategory()) ;

        Assertions.assertThat(found.size()).isEqualTo(3) ;

    }
}
