// Copyright 2011, Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.utils.logging;

/**
 * Interface capable of pretty printing XML messages and extracting key fields from
 * XML messages.
 */
public interface PrettyPrinterInterface {

  /**
   * Transforms the XML into a pretty-printed format with sensitive strings removed.
   * If there is an error initializing formatting the XML message, the formatting
   * step will be skipped and the unformatted XML with sensitive strings removed
   * will be returned. 
   *
   * @param xml the XML message to be pretty printed
   * @return the given message in pretty-printed format
   */
  public String prettyPrint(String xml);
}