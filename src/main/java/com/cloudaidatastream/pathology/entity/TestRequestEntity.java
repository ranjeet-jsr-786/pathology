package com.cloudaidatastream.pathology.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="TEST_REQUEST")
@EntityListeners(AuditingEntityListener.class)
public class TestRequestEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id", nullable = false)
	private PatientRequestEntity patientRequest;	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id", nullable = false)
	private TestEntity test;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "package_id", nullable = false)
	private PackageEntity packages;
	
	@OneToOne(mappedBy = "testRequest")
	private TestReportEntity testReport;
	
	private Timestamp date_time;
	private String lab_number;
	private boolean active;

}
