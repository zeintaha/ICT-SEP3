package sep.via.dk.sep3JPA.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer id;

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "expiryDate")
	private String expiryDate;

	@Column(name = "password", length = 2000, nullable = false)
	private String password;

	@Column(name = "email", length = 2000)
	private String email;

	public Customer() {

	}

	public Customer(Integer id, String username, String password, String email, String expiryDate) {

		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.expiryDate = expiryDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", expiryDate=" + expiryDate + ", password=" + password
				+ ", email=" + email + "]";
	}

}