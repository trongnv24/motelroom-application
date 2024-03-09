package TrainingjavaSpringboot.motel.room.repository;

import TrainingjavaSpringboot.motel.room.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, String> {
}
