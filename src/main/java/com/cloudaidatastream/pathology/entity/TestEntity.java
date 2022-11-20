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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="TEST")
@EntityListeners(AuditingEntityListener.class)
public class TestEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test", cascade = CascadeType.ALL)
	private List<PackageTestEntity> packageTests = new ArrayList<PackageTestEntity>();
	
	private String title;
	private boolean active;
	private String lower_range;
	private String upper_range;
	private String unit;
	private double cost;
	private double discount;
	private double tax1;
	private double tax2;
	private double tax3;
	

}
