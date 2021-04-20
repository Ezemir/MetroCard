package br.uece.eesdevops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uece.eesdevops.entity.Passcard;

public interface PasscardRepository extends JpaRepository<Passcard, Long> {

}
