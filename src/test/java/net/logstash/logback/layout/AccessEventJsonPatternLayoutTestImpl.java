/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.logstash.logback.layout;

import ch.qos.logback.access.spi.IAccessEvent;
import net.logstash.logback.layout.parser.AbstractJsonPatternParser;

/**
 * @author <a href="mailto:dimas@dataart.com">Dmitry Andrianov</a>
 */
public class AccessEventJsonPatternLayoutTestImpl extends AbstractJsonPatternLayoutTest<IAccessEvent> {
    @Override
    protected AccessEventJsonPatternLayout createLayout() {
        return new AccessEventJsonPatternLayout() {
            @Override
            protected AbstractJsonPatternParser<IAccessEvent> createParser() {
                // The base class needs to hook into the parser for some assertions
                return decorateParser(super.createParser());
            }
        };
    }
}
