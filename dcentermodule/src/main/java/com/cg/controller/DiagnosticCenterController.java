package com.cg.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.IDiagnosticCenterRepository;
import com.cg.entities.DiagnosticCenter;
import com.cg.exceptions.DiagnosticCenterNotFoundException;
import com.cg.service.IDiagnosticCenterService;


@RestController
@RequestMapping("/HealthCare")
public class DiagnosticCenterController {

	@Autowired
	private IDiagnosticCenterService idiagnosticcenterservice;
	@Autowired
	private IDiagnosticCenterRepository idrepo;
	 Logger LOGGER = LoggerFactory.getLogger(DiagnosticCenterController.class);

	
	@GetMapping("/dtest")
	   public List<DiagnosticCenter> findAll() {
	       return idrepo.findAll();
	   }
	
	@PutMapping("/update")
	public DiagnosticCenter updateDiagnosticCenter(@Validated @RequestBody DiagnosticCenter diagnosticCenter)throws DiagnosticCenterNotFoundException{
		LOGGER.info("called update method()");
		  DiagnosticCenter idrep=idiagnosticcenterservice.updateDiagnosticCenter(diagnosticCenter);
		return idrep;
	}
	@PostMapping("/adddiagnosticCenter")
	public ResponseEntity<DiagnosticCenter> addDiagnosticCenter(@Validated @RequestBody DiagnosticCenter diagnosticCenter) throws Exception{
		LOGGER.info("called add center method()");
		DiagnosticCenter idre=idiagnosticcenterservice.addDiagnosticCenter(diagnosticCenter);
		return new ResponseEntity<>(diagnosticCenter,HttpStatus.OK);
		
	}
	@DeleteMapping("/remove/{dcenterid}")
	public ResponseEntity<DiagnosticCenter>removeDiagnosticCenterByid(@PathVariable("dcenterid") String dcenterid) throws Exception{
		LOGGER.info("called delete method()");
		DiagnosticCenter idr=idiagnosticcenterservice.removeDiagnosticCenter(Integer.parseInt(dcenterid));
		if(idr==null) {
			LOGGER.error("remove method not found with this dcenterid");
			throw new  DiagnosticCenterNotFoundException("remove diagnosticCenter is not found"+dcenterid);
		}
		return new ResponseEntity<>(idr,HttpStatus.OK);
	}
	@GetMapping("/getByid/{dcenterid}")
public ResponseEntity<DiagnosticCenter> getDiagnosticCenterByid(@PathVariable("dcenterid") int dcenterid) throws DiagnosticCenterNotFoundException{
		LOGGER.info("called getbyId method()");
		DiagnosticCenter diagnosticCenter=null;
		diagnosticCenter= idiagnosticcenterservice.getDiagnosticCenterById(dcenterid);
		if(diagnosticCenter==null) {
			LOGGER.error("No center found with this id" + dcenterid);
			throw new DiagnosticCenterNotFoundException("No center found with this id:"+dcenterid);
			
		}
		return new ResponseEntity<>(diagnosticCenter,HttpStatus.OK);
		
	}
	
	
}