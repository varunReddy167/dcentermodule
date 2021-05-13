package com.cg.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointments")
public class Appointment implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appid")
	private int appid;
	@Column(name="appointmentdate")
	private LocalDate appointmentdate;
	@OneToOne(cascade= {CascadeType.REMOVE})
	@JoinColumn(name="dcenterid")
	private DiagnosticCenter diagnosticCenter;
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public LocalDate getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(LocalDate appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}
	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}
	@Override
	public String toString() {
		return "Appointment [appid=" + appid + ", appointmentdate=" + appointmentdate + ", diagnosticCenter="
				+ diagnosticCenter + "]";
	}
	
	
	
}
	
	
	
	
	