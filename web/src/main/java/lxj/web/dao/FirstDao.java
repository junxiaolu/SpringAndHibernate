package lxj.web.dao;

import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("firstDaoNo")
public class FirstDao {
	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}
	@Autowired
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	public int getTra(int [] arr) {
		Arrays.fill(arr, 0);
		return 1/0;
	}
}
