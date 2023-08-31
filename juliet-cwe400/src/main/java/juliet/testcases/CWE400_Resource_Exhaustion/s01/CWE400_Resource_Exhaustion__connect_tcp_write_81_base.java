/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE400_Resource_Exhaustion__connect_tcp_write_81_base.java
Label Definition File: CWE400_Resource_Exhaustion.label.xml
Template File: sources-sinks-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 400 Resource Exhaustion
 * BadSource: connect_tcp Read count using an outbound tcp connection
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: write
 *    GoodSink: Write to a file count number of times, but first validate count
 *    BadSink : Write to a file count number of times
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE400_Resource_Exhaustion.s01;
import juliet.support.*;

import javax.servlet.http.*;

public abstract class CWE400_Resource_Exhaustion__connect_tcp_write_81_base
{
    public abstract void action(int count ) throws Throwable;
}
