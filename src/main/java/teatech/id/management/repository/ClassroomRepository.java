package teatech.id.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teatech.id.management.entity.Classroom;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, String> {
}
