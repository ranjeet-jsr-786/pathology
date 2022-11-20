package com.cloudaidatastream.pathology.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
@Table(name="BILL")
@EntityListeners(AuditingEntityListener.class)
public class BillEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id", nullable = false)
	private PatientRequestEntity patientRequest ;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bill", cascade = CascadeType.ALL)
	private List<PaymentEntity> patients = new ArrayList<PaymentEntity>();
	
	private double total_cost;
	private double total_discount;
	private double total_tax1;
	private double total_tax2;
	private double total_tax3;
	}
