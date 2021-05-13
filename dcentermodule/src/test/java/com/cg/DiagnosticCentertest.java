package com.cg;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.entities.DiagnosticCenter;
import com.cg.service.IDiagnosticCenterService;

@SpringBootTest
public class DiagnosticCentertest {

	
	
	@Autowired
	IDiagnosticCenterService idiagnosticcenterservice;
	
	@MockBean
	IDiagnosticCenterService idrepo;
	
	@Test
	void contextLoads() {
		
	}
	public void getAllTest() {
		DiagnosticCenter dc= new DiagnosticCenter();
		dc=(DiagnosticCenter) idrepo.getAllDiagnosticCenters();
		verify(idrepo, times(1)).getAllDiagnosticCenters();
		
	}
	
	

	
	}

