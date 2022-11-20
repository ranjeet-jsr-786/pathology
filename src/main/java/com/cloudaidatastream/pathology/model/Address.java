package com.cloudaidatastream.pathology.model;

import java.sql.Timestamp;

public class Address {
	
	private long id;			
	private String street1;			
	private String street2;
	private String landmark;	
	private String city;		
	private String state;		
	private int pin;			
	private String updated_by;		
	private Timestamp update_date;		
	private String created_by; 		
	private Timestamp create_date;
	private int version;
}
