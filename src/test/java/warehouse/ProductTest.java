package warehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductTest {

    @Test
    void shouldBuildProductWithCorrectValues() {
        Product product = new Product.Builder()
                .id("id1")
                .name("SuperWidget")
                .category("TOOLS")
                .rating(8)
                .build();

        assertEquals("id1", product.getId());
        assertEquals("SuperWidget", product.getName());
        assertEquals("TOOLS", product.getCategory());
        assertEquals(8, product.getRating());
    }

    @Test
    void shouldNotBuildProductWithoutName() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Product.Builder()
                        .id("id1")
                        .category("TOOLS")
                        .rating(8)
                        .build()
        );
    }

    @Test
    void ShouldNotBuildProductWithEmptyName() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Product.Builder()
                        .id("id1")
                        .name("")
                        .category("TOOLS")
                        .rating(8)
                        .build()
        );
    }

    @Test
    void ShouldNotBuildProductWithBlankName() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Product.Builder()
                        .id("id1")
                        .name("  ")
                        .category("TOOLS")
                        .rating(8)
                        .build()
        );
    }

}
