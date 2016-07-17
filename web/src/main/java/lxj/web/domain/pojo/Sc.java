package lxj.web.domain.pojo;

import java.io.Serializable;

public class Sc implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.math.BigDecimal cno;

	public java.math.BigDecimal getCno() {
		return cno;
	}

	public void setCno(java.math.BigDecimal cno) {
		this.cno = cno;
	} 
	private java.math.BigDecimal score;
	
	private Stu stu;

	public java.math.BigDecimal getScore() {
		return score;
	}

	public void setScore(java.math.BigDecimal score) {
		this.score = score;
	}

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	} 
}
