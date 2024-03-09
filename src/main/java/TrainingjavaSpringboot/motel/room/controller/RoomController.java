package TrainingjavaSpringboot.motel.room.controller;

import TrainingjavaSpringboot.motel.room.dto.request.RoomRequest;
import TrainingjavaSpringboot.motel.room.dto.response.RoomResponse;
import TrainingjavaSpringboot.motel.room.service.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RestControllerAdvice
@RequestMapping("api/v1/rooms")
@Slf4j
public class RoomController {
    private final RoomService service;

    public RoomController(RoomService service) {
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RoomResponse create(@RequestBody RoomRequest request){
        log.info(" === Start api create new room === ");
        log.info(" === Request Body : {} === ", request);
        RoomResponse response = service.create(request);
        log.info(" === Finish api create new room, Room Id : {} ", response.getId());
        return response;
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RoomResponse getById(@PathVariable ("id") String id) {
        log.info(" === Start api getById room === ");
        log.info(" === String id : {} === ", id);
        RoomResponse response = service.getById(id);
        log.info(" === Finish api getById room, Room Id : {} === ", response.getId());
        return response;
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RoomResponse update( @RequestBody RoomRequest request, @PathVariable ("id") String id){
        log.info(" === Start api update room === ");
        log.info(" === Request Body : {}, String id  : {} === ", request, id);
        RoomResponse response = service.update(request, id);
        log.info(" === Finish api update room, Room Id {} : ", response.getId());
        return response;
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable ("id") String id){
        log.info(" === Start api delete room === ");
        log.info(" === String id : {} ", id);
        log.info(" === Finish api delete room, Room Id {} : ");
        service.deleteById(id);
    }
}
