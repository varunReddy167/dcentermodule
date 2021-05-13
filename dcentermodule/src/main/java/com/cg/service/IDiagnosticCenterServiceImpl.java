package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IDiagnosticCenterRepository;
import com.cg.entities.DiagnosticCenter;
import com.cg.exceptions.DiagnosticCenterNotFoundException;

@Service

public class IDiagnosticCenterServiceImpl implements IDiagnosticCenterService {

	@Autowired

	private IDiagnosticCenterRepository idrepo;
	private static final Logger LOGGER = LoggerFactory.getLogger(IDiagnosticCenterServiceImpl.class);

	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters() {
		// TODO Auto-generated method stub
		return idrepo.findAll();
	}

	@Override
	@Transactional
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter)
			throws DiagnosticCenterNotFoundException {
		Optional<DiagnosticCenter> OptionaldiagnosticCenter = idrepo.findById(diagnosticCenter.getDcenterid());
		// TODO Auto-generated method stub
		return diagnosticCenter;
	}

	/*
	 * @Override public DiagnosticCenter getDiagnosticCenterById(int
	 * diagnosticCenterId) {
	 * 
	 * LOGGER.info("called get method()"); DiagnosticCenter
	 * diagnosticCenter=idrepo.findByDiagnosticCenterId(diagnosticCenterId);
	 * idrepo.getById()); // TODO Auto-generated method stub return null; }
	 */

	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter)
			throws DiagnosticCenterNotFoundException {
		// TODO Auto-generated method stub
		LOGGER.debug("called add centers method()" + diagnosticCenter);
		return (DiagnosticCenter) idrepo.findAll();
	}

	

	

	@Override
	public DiagnosticCenter removeDiagnosticCenter(int dcenterid) throws DiagnosticCenterNotFoundException {
		// TODO Auto-generated method stub
		LOGGER.info("called remove method()");
		DiagnosticCenter diagnosticCenter = idrepo.findByDcenterid(dcenterid);
		idrepo.deleteById(dcenterid);
		// TODO Auto-generated method stub
		return diagnosticCenter;
	

	}
	/*
	@Override
	public DiagnosticCenter getDiagnosticCenterById(int dcenterid) throws DiagnosticCenterNotFoundException {
		// TODO Auto-generated method stub
	LOGGER.info("called get method()");
		return null;
	}
	*/

	@Override
	public DiagnosticCenter getDiagnosticCenterById(int dcenterid) throws DiagnosticCenterNotFoundException {
		// TODO Auto-generated method stub
		Optional<DiagnosticCenter>diagnosticCenter=idrepo.findById(dcenterid);
		
		return diagnosticCenter.get();
	}

	/*
	@Override
	public DiagnosticCenter getDiagnosticCenter(String name) throws DiagnosticCenterNotFoundException {
		// TODO Auto-generated method stub
LOGGER.debug(" called getbycenter name method()");
   DiagnosticCenter diagnosticCenter=idrepo.findbyName(name);
		return null;
	}
	*/

	

}