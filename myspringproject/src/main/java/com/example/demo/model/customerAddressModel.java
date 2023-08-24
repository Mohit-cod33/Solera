package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Component
public class customerAddressModel {
	private String  dealerName;
	private String street;
	private String city;
	private String state;
	private String country;
	private Long zipCode;
}

