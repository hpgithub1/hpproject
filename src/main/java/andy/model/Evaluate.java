package andy.model;

public class Evaluate {
    private String evaluateid;

    private String username;

    private String productid;

    private String content;

    private Integer rank;

    public String getEvaluateid() {
        return evaluateid;
    }

    public void setEvaluateid(String evaluateid) {
        this.evaluateid = evaluateid == null ? null : evaluateid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}