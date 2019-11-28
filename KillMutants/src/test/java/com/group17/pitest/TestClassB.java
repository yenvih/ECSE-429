package com.group17.pitest;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import java.util.logging.Logger;

 
public class TestClassB {
private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
 
    @Test
    public void test_B1(){
        LOGGER.info("Test Class B - difference, Test Vector: (6,2)");
        Arithmetics sut = new Arithmetics();
        /*
         These cannot used the test shown below, because these vectors may have
         the same equalities when another arithmetic is injected instead of a "-".
         */
        //assertThat(sut.difference(0,0), comparesEqualTo(0));
        //assertThat(sut.difference(4,2), comparesEqualTo(2));
        assertThat(sut.difference(6,2), comparesEqualTo(4));
    }
     
}


