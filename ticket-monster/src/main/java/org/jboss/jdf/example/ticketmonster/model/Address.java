package org.jboss.jdf.example.ticketmonster.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * <p>
 * A reusable representation of an address.
 * </p>
 *
 * <p>
 * Addresses are used in many places in an application, so to observe the DRY principle, we model Address as an embeddable
 * entity. An embeddable entity appears as a child in the object model, but no relationship is established in the RDBMS..
 * </p>
 */
@Embeddable
public class Address implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* Declaration of fields */
    private String street;
    private String city;
    private String country;
    
    
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [street=").append(street).append(", city=")
				.append(city).append(", country=").append(country).append("]");
		return builder.toString();
	}
	
	
	
	
	
    
    
    

}
