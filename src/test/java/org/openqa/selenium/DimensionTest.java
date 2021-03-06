// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.


package org.openqa.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test WebDriver's Dimensions class.
 */
@RunWith(JUnit4.class)
public class DimensionTest {
  @Test
  public void testSimpleAssignment() {
    Dimension d1 = new Dimension(100, 200);
    assertEquals(200, d1.getHeight());
    assertEquals(100, d1.getWidth());
  }

  @Test
  public void testEquality() {
    Dimension d1 = new Dimension(100, 200);
    Dimension d2 = new Dimension(200, 200);

    assertNotSame(d1, d2);
    // Doesn't have to be different, but known to be different for this case.
    assertNotSame(d1.hashCode(), d2.hashCode());

    Dimension d1copy = new Dimension(100, 200);

    assertEquals(d1, d1copy);
    assertEquals(d1.hashCode(), d1copy.hashCode());
  }


}