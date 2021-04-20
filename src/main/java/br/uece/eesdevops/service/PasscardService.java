package br.uece.eesdevops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uece.eesdevops.repository.PasscardRepository;

@Service
public class PasscardService {
	
	private PasscardRepository passcardRepository;
	
    @Autowired
    public PasscardService(PasscardRepository passcardRepository) {
        this.passcardRepository = passcardRepository;
    }

}
