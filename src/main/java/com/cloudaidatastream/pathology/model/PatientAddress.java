package com.cloudaidatastream.pathology.model;

import java.sql.Timestamp;

public class PatientAddress {
	
	private long id;			
	private long patient_id;	
	private long address_id; 	
	private String address_type;	
	private boolean active; 		
	private String updated_by;		
	private Timestamp update_date;		
	private String created_by; 		
	private Timestamp create_date;		
	private int version;			
}
