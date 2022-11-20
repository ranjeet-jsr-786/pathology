package com.cloudaidatastream.pathology.model;

import java.sql.Timestamp;

public class Bill {

	private long id;
	private long request_id;
	private double total_cost;
	private double total_discount;
	private double total_tax1;
	private double total_tax2;
	private double total_tax3;
	private String updated_by;
	private Timestamp update_date;
	private String created_by;
	private Timestamp create_date;	
	private int version;
}
