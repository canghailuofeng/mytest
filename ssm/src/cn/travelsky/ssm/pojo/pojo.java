package cn.travelsky.ssm.pojo;

public class pojo {
	private Integer id;
	private String username;
	private String password;
	@Override
	public String toString() {
		return "pojo [id=" + id + ", username=" + username + ", password=" + password + "]";
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
	
}
