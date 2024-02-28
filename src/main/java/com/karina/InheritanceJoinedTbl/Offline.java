package com.karina.InheritanceJoinedTbl;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="Offline")
@PrimaryKeyJoinColumn(name = "Payment_id")
public class Offline extends Payment{
	int checkno;
	String checkhname;
	
	public int getCheckno() {
		return checkno;
	}
	public void setCheckno(int checkno) {
		this.checkno = checkno;
	}
	public String getCheckhname() {
		return checkhname;
	}
	public void setCheckhname(String checkhname) {
		this.checkhname = checkhname;
	}
	
	

}
