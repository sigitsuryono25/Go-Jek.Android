package com.newrelic.agent.android.instrumentation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.METHOD})
public @interface Trace
{
  public static final String NULL = "";
  
  MetricCategory category() default MetricCategory.NONE;
  
  String metricName() default "";
  
  boolean skipTransactionTrace() default false;
}


/* Location:              /Users/michael/Downloads/dex2jar-2.0/GO_JEK.jar!/com/newrelic/agent/android/instrumentation/Trace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */