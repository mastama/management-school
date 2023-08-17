package teatech.id.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teatech.id.management.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
}
