package warehouse;

public class Product {

    private String id;
    private String name;
    private String category;
    private int rating;

    public Product(String id, String name, String category, int rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public int getRating(){
        return rating;
    }

    public static class Builder {
        private String id;
        private String name;
        private String category;
        private int rating;
    }
}
