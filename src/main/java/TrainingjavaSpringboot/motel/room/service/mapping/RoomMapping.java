package TrainingjavaSpringboot.motel.room.service.mapping;

import TrainingjavaSpringboot.motel.room.dto.request.RoomRequest;
import TrainingjavaSpringboot.motel.room.dto.response.RoomResponse;
import TrainingjavaSpringboot.motel.room.entity.RoomEntity;

public class RoomMapping {
    public static RoomEntity covertDtoToEntity(RoomRequest dto){
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setName(dto.getName());
        roomEntity.setAcreage(dto.getAcreage());
        roomEntity.setLocation(dto.getLocation());
        roomEntity.setPrice(dto.getPrice());
        return roomEntity;
    }
    public static RoomResponse convertEntityToRoomResponse(RoomEntity entity){
        RoomResponse dto = new RoomResponse();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAcreage(entity.getAcreage());
        dto.setLocation(entity.getLocation());
        dto.setPrice(entity.getPrice());
        return dto;
    }
}
