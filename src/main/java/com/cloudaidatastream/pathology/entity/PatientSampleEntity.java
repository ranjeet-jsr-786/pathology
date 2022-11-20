package com.cloudaidatastream.pathology.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="PATIENT_SAMPLE")
@EntityListeners(AuditingEntityListener.class)
public class PatientSampleEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id", nullable = false)
	private PatientEntity patient;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "request_id", nullable = false)
	private PatientRequestEntity patientRequest;
	
	private String sample_name;		
	private String sample_description;	
	private String sample_code;
	private String sample_spot;
	private String collection_spot;
	private Timestamp collection_date_time;
	private boolean active;
	
}
