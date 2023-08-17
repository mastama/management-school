package teatech.id.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teatech.id.management.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String> {
}
