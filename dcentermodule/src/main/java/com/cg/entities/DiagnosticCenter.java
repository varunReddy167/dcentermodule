package com.cg.entities;

 import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="dcenter")

@Table(name="d_center")
public class DiagnosticCenter implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="dcenterid")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int dcenterid;
	@Column(name="name")
	private String name;
	@Column(name="contactno")
	private String contactno;
	@Column(name="address")
	private String address;
	@Column(name="contactemail")
	private String contactemail;
	@Column(name="servicesoffered",nullable=true)
	private String servicesoffered;
	
	public int getDcenterid() {
		return dcenterid;
	}
	public void setDcenterid(int dcenterid) {
		this.dcenterid = dcenterid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactemail() {
		return contactemail;
	}
	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}
	public String getServicesoffered() {
		return servicesoffered;
	}
	public void setServicesoffered(String servicesoffered) {
		this.servicesoffered = servicesoffered;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "DiagnosticCenter [dcenterid=" + dcenterid + ", name=" + name + ", contactno=" + contactno + ", address="
				+ address + ", contactemail=" + contactemail + ", servicesoffered=" + servicesoffered + "]";
	}
	
}
	