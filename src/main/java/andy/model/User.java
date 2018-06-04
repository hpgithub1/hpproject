package andy.model;

public class User {
    private String id;

    private String username;

    private String password;

    private String name;

    private Integer roldid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRoldid() {
        return roldid;
    }

    public void setRoldid(Integer roldid) {
        this.roldid = roldid;
    }
}