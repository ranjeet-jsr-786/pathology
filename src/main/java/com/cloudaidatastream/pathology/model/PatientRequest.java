package com.cloudaidatastream.pathology.model;

import java.sql.Timestamp;

public class PatientRequest {
	
	private long id;			
	private long patient_id;	
	private String title;		
	private String description;	
	private Timestamp date_time;	
	private String lab_number;	
	private boolean active; 		
	private String updated_by;		
	private Timestamp update_date;		
	private String created_by;		
	private Timestamp create_date;		
	private int version;			

}
