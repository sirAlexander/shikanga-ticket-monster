package org.jboss.jdf.example.ticketmonster.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: EventCategory
 *
 */
@Entity

public class EventCategory implements Serializable {
	
	private static final long serialVersionUID = 1L;

	   
	/**
     * The synthetic id of the object.
     */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
     * <p>
     * The description of the of event category.
     * </p>
     *
     * <p>
     * The description forms the natural id of the event category, and so must be unique.
     * </p>
     *
     * <p>
     * The description must not be null and must be one or more characters, the Bean Validation constraint <code>@NotEmpty</code>
     * enforces this.
     * </p>
     *
     */
	@Column(unique = true)
	@NotEmpty
	private String description;
	

	public EventCategory() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
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
		EventCategory other = (EventCategory) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "EventCategory [description=" + description + "]";
	}
	
	
	
	
	
   
}
