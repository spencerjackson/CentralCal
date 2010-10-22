package edu.cornell.centralcal;

import java.util.Date;

/** Stores an excuse. Loaded from database.
 * 
 * @author Spencer Jackson
 *
 */
public class Excuse {
	private String excuseText;
	private User submittedBy;
	private Date dateSubmitted;
	private int votes;
	/**
	 * @param excuseText
	 * @param submittedBy
	 * @param dateSubmitted
	 * @param votes
	 */
	public Excuse(String excuseText, User submittedBy, Date dateSubmitted,
			int votes) {
		this.excuseText = excuseText;
		this.submittedBy = submittedBy;
		this.dateSubmitted = dateSubmitted;
		this.votes = votes;
	}
	/**
	 * @return the excuseText
	 */
	public String getExcuseText() {
		return excuseText;
	}
	/**
	 * @param excuseText the excuseText to set
	 */
	public void setExcuseText(String excuseText) {
		this.excuseText = excuseText;
	}
	/**
	 * @return the submittedBy
	 */
	public User getSubmittedBy() {
		return submittedBy;
	}
	/**
	 * @param submittedBy the submittedBy to set
	 */
	public void setSubmittedBy(User submittedBy) {
		this.submittedBy = submittedBy;
	}
	/**
	 * @return the dateSubmitted
	 */
	public Date getDateSubmitted() {
		return dateSubmitted;
	}
	/**
	 * @param dateSubmitted the dateSubmitted to set
	 */
	public void setDateSubmitted(Date dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
	/**
	 * @return the votes
	 */
	public int getVotes() {
		return votes;
	}
	/**
	 * @param votes the votes to set
	 */
	public void setVotes(int votes) {
		this.votes = votes;
	}


}
