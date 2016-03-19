package com.wolaidai.db.model;

import java.util.Date;

public class Lender implements java.io.Serializable {

	private static final long serialVersionUID = -4426720350858599688L;
	private Integer id;
	private String mobile;
	private String encrypted_password;
	private String reset_password_token;
	private Date reset_password_sent_at;
	private Integer sign_in_count;
	private Date current_sign_in_at;
	private Date last_sign_in_at;
	private String current_sign_in_ip;
	private String last_sign_in_ip;
	private Integer failed_attempts;
	private String unlock_token;
	private Date locked_at;
	private String email;
	private Date created_at;
	private Date updated_at;
	private String lender_type;
	private String authentication_token;
	private Integer customer_level_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEncrypted_password() {
		return encrypted_password;
	}

	public void setEncrypted_password(String encrypted_password) {
		this.encrypted_password = encrypted_password;
	}

	public String getReset_password_token() {
		return reset_password_token;
	}

	public void setReset_password_token(String reset_password_token) {
		this.reset_password_token = reset_password_token;
	}

	public Date getReset_password_sent_at() {
		return reset_password_sent_at;
	}

	public void setReset_password_sent_at(Date reset_password_sent_at) {
		this.reset_password_sent_at = reset_password_sent_at;
	}

	public Integer getSign_in_count() {
		return sign_in_count;
	}

	public void setSign_in_count(Integer sign_in_count) {
		this.sign_in_count = sign_in_count;
	}

	public Date getCurrent_sign_in_at() {
		return current_sign_in_at;
	}

	public void setCurrent_sign_in_at(Date current_sign_in_at) {
		this.current_sign_in_at = current_sign_in_at;
	}

	public Date getLast_sign_in_at() {
		return last_sign_in_at;
	}

	public void setLast_sign_in_at(Date last_sign_in_at) {
		this.last_sign_in_at = last_sign_in_at;
	}

	public String getCurrent_sign_in_ip() {
		return current_sign_in_ip;
	}

	public void setCurrent_sign_in_ip(String current_sign_in_ip) {
		this.current_sign_in_ip = current_sign_in_ip;
	}

	public String getLast_sign_in_ip() {
		return last_sign_in_ip;
	}

	public void setLast_sign_in_ip(String last_sign_in_ip) {
		this.last_sign_in_ip = last_sign_in_ip;
	}

	public Integer getFailed_attempts() {
		return failed_attempts;
	}

	public void setFailed_attempts(Integer failed_attempts) {
		this.failed_attempts = failed_attempts;
	}

	public String getUnlock_token() {
		return unlock_token;
	}

	public void setUnlock_token(String unlock_token) {
		this.unlock_token = unlock_token;
	}

	public Date getLocked_at() {
		return locked_at;
	}

	public void setLocked_at(Date locked_at) {
		this.locked_at = locked_at;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getLender_type() {
		return lender_type;
	}

	public void setLender_type(String lender_type) {
		this.lender_type = lender_type;
	}

	public String getAuthentication_token() {
		return authentication_token;
	}

	public void setAuthentication_token(String authentication_token) {
		this.authentication_token = authentication_token;
	}

	public Integer getCustomer_level_id() {
		return customer_level_id;
	}

	public void setCustomer_level_id(Integer customer_level_id) {
		this.customer_level_id = customer_level_id;
	}

	@Override
	public String toString() {
		return "Lender [id=" + id + ", mobile=" + mobile + ", encrypted_password=" + encrypted_password
				+ ", reset_password_token=" + reset_password_token + ", reset_password_sent_at="
				+ reset_password_sent_at + ", sign_in_count=" + sign_in_count + ", current_sign_in_at="
				+ current_sign_in_at + ", last_sign_in_at=" + last_sign_in_at + ", current_sign_in_ip="
				+ current_sign_in_ip + ", last_sign_in_ip=" + last_sign_in_ip + ", failed_attempts=" + failed_attempts
				+ ", unlock_token=" + unlock_token + ", locked_at=" + locked_at + ", email=" + email + ", created_at="
				+ created_at + ", updated_at=" + updated_at + ", lender_type=" + lender_type + ", authentication_token="
				+ authentication_token + ", customer_level_id=" + customer_level_id + "]";
	}

}
