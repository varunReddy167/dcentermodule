package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.DiagnosticCenter;


@Repository
public interface IDiagnosticCenterRepository extends JpaRepository<DiagnosticCenter,Integer> {

	

	public DiagnosticCenter findByDcenterid(int dcenterid);

	//public DiagnosticCenter findbyName(String name);

	//public DiagnosticCenter findbyName(String name);
	

}



