package org.kirk.adventofcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Assertions is auto-added when the Test file was created
import static org.junit.jupiter.api.Assertions.*;

class Day3_CrossedWiresTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
//
//    R75,D30,R83,U83,L12,D49,R71,U7,L72
//            U62,R66,U55,R34,D71,R55,D58,R83 = distance 159
//    R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51
//            U98,R91,D20,R16,D67,R40,U7,R15,U6,R7 = distance 135
    @Test
    void shouldHaveGetFourMethod() {
        Day3_CrossedWires kls = new Day3_CrossedWires();

        int result = kls.getFour();
        Assertions.assertEquals(4, result);
    }
}