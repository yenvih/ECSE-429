package com.group17.pitest;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import java.util.logging.Logger;

 
public class TestClassC {
private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
 
    @Test
    public void test_1(){
        LOGGER.info("Test Class C - product, Test Vector: (2,3)");
        Arithmetics sut = new Arithmetics();
        /*
         These cannot used the test shown below, because these vectors may have
         the same equalities when another arithmetic is injected instead of a "*".
         */
        //assertThat(sut.product(2,2), comparesEqualTo(4));
        //assertThat(sut.product(0,0), comparesEqualTo(0));
        //assertThat(sut.product(5,1), comparesEqualTo(5));
        assertThat(sut.product(2,3), comparesEqualTo(6));
    }
     
}


