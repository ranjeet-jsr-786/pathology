package com.cloudaidatastream.pathology.model;

import java.sql.Timestamp;

public class PatientSample {

	private long id;			
	private long patient_id;	
	private long request_id;	
	private String sample_name;		
	private String sample_description;	
	private String sample_code;
	private String sample_spot;
	private String collection_spot;
	private Timestamp collection_date_time;
	private boolean active;
	private String updated_by;
	private Timestamp update_date;
	private String created_by;
	private Timestamp create_date;	
	private int version;
}
