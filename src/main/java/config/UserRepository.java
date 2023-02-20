package config;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;


public interface UserRepository extends CrudRepository<MyUser, Long> {
    MyUser findByUsername(String username);
}
