package com.project.openlibrary.model;

<<<<<<< HEAD

=======
>>>>>>> 86663f7 (Admin dashboard is updated)
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
<<<<<<< HEAD
@Table(name = "users" )// uniqueConstraints = @UniqueConstraint(columnNames="email"))
=======
@Table(name = "users") // uniqueConstraints = @UniqueConstraint(columnNames="email"))
>>>>>>> 86663f7 (Admin dashboard is updated)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;
<<<<<<< HEAD
	
	@Column(name="name" )
	@NotBlank(message = "Name can not be blank!")
	private String name;
	
=======

	@Column(name = "name")
	@NotBlank(message = "Name can not be blank!")
	private String name;

>>>>>>> 86663f7 (Admin dashboard is updated)
	@Column(name = "email")
	@NotBlank(message = "Email can not be blank!")
	@Email(message = "Please enter a valid email.")
	private String email;
<<<<<<< HEAD
	
	@Column(name = "contact_no")
	@NotBlank(message = "Contact can not be blank!")
	private String contact_no;
	
	@Column(name = "password" )
	@NotBlank(message = "Password can not be blank!")
	private String password;
	
=======

	@Column(name = "contact_no")
	@NotBlank(message = "Contact can not be blank!")
	private String contactNo;

	@Column(name = "password")
	@NotBlank(message = "Password can not be blank!")
	private String password;

>>>>>>> 86663f7 (Admin dashboard is updated)
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

<<<<<<< HEAD
	public User(Integer id, String name, String email, String contact_no, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact_no = contact_no;
		this.password = password;
	}

	public User(String name, String email, String contact_no, String password) {
		super();
		this.name = name;
		this.email = email;
		this.contact_no = contact_no;
		this.password = password;
=======
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", password="
				+ password + "]";
>>>>>>> 86663f7 (Admin dashboard is updated)
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD
	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
=======
	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
>>>>>>> 86663f7 (Admin dashboard is updated)
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

<<<<<<< HEAD
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", contact_no=" + contact_no + ", password="
				+ password + "]";
	}

	
=======
	public User(Integer id, @NotBlank(message = "Name can not be blank!") String name,
			@NotBlank(message = "Email can not be blank!") @Email(message = "Please enter a valid email.") String email,
			@NotBlank(message = "Contact can not be blank!") String contactNo,
			@NotBlank(message = "Password can not be blank!") String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.password = password;
	}

>>>>>>> 86663f7 (Admin dashboard is updated)
}
