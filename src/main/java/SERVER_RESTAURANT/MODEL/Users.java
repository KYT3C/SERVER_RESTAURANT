package SERVER_RESTAURANT.MODEL;
// Generated 21-may-2019 12:53:03 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "RESTAURANT")
public class Users implements java.io.Serializable {

	private String dni;
	private String firstName;
	private String surnames;
	private String phoneNumber;
	private String accessKey;
	private int kind;

	public Users() {
	}

	public Users(String dni, String firstName, String surnames, String accessKey, int kind) {
		this.dni = dni;
		this.firstName = firstName;
		this.surnames = surnames;
		this.accessKey = accessKey;
		this.kind = kind;
	}

	public Users(String dni, String firstName, String surnames, String phoneNumber, String accessKey, int kind) {
		this.dni = dni;
		this.firstName = firstName;
		this.surnames = surnames;
		this.phoneNumber = phoneNumber;
		this.accessKey = accessKey;
		this.kind = kind;
	}

	@Id

	@Column(name = "dni", unique = true, nullable = false, length = 9)
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "surnames", nullable = false)
	public String getSurnames() {
		return this.surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	@Column(name = "phone_number", length = 9)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "access_key", nullable = false)
	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	@Column(name = "kind", nullable = false)
	public int getKind() {
		return this.kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

}
