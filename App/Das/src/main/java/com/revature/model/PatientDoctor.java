package com.revature.model;

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
@Table(name = "patient_doctor", schema = "das")
public class PatientDoctor {

	@Column(name = "pd_id")
	@Id
	@GeneratedValue(generator = "patient_doctor_pd_id_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "patient_doctor_pd_id_seq", sequenceName = "patient_doctor_pd_id_seq")
	private int pdId;
	
	@JoinColumn(name = "patient")
	@OneToOne
	private Users patient;
	
	@JoinColumn(name = "doctor")
	@ManyToOne
	private Users doctor;

	public PatientDoctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientDoctor(int pdId, Users patient, Users doctor) {
		super();
		this.pdId = pdId;
		this.patient = patient;
		this.doctor = doctor;
	}

	public int getPdId() {
		return pdId;
	}

	public void setPdId(int pdId) {
		this.pdId = pdId;
	}

	public Users getPatient() {
		return patient;
	}

	public void setPatient(Users patient) {
		this.patient = patient;
	}

	public Users getDoctor() {
		return doctor;
	}

	public void setDoctor(Users doctor) {
		this.doctor = doctor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + pdId;
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
		PatientDoctor other = (PatientDoctor) obj;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (pdId != other.pdId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PatientDoctor [pdId=" + pdId + ", patient=" + patient + ", doctor=" + doctor + "]";
	}
	
}
