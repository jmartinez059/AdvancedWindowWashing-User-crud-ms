package com.fifth.pillar.usercrudms.repositories;

import com.fifth.pillar.usercrudms.models.User;
import com.fifth.pillar.usercrudms.models.projections.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(excerptProjection = UserProjection.class, path = "/user")
public interface UserRepository extends JpaRepository<User, Long> {

     User getUserById(Long id);

     long count();
}
