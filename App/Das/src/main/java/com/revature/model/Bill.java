package com.revature.model;

import java.sql.Date;

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
@Table(name = "bill", schema = "das")
public class Bill {

	@Column(name = "invoice_id")
	@Id
	@GeneratedValue(generator = "bill_invoice_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "bill_invoice_id_seq", sequenceName = "bill_invoice_id_seq")
	private int invoiceId;
	
	@JoinColumn(name = "user_id")
	@ManyToOne
	private Users user;
	
	@Column(name = "total", columnDefinition = "NUMERIC")
	private double total;
	
	@Column(name = "today")
	private Date today;
	
	@Column(name = "due_date")
	private Date dueDate;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(int invoiceId, Users user, double total, Date today, Date dueDate) {
		super();
		this.invoiceId = invoiceId;
		this.user = user;
		this.total = total;
		this.today = today;
		this.dueDate = dueDate;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + invoiceId;
		result = prime * result + ((today == null) ? 0 : today.hashCode());
		long temp;
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Bill other = (Bill) obj;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (invoiceId != other.invoiceId)
			return false;
		if (today == null) {
			if (other.today != null)
				return false;
		} else if (!today.equals(other.today))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bill [invoiceId=" + invoiceId + ", user=" + user + ", total=" + total + ", today=" + today
				+ ", dueDate=" + dueDate + "]";
	}
	
}
