import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public  class tst {

    private static final Logger logger = LogManager.getLogger(
        tst.class);
    
    public static void main(String[] args) {
        
        logger.info("Information message");
        logger.warn("Warning message");
        logger.error("Error message");
    }
}