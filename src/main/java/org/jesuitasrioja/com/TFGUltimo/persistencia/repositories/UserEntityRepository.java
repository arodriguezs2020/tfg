package org.jesuitasrioja.com.TFGUltimo.persistencia.repositories;

import java.util.Optional;

import org.jesuitasrioja.com.TFGUltimo.modelo.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, String>{
	Optional<UserEntity> findByUsername(String username);
}

