package TEST;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public  class tst1 {

    private static final Logger logger = LogManager.getLogger(
        tst1.class);
    
    public static void main(String[] args) {
        
        logger.info("Information message");
        logger.warn("Warning message");
        logger.error("Error message");
    }
}
