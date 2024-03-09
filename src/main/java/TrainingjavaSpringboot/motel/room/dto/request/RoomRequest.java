package TrainingjavaSpringboot.motel.room.dto.request;

public class RoomRequest {
    private String name;
    private double acreage;
    private String location;
    private boolean security;
    private double price;

    public RoomRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomRequest{" +
                "name='" + name + '\'' +
                ", acreage=" + acreage +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
