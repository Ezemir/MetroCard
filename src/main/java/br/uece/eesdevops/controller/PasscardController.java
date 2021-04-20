package br.uece.eesdevops.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.uece.eesdevops.entity.Passcard;
import br.uece.eesdevops.repository.PasscardRepository;

@RestController
public class PasscardController {

	@Autowired
	private PasscardRepository passcardRepository;

	@RequestMapping(value = "/passcards", method = RequestMethod.GET)
	public List<Passcard> GetAll(){
		return passcardRepository.findAll();
	}

	@RequestMapping(value = "/passcards/{id}", method = RequestMethod.GET)
	public ResponseEntity<Passcard> GetById(@PathVariable(value = "id") long id){

		Optional<Passcard> passcard = passcardRepository.findById(id);
		if (passcard.isPresent()) 
			return new ResponseEntity<Passcard>(passcard.get(), HttpStatus.OK);
		else
			return new ResponseEntity<Passcard>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/passcards", method = RequestMethod.POST)
	public void POST(@RequestBody Passcard passcard){
		passcardRepository.save(passcard);
	}

	@RequestMapping(value = "/passcards/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Passcard> PUT(@PathVariable(value = "id") long id, @RequestBody Passcard newPasscard){

		Optional<Passcard> oldPasscard = passcardRepository.findById(id);
		if (oldPasscard.isPresent()) {

			Passcard passcard =  oldPasscard.get();
			passcard.setAccount(newPasscard.getAccount());
			passcardRepository.save(passcard);
			return new ResponseEntity<Passcard>(passcard, HttpStatus.OK);
		}
		else
			return new ResponseEntity<Passcard>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/passcards/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
	{
		Optional<Passcard> passcard = passcardRepository.findById(id);
		if(passcard.isPresent()){
			passcardRepository.delete(passcard.get());
			return new ResponseEntity<>(HttpStatus.OK);
		}
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}