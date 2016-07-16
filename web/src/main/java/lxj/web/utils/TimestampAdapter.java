package lxj.web.utils;

import java.sql.Timestamp;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

@SuppressWarnings("restriction")
public class TimestampAdapter extends XmlAdapter<Date, Timestamp>{

	@Override
	public Timestamp unmarshal(Date v) throws Exception {
		 return new Timestamp (v.getTime());  
	}

	@Override
	public Date marshal(Timestamp v) throws Exception {
		// TODO Auto-generated method stub
		 return new Date(v.getTime());  
	}

}
