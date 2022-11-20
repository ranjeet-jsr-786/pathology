package com.cloudaidatastream.pathology.model;

import java.sql.Timestamp;

public class Package {
	
	private long id;
	private String title;
	private boolean active;
	private double cost;
	private double discount;
	private double tax1;
	private double tax2;
	private double tax3;
	private String updated_by;
	private Timestamp update_date;
	private String created_by;
	private Timestamp create_date;	
	private int version;
}
