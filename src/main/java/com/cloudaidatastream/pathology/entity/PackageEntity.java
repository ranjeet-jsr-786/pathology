package com.cloudaidatastream.pathology.entity;

import java.sql.Timestamp;
import java.util.HashSet;
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
@Table(name="PACKAGE")
@EntityListeners(AuditingEntityListener.class)
public class PackageEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private boolean active;
	private double cost;
	private double discount;
	private double tax1;
	private double tax2;
	private double tax3;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "packageEntity", cascade = CascadeType.ALL)
	private Set<PackageTestEntity> patientTest = new HashSet<PackageTestEntity>();
	
}
