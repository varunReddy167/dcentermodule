package com.cg.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entities.DiagnosticCenter;
import com.cg.exceptions.DiagnosticCenterNotFoundException;


@Service

public interface IDiagnosticCenterService {

	public List<DiagnosticCenter> getAllDiagnosticCenters();
	/*//public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws Exception;
	DiagnosticCenter getDiagnosticCenterById(int diagnosticCenterId);
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	DiagnosticCenter getDiagnosticCenter(String centername);
	
	DiagnosticCenter removeDiagnosticCenter(int id) throws DiagnosticCenterNotFoundException;*/
	
	//public DiagnosticCenter updateDiagnosticCenter1(DiagnosticCenter diagnosticCenter) throws DiagnosticCenterNotFoundException;

	DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws DiagnosticCenterNotFoundException;

	//public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);

	//public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	//DiagnosticCenter getDiagnosticCenterById(int dcenterId);
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws Exception;
	DiagnosticCenter removeDiagnosticCenter(int dcenterid) throws DiagnosticCenterNotFoundException;
	DiagnosticCenter getDiagnosticCenterById(int dcenterid) throws DiagnosticCenterNotFoundException;
	 //getDiagnosticCenter(String name) throws  DiagnosticCenterNotFoundException;

	

}

