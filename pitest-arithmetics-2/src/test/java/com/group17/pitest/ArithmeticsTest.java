package com.group17.pitest;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;




public class ArithmeticsTest {


  @Test
  public void testSum() {
    Arithmetics sut = new Arithmetics();
    assertThat(sut.sum(0,0), comparesEqualTo(0)); 
    assertThat(sut.sum(2,2), comparesEqualTo(4)); 
  }

  @Test
  public void testDifference() {
    Arithmetics sut = new Arithmetics();
    assertThat(sut.difference(0,0), comparesEqualTo(0)); 
    assertThat(sut.difference(4,2), comparesEqualTo(2)); 
  }

  @Test
  public void testProduct() {
    Arithmetics sut = new Arithmetics();
    assertThat(sut.product(0,0), comparesEqualTo(0)); 
    assertThat(sut.product(5,1), comparesEqualTo(5)); 
    assertThat(sut.product(2,2), comparesEqualTo(4));  
  }

  @Test
  public void testQuot() {
    Arithmetics sut = new Arithmetics();
    assertThat(sut.quot(4,2), comparesEqualTo(2));
    assertThat(sut.quot(5,1), comparesEqualTo(5));
    assertThat(sut.quot(10,2), comparesEqualTo(5));
  }

  
}

