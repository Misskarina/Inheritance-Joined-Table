package com.karina.InheritanceJoinedTbl;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="Online")
@PrimaryKeyJoinColumn(name = "Payment_id")
public class Online extends Payment
{

	int mobno;
	String personname;
	
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	
	
}
