
package vn.poly.sof302.doannvph04705.common.bases;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;




@Transactional
public abstract class BaseService implements BaseServiceInterface {
 
    protected final Logger logger = Logger.getLogger(this.getClass());

	


}
