package calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long res(Long number11, Long number21) {
        logger.info( "Subtracting {} - {}", number11, number21 );
        return number11 - number21;
    }
    public Long mul(Long number1, Long number2) {
        logger.info( "Multiplying {} * {}", number1, number2 );
        return number1 * number2;
    }
    public Long div(Long number1, Long number2) {
        logger.info( "Dividing {} / {}", number1, number2 );
        return number1 / number2;
    }
}
