package com.hotelbooking.model;
// default package
// Generated Nov 19, 2022, 5:18:30 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user")
public class User implements java.io.Serializable {

	private Integer userId;
	private String userName;
	private String email;
	private String password;
	private String otpCode;
	private Boolean isAdmin;
	private Boolean isActivate;
	private Set<Booking> bookings = new HashSet<Booking>(0);
	private Set<Rating> ratings = new HashSet<Rating>(0);

	public User() {
	}

	public User(String userName, String email, String password, String otpCode, Boolean isAdmin, Boolean isActivate, Set<Booking> bookings,
			Set<Rating> ratings) {
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.otpCode = otpCode;
		this.isAdmin = isAdmin;
		this.isActivate = isActivate;
		this.bookings = bookings;
		this.ratings = ratings;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "User_ID", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "User_Name")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "Email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "OTP")
	public String getOtpCode() {
		return this.otpCode;
	}

	public void setOtpCode(String otpCode) {
		this.otpCode = otpCode;
	}

	@Column(name = "isAdmin")
	public Boolean getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	@Column(name = "isActivate")
	public Boolean getIsActivate() {
		return this.isActivate;
	}

	public void setIsActivate(Boolean isActivate) {
		this.isActivate = isActivate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(Set<Rating> ratings) {
		this.ratings = ratings;
	}

}