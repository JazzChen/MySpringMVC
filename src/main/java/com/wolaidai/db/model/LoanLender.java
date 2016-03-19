package com.wolaidai.db.model;

import java.io.Serializable;
import java.util.Date;

public class LoanLender implements Serializable {

	private static final long serialVersionUID = 7625043399901370471L;
	private Integer id;
	private Integer loan_id;
	private Integer lender_id;
	private Date created_at;
	private Date updated_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(Integer loan_id) {
		this.loan_id = loan_id;
	}

	public Integer getLender_id() {
		return lender_id;
	}

	public void setLender_id(Integer lender_id) {
		this.lender_id = lender_id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "LoanLender [id=" + id + ", loan_id=" + loan_id + ", lender_id=" + lender_id + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}

}
