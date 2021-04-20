package br.uece.eesdevops.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity 
@Table(name = "travels")
public class Travel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date dateIn;
	private Date dateOut;
	private double typeZone;
	private String typeTravel;
	
	@OneToOne
	public Passcard passcard;
	
	private void enabledToTravel() {
		if(passcard.isEnabledToTravel() == true) {
			
		}
	}
	
	

}
