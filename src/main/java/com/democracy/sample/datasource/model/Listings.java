package com.democracy.sample.datasource.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@DynamicInsert
@DynamicUpdate
public class Listings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String category;

	private String city;

	private String state;

	private String country;

	private String info;

	private String address;

	@Column(name = "contact_number")
	private String contactNumber;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "created_on")
	private Date createdOn;

	@Column(name = "updated_on")
	private Date updatedOn;

}
