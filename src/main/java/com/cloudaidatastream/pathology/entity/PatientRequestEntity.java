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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="PATIENT_REQUEST")
@EntityListeners(AuditingEntityListener.class)
public class PatientRequestEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id", nullable = false)
	private PatientEntity patient;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientRequest", cascade = CascadeType.ALL)
	private Set<PatientSampleEntity> patientRequests = new HashSet<PatientSampleEntity>();
	
	@OneToOne(mappedBy = "patientRequest", cascade = CascadeType.ALL)
	private BillEntity bills = new BillEntity();
	
	private String title;		
	private String description;	
	private Timestamp date_time;	
	private String lab_number;	
	private boolean active; 		
				

}
