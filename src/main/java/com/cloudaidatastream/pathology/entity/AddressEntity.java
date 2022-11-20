package com.cloudaidatastream.pathology.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="ADDRESS")
@EntityListeners(AuditingEntityListener.class)
public class AddressEntity extends Auditable<String> {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;			
	private String street1;			
	private String street2;
	private String landmark;	
	private String city;		
	private String state;		
	private int pin;	
	
}
