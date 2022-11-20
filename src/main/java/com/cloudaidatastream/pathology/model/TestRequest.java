package com.cloudaidatastream.pathology.model;

import java.sql.Timestamp;

public class TestRequest {
	
	private long id;		
	private long request_id;
	private long test_id;	
	private long package_id;
	private Timestamp date_time;
	private String lab_number;
	private boolean active;
}
