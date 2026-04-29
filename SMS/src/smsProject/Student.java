package smsProject;

public class Student 
{
	private String id;
	private String name;
	private String dob;
	private String nrc;
	private String phone;
	private String address;
	private String gender;
	
	public Student() 
	{
		
	}
	
	


	public Student(String id, String name, String dob, String nrc, String phone, String address) 
	{
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.nrc = nrc;
		this.phone = phone;
		this.address = address;
//		this.gender = gender;
	}




	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getNrc() 
	{
		return nrc;
	}

	public void setNrc(String nrc) 
	{
		this.nrc = nrc;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getDob() 
	{
		return dob;
	}

	public void setDob(String dob) 
	{
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
