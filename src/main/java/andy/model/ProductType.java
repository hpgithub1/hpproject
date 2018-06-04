package andy.model;

public class ProductType {
    private Integer producttypeid;

    private String producttypename;

    public Integer getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Integer producttypeid) {
        this.producttypeid = producttypeid;
    }

    public String getProducttypename() {
        return producttypename;
    }

    public void setProducttypename(String producttypename) {
        this.producttypename = producttypename == null ? null : producttypename.trim();
    }
}