package TrainingjavaSpringboot.motel.room.dto.response;

import TrainingjavaSpringboot.motel.room.dto.request.RoomRequest;

public class RoomResponse extends RoomRequest {
    private String id;

    public RoomResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RoomResponse{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", acreage=" + getAcreage() +
                ", location='" + getLocation() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
