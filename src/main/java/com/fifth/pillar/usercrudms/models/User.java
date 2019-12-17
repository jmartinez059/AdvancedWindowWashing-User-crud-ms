package com.fifth.pillar.usercrudms.models;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(name = "uName")
	private String uName;

	@NotNull
	@Column(name = "pWord")
	private String pWord;

	@NotNull
	@Column(name = "fName")
	private String fName;

	@NotNull
	@Column(name = "lName")
	private String lName;

	@Column(name = "email")
	private String email;

//	private Address address;

	@Column(name = "phoneNumber")
	private String phoneNumber;
}
