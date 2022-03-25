package com.ravi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/*import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement */  
@Data
@Entity
public class Customer {

	@Id
	private Integer i;
	private String n;
	private String email;
	
}
