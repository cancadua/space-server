package server.spaceserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.spaceserver.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);
}
