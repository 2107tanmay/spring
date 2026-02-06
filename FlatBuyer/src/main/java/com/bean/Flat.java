package com.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "flat")
public class Flat {

	@Id
	@Column(name = "flat_id")
	private String flatId;
	@Column(name = "door_number")
	private int doorNumber;
	@Column(name = "flat_type")
	private String flatType;
	@Column(name = "flat_area")
	private double flatArea;
	@Column(name = "number_of_rooms")
	private int numberOfRooms;
	@Column(name = "flat_price")
	private double flatPrice;

	// buyer id is the foreign key here
	@ManyToOne
	@JoinColumn(name = "buyerid")
	private Buyer buyer;

	public String getFlatId() {
		return flatId;
	}

	public void setFlatId(String flatId) {
		this.flatId = flatId;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getFlatType() {
		return flatType;
	}

	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}

	public double getFlatArea() {
		return flatArea;
	}

	public void setFlatArea(double flatArea) {
		this.flatArea = flatArea;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public double getFlatPrice() {
		return flatPrice;
	}

	public void setFlatPrice(double flatPrice) {
		this.flatPrice = flatPrice;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

}