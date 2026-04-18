package udb.edu.sv.desafiodwf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udb.edu.sv.desafiodwf.domain.AppUser;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
    boolean existsByUsername(String username);
}
