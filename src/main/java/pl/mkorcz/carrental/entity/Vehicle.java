package pl.mkorcz.carrental.entity;

import javax.persistence.*;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String brand;
	private String model;
	@Column(name="carbodystyle")
	private String carBodyStyle;
	@Column(name="yearofmanufacture")
	private String yearOfManufacture;
	private String color;
	@Column(name="regnumber")
	private String regNumber;
	@Column(name="vehiclemileage")
	private String vehicleMileage;
	private String status;
	@Column(name="priceperday")
	private Double pricePerDay;

	public Vehicle() {
	}

	public Vehicle(Integer id, String brand, String model, String carBodyStyle, String yearOfManufacture, String color,
			String regNumber, String vehicleMileage, String status, Double pricePerDay) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.carBodyStyle = carBodyStyle;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.regNumber = regNumber;
		this.vehicleMileage = vehicleMileage;
		this.status = status;
		this.pricePerDay = pricePerDay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarBodyStyle() {
		return carBodyStyle;
	}

	public void setCarBodyStyle(String carBodyStyle) {
		this.carBodyStyle = carBodyStyle;
	}

	public String getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getVehicleMileage() {
		return vehicleMileage;
	}

	public void setVehicleMileage(String vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

}