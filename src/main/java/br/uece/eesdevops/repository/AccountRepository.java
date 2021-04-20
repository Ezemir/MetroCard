package br.uece.eesdevops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uece.eesdevops.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
