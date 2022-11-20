package com.cloudaidatastream.pathology.model;

import java.sql.Timestamp;

public class Payment {

	private long id;
	private long bill_id;
	private String description;
	private String mode_of_payment;
	private double amount_paid;
	private double balance_amount;
	private String updated_by;
	private Timestamp update_date;
	private String created_by;
	private Timestamp create_date;	
	private int version;
}
