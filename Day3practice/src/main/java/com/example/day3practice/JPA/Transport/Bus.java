package com.example.day3practice.JPA.Transport;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Passenger")
public class Bus {
	@Id
	@Column(name="cid")
	private int cid;
	private String cname;
	private int cmodel;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCmodel() {
		return cmodel;
	}
	public void setCmodel(int cmodel) {
		this.cmodel = cmodel;
	}

}
