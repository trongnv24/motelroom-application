package TrainingjavaSpringboot.motel.room.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "room")
public class RoomEntity {
    @Id
    private String id ;
    private String name;
    private double acreage;
    private String location;
    private double price;
    @PrePersist
    public void init() {
        this.id = Objects.isNull(this.id) ? UUID.randomUUID().toString() : this.id;
    }


    public RoomEntity() {
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
        return "RoomEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", acreage=" + acreage +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
