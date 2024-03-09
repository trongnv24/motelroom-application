package TrainingjavaSpringboot.motel.room.service;

import TrainingjavaSpringboot.motel.room.dto.request.RoomRequest;
import TrainingjavaSpringboot.motel.room.dto.response.RoomResponse;

public interface RoomService {

    RoomResponse create (RoomRequest request);

    RoomResponse getById(String id );

    RoomResponse update(RoomRequest request, String id);
}
