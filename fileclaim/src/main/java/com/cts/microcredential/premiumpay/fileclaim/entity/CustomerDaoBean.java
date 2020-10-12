package com.cts.microcredential.premiumpay.fileclaim.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer", schema = "mysqldb")
public class CustomerDaoBean {

	@Id
	@Column(name = "custid")
	private Long custId;
	
	@Column(name = "cust_ssn")
	private Long custSsn;
	
	@Column(name = "userid")
	private String userId;
	
	@Column(name = "password")
	private String pwd;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "create_time")
	private Timestamp createdTime;
	
	@Column(name = "custfirstname")
	private String custfirstname;
	
	@Column(name = "custlastname")
	private String custlastname;
	
	@Column(name = "custdob")
	private String custdob;
	
	@Column(name = "custphonenum")
	private String custphonenum;
	
	@Column(name = "custaddress")
	private String custaddress;

	@Column(name = "custzip")
	private String custzip;
	
	@Column(name = "custcountry")
	private String custcountry;
	
	@OneToMany(mappedBy="custIdbean", cascade = CascadeType.ALL)
	Set<PolicyDaoBean> policies;

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public Long getCustSsn() {
		return custSsn;
	}

	public void setCustSsn(Long custSsn) {
		this.custSsn = custSsn;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getCustfirstname() {
		return custfirstname;
	}

	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}

	public String getCustlastname() {
		return custlastname;
	}

	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}

	public String getCustdob() {
		return custdob;
	}

	public void setCustdob(String custdob) {
		this.custdob = custdob;
	}

	public String getCustphonenum() {
		return custphonenum;
	}

	public void setCustphonenum(String custphonenum) {
		this.custphonenum = custphonenum;
	}

	public String getCustaddress() {
		return custaddress;
	}

	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}

	public String getCustzip() {
		return custzip;
	}

	public void setCustzip(String custzip) {
		this.custzip = custzip;
	}

	public String getCustcountry() {
		return custcountry;
	}

	public void setCustcountry(String custcountry) {
		this.custcountry = custcountry;
	}

	public Set<PolicyDaoBean> getPolicies() {
		return policies;
	}

	public void setPolicies(Set<PolicyDaoBean> policies) {
		this.policies = policies;
	}

	@Override
	public String toString() {
		return "CustomerDaoBean [custId=" + custId + ", custSsn=" + custSsn + ", userId=" + userId + ", pwd=" + pwd
				+ ", email=" + email + ", createdTime=" + createdTime + ", custfirstname=" + custfirstname
				+ ", custlastname=" + custlastname + ", custdob=" + custdob + ", custphonenum=" + custphonenum
				+ ", custaddress=" + custaddress + ", custzip=" + custzip + ", custcountry=" + custcountry
				+ ", policies=" + policies + "]";
	}
	
}
