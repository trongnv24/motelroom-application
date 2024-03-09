package TrainingjavaSpringboot.motel.room.service.impl;

import TrainingjavaSpringboot.motel.room.dto.request.RoomRequest;
import TrainingjavaSpringboot.motel.room.dto.response.RoomResponse;
import TrainingjavaSpringboot.motel.room.entity.RoomEntity;
import TrainingjavaSpringboot.motel.room.repository.RoomRepository;
import TrainingjavaSpringboot.motel.room.service.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static TrainingjavaSpringboot.motel.room.service.mapping.RoomMapping.convertEntityToRoomResponse;
import static TrainingjavaSpringboot.motel.room.service.mapping.RoomMapping.covertDtoToEntity;

@Service
@Slf4j
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public RoomResponse create(RoomRequest request) {
        log.info(" === Start api create new room === ");
        log.info(" === Request Body : {} === ", request);
        RoomEntity entity = covertDtoToEntity(request);
        entity = roomRepository.save(entity);
        RoomResponse response = convertEntityToRoomResponse(entity);
        log.info(" === Finish api create new room, Room Id : {} === ", response.getId());
        return response;
    }
}