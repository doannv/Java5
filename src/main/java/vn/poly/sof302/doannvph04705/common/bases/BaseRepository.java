
package vn.poly.sof302.doannvph04705.common.bases;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



public class BaseRepository implements BaseRepositoryInterface {

    protected final Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    protected SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    protected Object insert(Object entity) {
        return this.getCurrentSession().save(entity);
    }
    
    protected Object update(Object entity) {
        return this.getCurrentSession().save(entity);
    }
    
   

}
