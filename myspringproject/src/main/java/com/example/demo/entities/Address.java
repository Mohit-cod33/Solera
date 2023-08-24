package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="dealer_address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressId;
	private String street;
	private String city;
	private String state;
	private String country;
	private Long zipCode;
}
