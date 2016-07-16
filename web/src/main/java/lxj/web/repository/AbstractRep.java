package lxj.web.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class AbstractRep {
	  
	   private HibernateTemplate hibernateTemplate;

	    protected HibernateTemplate getHibernateTemplate() {
			return hibernateTemplate;
		}
	    @Autowired
		protected void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		}
}
