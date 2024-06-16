import Entity.Products;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import services.ProductService;

import java.io.IOException;

public class TestDB extends BaseTest{

    @Test
    @Tag("regress")
    public void getProduct() throws IOException {
        ProductService productService = new ProductService(); // стартуем сессию
        Products product = productService.findProduct(13); // сохраняем продукт в БД
        Assertions.assertEquals("Samsung Galaxy", product.getName());   // сравниваем значения

    }


}
