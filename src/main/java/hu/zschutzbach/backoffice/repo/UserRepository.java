package hu.zschutzbach.backoffice.repo;

import hu.zschutzbach.backoffice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
