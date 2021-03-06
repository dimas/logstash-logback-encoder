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
package net.logstash.logback.fieldnames;

/**
 * Names of standard fields that appear in the JSON output.
 */
public class LogstashFieldNames extends LogstashCommonFieldNames {
    
    public static final String FIELD_LOGGER_NAME = "logger_name";
    public static final String FIELD_THREAD_NAME = "thread_name";
    public static final String FIELD_LEVEL = "level";
    public static final String FIELD_LEVEL_VALUE = "level_value";
    public static final String FIELD_CALLER_CLASS_NAME = "caller_class_name";
    public static final String FIELD_CALLER_METHOD_NAME = "caller_method_name";
    public static final String FIELD_CALLER_FILE_NAME = "caller_file_name";
    public static final String FIELD_CALLER_LINE_NUMBER = "caller_line_number";
    public static final String FIELD_STACK_TRACE = "stack_trace";
    public static final String FIELD_TAGS = "tags";


    private String logger = FIELD_LOGGER_NAME;
    private String thread = FIELD_THREAD_NAME;
    private String level = FIELD_LEVEL;
    private String levelValue = FIELD_LEVEL_VALUE;
    private String caller;
    private String callerClass = FIELD_CALLER_CLASS_NAME;
    private String callerMethod = FIELD_CALLER_METHOD_NAME;
    private String callerFile = FIELD_CALLER_FILE_NAME;
    private String callerLine = FIELD_CALLER_LINE_NUMBER;
    private String stackTrace = FIELD_STACK_TRACE;
    private String tags = FIELD_TAGS;
    private String mdc;
    private String context;
    
    public String getLogger() {
        return logger;
    }
    
    public void setLogger(String logger) {
        this.logger = logger;
    }
    
    public String getThread() {
        return thread;
    }
    
    public void setThread(String thread) {
        this.thread = thread;
    }
    
    public String getLevel() {
        return level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }
    
    public String getLevelValue() {
        return levelValue;
    }
    
    public void setLevelValue(String levelValue) {
        this.levelValue = levelValue;
    }
    
    /**
     * The name of the caller object field.
     * <p>
     * If this returns null, then the caller data fields will be written inline at the root level of the JSON event output (e.g. as a sibling to all the other fields in this class).
     * <p>
     * If this returns non-null, then the caller data fields will be written inside an object with field name returned by this method
     */
    public String getCaller() {
        return caller;
    }
    
    public void setCaller(String caller) {
        this.caller = caller;
    }
    
    public String getCallerClass() {
        return callerClass;
    }
    
    public void setCallerClass(String callerClass) {
        this.callerClass = callerClass;
    }
    
    public String getCallerMethod() {
        return callerMethod;
    }
    
    public void setCallerMethod(String callerMethod) {
        this.callerMethod = callerMethod;
    }
    
    public String getCallerFile() {
        return callerFile;
    }
    
    public void setCallerFile(String callerFile) {
        this.callerFile = callerFile;
    }
    
    public String getCallerLine() {
        return callerLine;
    }
    
    public void setCallerLine(String callerLine) {
        this.callerLine = callerLine;
    }
    
    public String getStackTrace() {
        return stackTrace;
    }
    
    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }
    
    public String getTags() {
        return tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }
    
    /**
     * The name of the mdc object field.
     * <p>
     * If this returns null, then the mdc fields will be written inline at the root level of the JSON event output (e.g. as a sibling to all the other fields in this class).
     * <p>
     * If this returns non-null, then the mdc fields will be written inside an object with field name returned by this method
     */
    public String getMdc() {
        return mdc;
    }
    
    public void setMdc(String mdc) {
        this.mdc = mdc;
    }
    
    /**
     * The name of the context object field.
     * <p>
     * If this returns null, then the context fields will be written inline at the root level of the JSON event output (e.g. as a sibling to all the other fields in this class).
     * <p>
     * If this returns non-null, then the context fields will be written inside an object with field name returned by this method
     */
    public String getContext() {
        return context;
    }
    
    public void setContext(String context) {
        this.context = context;
    }
}
