/**
 * Licensed under the GPL License. You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */
package psiprobe.beans.accessors;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class Dbcp2DatasourceAccessorTest.
 */
public class Dbcp2DatasourceAccessorTest {

  /** The accessor. */
  Dbcp2DatasourceAccessor accessor;

  /** The source. */
  BasicDataSource source;

  /** The bad source. */
  ComboPooledDataSource badSource;

  /**
   * Before.
   */
  @Before
  public void before() {
    accessor = new Dbcp2DatasourceAccessor();
    source = new BasicDataSource();
    badSource = new ComboPooledDataSource();
  }

  /**
   * Can map test.
   */
  @Test
  public void canMapTest() {
    Assert.assertTrue(accessor.canMap(source));
  }

  /**
   * Cannot map test.
   */
  @Test
  public void cannotMapTest() {
    Assert.assertFalse(accessor.canMap(badSource));
  }

  /**
   * Gets the info test.
   *
   * @throws Exception the exception
   */
  @Test
  public void getInfoTest() throws Exception {
    accessor.getInfo(source);
  }

}
