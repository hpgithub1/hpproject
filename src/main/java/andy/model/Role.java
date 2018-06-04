package andy.model;

public class Role {
    private Integer roldid;

    private String roldname;

    public Integer getRoldid() {
        return roldid;
    }

    public void setRoldid(Integer roldid) {
        this.roldid = roldid;
    }

    public String getRoldname() {
        return roldname;
    }

    public void setRoldname(String roldname) {
        this.roldname = roldname == null ? null : roldname.trim();
    }
}