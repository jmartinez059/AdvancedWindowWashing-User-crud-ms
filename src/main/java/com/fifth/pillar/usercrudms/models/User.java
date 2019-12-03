package com.fifth.pillar.usercrudms.models;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String uName;

	@NotNull
	private String pWord;

	@NotNull
	private String fName;

	@NotNull
	private String lName;

	private String email;

//	private Address address;

	private String phoneNumber;
}
