package com.fifth.pillar.usercrudms.repositories;

import com.fifth.pillar.usercrudms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface UserRepository extends JpaRepository<User, Long> {

//     User getUserById(@Param("id") Long id);

     long count();
}
