import java.io.Serializable;

public  class Hotel implements Serializable {
    private String id;
    private String type;
    private int rentDays;
    private String status;
    private double price;
    private Human person;

    public Hotel() {
    }

    public Hotel(String id, String type, int rentDays, String status, double price, Human person) {
        this.id = id;
        this.type = type;
        this.rentDays = rentDays;
        this.status = status;
        this.price = price;
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRentDays() {
        return rentDays;
    }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Human getPerson() {
        return person;
    }

    public void setPerson(Human person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return person + ",  " + "Phòng: " +  id + ", Loại: " + type + ", Số ngày thuê: " + rentDays + ", Giá: " + price + ", trạng thái: " + status;
    }
}
