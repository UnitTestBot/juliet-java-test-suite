/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE400_Resource_Exhaustion__sleep_connect_tcp_81_base.java
Label Definition File: CWE400_Resource_Exhaustion__sleep.label.xml
Template File: sources-sinks-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 400 Resource Exhaustion
 * BadSource: connect_tcp Read count using an outbound tcp connection
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks:
 *    GoodSink: Validate count before using it as a parameter in sleep function
 *    BadSink : Use count as the parameter for sleep withhout checking it's size first
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE400_Resource_Exhaustion.s02;
import juliet.support.*;

public abstract class CWE400_Resource_Exhaustion__sleep_connect_tcp_81_base
{
    public abstract void action(int count ) throws Throwable;
}
