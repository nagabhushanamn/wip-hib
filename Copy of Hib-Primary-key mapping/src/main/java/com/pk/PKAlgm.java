package com.pk;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class PKAlgm  implements IdentifierGenerator{

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
		// TODO Auto-generated method stub
		// algm....
		return 222;
	}

}
