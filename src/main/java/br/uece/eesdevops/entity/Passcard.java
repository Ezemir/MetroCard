package br.uece.eesdevops.entity;

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
@Table(name = "passcards")
public class Passcard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int userID;
	private boolean enabledToTravel = false;

	@OneToOne
	private Account account;

	@OneToOne
	private Travel travel;

	public boolean checkBalance() {
		if(account.getBankBalance()>=travel.getTypeZone()) {
			enabledToTravel = true;
		}
		return enabledToTravel;
	}

}
