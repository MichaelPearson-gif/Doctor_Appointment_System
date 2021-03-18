package com.revature.model;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "das")
public class Users {

	@Column(name = "user_id")
	@Id
	@GeneratedValue(generator = "users_user_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "users_user_id_seq", sequenceName = "users_user_id_seq")
	private int userId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "profilepic")
	private Byte[] profilePic;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "phone", columnDefinition = "INT")
	private long phone;
	
	@JoinColumn(name = "address")
	@OneToOne
	private Address address;
	
	@JoinColumn(name = "user_role")
	@ManyToOne
	private Roles roles;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "user_password")
	private String userPassword;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, String email, Byte[] profilePic, String firstName, String lastName, String gender,
			long phone, Address address, Roles roles, Date dob, String userPassword) {
		super();
		this.userId = userId;
		this.email = email;
		this.profilePic = profilePic;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.roles = roles;
		this.dob = dob;
		this.userPassword = userPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Byte[] getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(Byte[] profilePic) {
		this.profilePic = profilePic;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (int) (phone ^ (phone >>> 32));
		result = prime * result + Arrays.hashCode(profilePic);
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phone != other.phone)
			return false;
		if (!Arrays.equals(profilePic, other.profilePic))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (userId != other.userId)
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", email=" + email + ", profilePic=" + Arrays.toString(profilePic)
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", phone=" + phone
				+ ", address=" + address + ", roles=" + roles + ", dob=" + dob + ", userPassword=" + userPassword + "]";
	}
	
}
