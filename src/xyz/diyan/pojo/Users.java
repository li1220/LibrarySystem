package xyz.diyan.pojo;

public class Users
{
	private Integer id;
	private String uname;
	private String code;
	private String password;
	
	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getUname()
	{
		return uname;
	}

	public void setUname(String uname)
	{
		this.uname = uname;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	@Override
	public String toString()
	{
		return "Users [id=" + id + ", uname=" + uname + ", code=" + code + ", password=" + password + "]";
	}
}
