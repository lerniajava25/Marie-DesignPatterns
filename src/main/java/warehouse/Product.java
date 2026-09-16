package warehouse;

public class Product {

    private final String id;
    private final String name;
    private final String category;
    private final int rating;

    private Product(String id, String name, String category, int rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getRating() {
        return rating;
    }

    public static final class Builder {
        private String id;
        private String name;
        private String category;
        private int rating;


        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder rating(int rating) {
            this.rating = rating;
            return this;
        }

        public Product build() {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Produkten måste ha ett namn");
            }
            return new Product(id, name, category, rating);
        }
    }
}
