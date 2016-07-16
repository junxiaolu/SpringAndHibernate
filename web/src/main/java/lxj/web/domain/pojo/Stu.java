package lxj.web.domain.pojo;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lxj.web.utils.TimestampAdapter;
@SuppressWarnings("restriction")
@XmlRootElement(name = "stu")
public class Stu implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5296726793114144564L;

	private Long sno;

	private String sname;
	
	private String sex;
	
	private java.sql.Timestamp birthday;
	
	private String email;
	
	private BigDecimal score;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public java.sql.Timestamp getBirthday() {
		return birthday;
	}
	@XmlJavaTypeAdapter(TimestampAdapter.class) 
	public void setBirthday(java.sql.Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}
	
}
