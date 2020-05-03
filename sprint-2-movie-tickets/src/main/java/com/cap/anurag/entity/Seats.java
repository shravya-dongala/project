package com.cap.anurag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seats {
	@Id
	@Column(length = 1)
	private int sno;
	@Column(length = 10)
	private String seat_type;
	@Column(length = 3)
	private int available_seats;
	@Column(length = 4)
	private int price;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSeat_type() {
		return seat_type;
	}
	public void setSeat_type(String seat_type) {
		this.seat_type = seat_type;
	}
	public int getAvailable_seats() {
		return available_seats;
	}
	public void setAvailable_seats(int available_seats) {
		this.available_seats = available_seats;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}