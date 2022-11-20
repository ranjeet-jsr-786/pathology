package com.cloudaidatastream.pathology.model;

import java.sql.Timestamp;

public class PatientEntity {

	private long id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private int age;
	private String contact;
	private String alternate_contact;
	private String email_id;
	private String doctor_ref;
	private String remark;
	private String updated_by;
	private Timestamp update_date;
	private String created_by;
	private Timestamp create_date;
	private int version;
}
