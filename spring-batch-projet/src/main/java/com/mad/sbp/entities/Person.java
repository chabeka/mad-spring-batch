package com.mad.sbp.entities;

public class Person{

	private Integer idPerson;
	private String sex;
	private String lastName;
	private String firstName;
	private String birthdate;
	private String city;
	private String country;
	private String nationality;
	private String profilPicture;
	public Integer getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getProfilPicture() {
		return profilPicture;
	}
	public void setProfilPicture(String profilPicture) {
		this.profilPicture = profilPicture;
	}
	@Override
	public String toString() {
		return "Person [idPerson=" + idPerson + ", sex=" + sex + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", birthdate=" + birthdate + ", city=" + city + ", country=" + country + ", nationality="
				+ nationality + ", profilPicture=" + profilPicture + "]";
	}

}
