/*
 * Created on Sep 17, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.error;

import static junit.framework.Assert.assertEquals;

import org.fest.assertions.description.Description;
import org.fest.assertions.internal.TestDescription;
import org.junit.*;

/**
 * Tests for <code>{@link ErrorWhenObjectsAreSame#newAssertionError(Description)}</code>.
 *
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class ErrorWhenObjectsAreSame_newAssertionError_Test {

  private Description description;
  private ErrorWhenObjectsAreSame factory;

  @Before public void setUp() {
    description = new TestDescription("Jedi");
    factory = new ErrorWhenObjectsAreSame("Yoda");
  }

  @Test public void should_create_AssertionError() {
    AssertionError error = factory.newAssertionError(description);
    assertEquals("[Jedi] expected not same:<'Yoda'>", error.getMessage());
  }
}