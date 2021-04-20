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

import br.uece.eesdevops.entity.Travel;
import br.uece.eesdevops.repository.TravelRepository;

@RestController
public class TravelController {

	@Autowired
	private TravelRepository travelRepository;

	@RequestMapping(value = "/travels", method = RequestMethod.GET)
	public List<Travel> GetAll(){
		return travelRepository.findAll();
	}

	@RequestMapping(value = "/travels/{id}", method = RequestMethod.GET)
	public ResponseEntity<Travel> GetById(@PathVariable(value = "id") long id){

		Optional<Travel> travel = travelRepository.findById(id);
		if (travel.isPresent()) 
			return new ResponseEntity<Travel>(travel.get(), HttpStatus.OK);
		else
			return new ResponseEntity<Travel>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/travels", method = RequestMethod.POST)
	public void POST(@RequestBody Travel travel){
		travelRepository.save(travel);
	}

/*
	@RequestMapping(value = "/travels/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Travel> PUT(@PathVariable(value = "id") long id, @RequestBody Travel newTravel){

		Optional<Travel> oldTravel = travelRepository.findById(id);
		if (oldTravel.isPresent()) {

			Travel travel =  oldTravel.get();
			travel.setAccount(newTravel.getAccount());
			travelRepository.save(travel);
			return new ResponseEntity<Travel>(travel, HttpStatus.OK);
		}
		else
			return new ResponseEntity<Travel>(HttpStatus.NOT_FOUND);
	}
 **/

	@RequestMapping(value = "/travels/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
	{
		Optional<Travel> travel = travelRepository.findById(id);
		if(travel.isPresent()){
			travelRepository.delete(travel.get());
			return new ResponseEntity<>(HttpStatus.OK);
		}
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}