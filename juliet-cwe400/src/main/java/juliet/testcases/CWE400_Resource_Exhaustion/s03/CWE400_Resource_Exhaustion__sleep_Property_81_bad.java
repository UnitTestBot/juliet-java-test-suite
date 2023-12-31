/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE400_Resource_Exhaustion__sleep_Property_81_bad.java
Label Definition File: CWE400_Resource_Exhaustion__sleep.label.xml
Template File: sources-sinks-81_bad.tmpl.java
*/
/*
 * @description
 * CWE: 400 Resource Exhaustion
 * BadSource: Property Read count from a system property
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks:
 *    GoodSink: Validate count before using it as a parameter in sleep function
 *    BadSink : Use count as the parameter for sleep withhout checking it's size first
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE400_Resource_Exhaustion.s03;
import juliet.support.*;

public class CWE400_Resource_Exhaustion__sleep_Property_81_bad extends CWE400_Resource_Exhaustion__sleep_Property_81_base
{
    public void action(int count ) throws Throwable
    {

        /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
        Thread.sleep(count);

    }
}
