package com.cloudaidatastream.pathology.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="PATIENT")
@EntityListeners(AuditingEntityListener.class)
public class PatientEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient", cascade = CascadeType.ALL)
	private List<PatientRequestEntity> patients = new ArrayList<PatientRequestEntity>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient", cascade = CascadeType.ALL)
	private Set<PatientAddressEntity> patientAddress = new HashSet<PatientAddressEntity>();
	
}
