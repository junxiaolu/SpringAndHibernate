package lxj.web.repository;

import java.sql.Timestamp;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lxj.web.domain.pojo.Stu;

@Repository("fHbnRep")
public class  FHbnRep extends AbstractRep {
	
	public Stu getstu(Long id) {
		Stu stu = this.getHibernateTemplate().get(lxj.web.domain.pojo.Stu.class, id);
		return stu;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void subaddStu() {	
		Stu stu = new Stu();
		//stu.setSno(99l);
		stu.setBirthday(new Timestamp(System.currentTimeMillis()));
		stu.setSname("草");
		stu.setSex("男");
		this.getHibernateTemplate().save(stu);
		getHibernateTemplate().get
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public Long addStu() {		
		Stu stu = new Stu();
		//stu.setSno(99l);
		stu.setBirthday(new Timestamp(System.currentTimeMillis()));
		stu.setSname("草");
		stu.setSex("男");	
		return (Long)this.getHibernateTemplate().save(stu);
	}
}
