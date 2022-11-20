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
@Table(name="TEST_REPORT")
@EntityListeners(AuditingEntityListener.class)
public class TestReportEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "p_test_request_id", nullable = false)
	private TestRequestEntity testRequest ;
	
	private String report_description;
	private String report_value;
	private Timestamp report_date_time;
	private String report_conclusion;
	
}
