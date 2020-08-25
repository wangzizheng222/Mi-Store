package entity;

public class User {
    private String id;
    private String mi_id;
    private String tel;
    private String mail;
    private String password;
    private String name;

    public User(){}

    public User(String id, String mi_id, String tel, String mail, String password, String name) {
        this.id = id;
        this.mi_id = mi_id;
        this.tel = tel;
        this.mail = mail;
        this.password = password;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMi_id() {
        return mi_id;
    }

    public void setMi_id(String mi_id) {
        this.mi_id = mi_id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", mi_id='" + mi_id + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
