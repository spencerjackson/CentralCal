package edu.cornell.centralcal;

/** Represents a known user. Data is stored in the database. Note the schema
 * MUST BE UPDATED IF MORE FIELDS ARE ADDED!
 * @author Spencer Jackson
 *
 */
public class User {
	private String name;
	private byte[] password;

	/**
	 * @param name
	 * @param password
	 */
	public User(String name, byte[] password) {
		this.name = name;
		this.password = password;
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
	 * @return the password
	 */
	public byte[] getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(byte[] password) {
		this.password = password;
	}

	
}
