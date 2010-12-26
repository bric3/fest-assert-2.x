/*
 * Created on Dec 26, 2010
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

/**
 * Creates an error message indicating that an assertion that verifies that a {@code String} does not contain another
 * {@code String} failed.
 *
 * @author Alex Ruiz
 */
public class ContainsString extends BasicErrorMessage {

  /**
   * Creates a new <code>{@link ContainsString}</code>.
   * @param actual the actual value in the failed assertion.
   * @param sequence the sequence of values expected not to be in {@code actual}.
   * @return the created {@code ErrorMessage}.
   */
  public static ErrorMessage contains(Object actual, Object sequence) {
    return new ContainsString(actual, sequence);
  }

  private ContainsString(Object actual, Object sequence) {
    super("%sexpecting:<%s> not to contain:<%s>", actual, sequence);
  }
}
