package com.fifth.pillar.usercrudms.models.projections;


import com.fifth.pillar.usercrudms.models.User;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Projection(name="full", types={User.class})
public interface UserProjection {

    Long id();
    String uName();
    String pWord();
    String fName();
    String lName();
    String email();
//	Address address();
    String phoneNumbe();
}
