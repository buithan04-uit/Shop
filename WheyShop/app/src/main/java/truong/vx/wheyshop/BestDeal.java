package truong.vx.wheyshop;

public class BestDeal {
    private String title;
    private int imageId;
    private String description;
    private double price;
    private double star;
    private int id;
    private int categoryId;
    private int LocationId;

    public BestDeal(String title, int imageId, String description, double price, double star, int id, int categoryId, int locationId) {
        this.title = title;
        this.imageId = imageId;
        this.description = description;
        this.price = price;
        this.star = star;
        this.id = id;
        this.categoryId = categoryId;
        LocationId = locationId;
    }

    public String getTitle() {
        return title;
    }

    public int getImageId() {
        return imageId;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getStar() {
        return star;
    }

    public int getId() {
        return id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public int getLocationId() {
        return LocationId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setLocationId(int locationId) {
        LocationId = locationId;
    }
}
