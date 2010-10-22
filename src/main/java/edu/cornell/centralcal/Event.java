package edu.cornell.centralcal;

import java.util.Date;

/** Stores the details describing a event. Normally constructed from a database.
 * @author Spencer Jackson
 * */
public class Event {
	private String name;
	private String place;
	private Date startDate;
	private Date endDate;


	/**
	 * @param name
	 * @param place
	 * @param startDate
	 * @param endDate
	 */
	public Event(String name, String place, Date startDate, Date endDate) {
		this.name = name;
		this.place = place;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
