/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE400_Resource_Exhaustion__URLConnection_for_loop_81_bad.java
Label Definition File: CWE400_Resource_Exhaustion.label.xml
Template File: sources-sinks-81_bad.tmpl.java
*/
/*
 * @description
 * CWE: 400 Resource Exhaustion
 * BadSource: URLConnection Read count from a web server with URLConnection
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: for_loop
 *    GoodSink: Validate count before using it as the loop variant in a for loop
 *    BadSink : Use count as the loop variant in a for loop
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE400_Resource_Exhaustion.s03;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE400_Resource_Exhaustion__URLConnection_for_loop_81_bad extends CWE400_Resource_Exhaustion__URLConnection_for_loop_81_base
{
    public void action(int count ) throws Throwable
    {

        int i = 0;

        /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
        for (i = 0; i < count; i++)
        {
            IO.writeLine("Hello");
        }

    }
}
