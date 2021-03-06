package com.netcracker.backend.repository;

import com.netcracker.backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByNickname(String nickname);

}
