package com.durgasoft.beans;

public class Employee 
{
	private int empid;
	private String empname;
	private String empdesg;
	private Account acc;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesg() {
		return empdesg;
	}
	public void setEmpdesg(String empdesg) {
		this.empdesg = empdesg;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void print()
	{
		System.out.println(empid+" "+empname+" "+empdesg);
		System.out.println(acc.getAccno()+" "+acc.getAccname()+" "+acc.getBalance());
	}
}
