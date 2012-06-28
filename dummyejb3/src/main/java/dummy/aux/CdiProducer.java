package dummy.aux;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

/**
 * Author: jmartisk
 * Date: 6/28/12
 * Time: 2:54 PM
 */
public class CdiProducer {

    @Produces
    @Dependent
    public Logger getLogger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
}