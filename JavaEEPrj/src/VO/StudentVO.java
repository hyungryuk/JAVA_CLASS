package VO;

public class StudentVO {
	private String s_name;
	private int s_id;
	private String[] s_major;
	public StudentVO(String s_name, int s_id, String[] s_major) {
		this.s_name = s_name;
		this.s_id = s_id;
		this.s_major = s_major;
	}
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentVO [s_name=" + s_name + ", s_id=" + s_id + ", s_major=" + s_major[0] + "]";
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String[] getS_major() {
		return s_major;
	}
	public void setS_major(String[] s_major) {
		this.s_major = s_major;
	}
	
	
	
	
}
