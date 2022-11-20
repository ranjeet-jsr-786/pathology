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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="PATIENT_TEST")
@EntityListeners(AuditingEntityListener.class)
public class PatientSampleTestEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "p_test_request_id", nullable = false)
	private TestRequestEntity testRequest;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sample_id", nullable = false)
	private PatientSampleEntity patientSample;
	
	private int test_attempt;
	private String result;
	private Timestamp test_date_time;
	private int status;
	
}
