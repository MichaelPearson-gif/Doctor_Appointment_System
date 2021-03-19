package com.revature.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "appointment", schema = "das")
public class Appointment {

	@Column(name = "appointment_id")
	@Id
	@GeneratedValue(generator = "appointment_appointment_id_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "appointment_appointment_id_seq", sequenceName = "appointment_appointment_id_seq")
	private int appointmentId;
	
	@Column(name = "schedule")
	private Timestamp schedule;
	
	@JoinColumn(name = "patient")
	@ManyToOne
	private Users patient;
	
	@JoinColumn(name = "doctor")
	@ManyToOne
	private Users doctor;
	
	@Column(name = "status")
	private String status;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int appointmentId, Timestamp schedule, Users patient, Users doctor, String status) {
		super();
		this.appointmentId = appointmentId;
		this.schedule = schedule;
		this.patient = patient;
		this.doctor = doctor;
		this.status = status;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Timestamp getSchedule() {
		return schedule;
	}

	public void setSchedule(Timestamp schedule) {
		this.schedule = schedule;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + appointmentId;
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Appointment other = (Appointment) obj;
		if (appointmentId != other.appointmentId)
			return false;
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
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", schedule=" + schedule + ", patient=" + patient
				+ ", doctor=" + doctor + ", status=" + status + "]";
	}
	
}
