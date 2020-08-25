package entity;

public class Item {
    private String id;
    private String name;
    private String detail;
    private String low_price;
    private String img;
    private String brief_intro;
    private int num;
    private String type;
    private String version;
    private String price;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public Item() {
    }

    public Item(String id, String name, String detail, String low_price,
                String img, String brief_intro, int num, String type) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.low_price = low_price;
        this.img = img;
        this.brief_intro = brief_intro;
        this.num = num;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", low_price='" + low_price + '\'' +
                ", img='" + img + '\'' +
                ", brief_intro='" + brief_intro + '\'' +
                ", num=" + num +
                ", type='" + type + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLow_price() {
        return low_price;
    }

    public void setLow_price(String low_price) {
        this.low_price = low_price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBrief_intro() {
        return brief_intro;
    }

    public void setBrief_intro(String brief_intro) {
        this.brief_intro = brief_intro;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
