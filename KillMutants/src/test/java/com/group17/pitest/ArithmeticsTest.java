package com.group17.pitest;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import java.util.logging.Logger;




public class ArithmeticsTest {

private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  @Test
  public void testSum() {
    Arithmetics sut = new Arithmetics();
    LOGGER.info("Test Sum, with vector (2,4)");
    /*
      These cannot used the test shown below, because these vectors may have
      the same equalities when another arithmetic is injected instead of a "+".
    */
    //assertThat(sut.sum(0,0), comparesEqualTo(0));
    //assertThat(sut.sum(2,2), comparesEqualTo(4));
    assertThat(sut.sum(2,4), comparesEqualTo(6));
  }

  @Test
  public void testDifference() {
    Arithmetics sut = new Arithmetics();
    LOGGER.info("Test Difference, with vector (6,2)");
    /*
      These cannot used the test shown below, because these vectors may have
      the same equalities when another arithmetic is injected instead of a "-".
     */
     //assertThat(sut.difference(0,0), comparesEqualTo(0));
     //assertThat(sut.difference(4,2), comparesEqualTo(2));
     assertThat(sut.difference(6,2), comparesEqualTo(4));
  }

  @Test
  public void testProduct() {
    LOGGER.info("Test Product with vector (2,3)");
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

  @Test
  public void testQuot() {
    LOGGER.info("Test Quot - Division with vector (10,5)");
    Arithmetics sut = new Arithmetics();
    /*
      These cannot used the test shown below, because these vectors may have
      the same equalities when another arithmetic is injected instead of a "/".
    */
        //assertThat(sut.quot(4,2), comparesEqualTo(2));
        //assertThat(sut.quot(5,1), comparesEqualTo(5));
        assertThat(sut.quot(10,5), comparesEqualTo(2));  }

  
}

