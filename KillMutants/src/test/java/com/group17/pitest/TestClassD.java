package com.group17.pitest;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import java.util.logging.Logger;

 
public class TestClassD {
private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
 
    @Test
    public void test_1(){
        LOGGER.info("Test Class D - Division, Test Vector: (10,5)");
        Arithmetics sut = new Arithmetics();
        /*
         These cannot used the test shown below, because these vectors may have
         the same equalities when another arithmetic is injected instead of a "/".
         */
        //assertThat(sut.quot(4,2), comparesEqualTo(2));
        //assertThat(sut.quot(5,1), comparesEqualTo(5));
        assertThat(sut.quot(10,5), comparesEqualTo(2));
    }
     
}


