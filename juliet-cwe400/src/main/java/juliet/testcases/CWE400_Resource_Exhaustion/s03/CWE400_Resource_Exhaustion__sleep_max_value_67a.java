/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE400_Resource_Exhaustion__sleep_max_value_67a.java
Label Definition File: CWE400_Resource_Exhaustion__sleep.label.xml
Template File: sources-sinks-67a.tmpl.java
*/
/*
 * @description
 * CWE: 400 Resource Exhaustion
 * BadSource: max_value Set count to a hardcoded value of Integer.MAX_VALUE
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks:
 *    GoodSink: Validate count before using it as a parameter in sleep function
 *    BadSink : Use count as the parameter for sleep withhout checking it's size first
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */

package juliet.testcases.CWE400_Resource_Exhaustion.s03;
import juliet.support.*;

public class CWE400_Resource_Exhaustion__sleep_max_value_67a extends AbstractTestCase
{
    static class Container
    {
        public int containerOne;
    }

    public void bad() throws Throwable
    {
        int count;

        /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
        count = Integer.MAX_VALUE;

        Container countContainer = new Container();
        countContainer.containerOne = count;
        (new CWE400_Resource_Exhaustion__sleep_max_value_67b()).badSink(countContainer  );
    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        int count;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        count = 2;

        Container countContainer = new Container();
        countContainer.containerOne = count;
        (new CWE400_Resource_Exhaustion__sleep_max_value_67b()).goodG2BSink(countContainer  );
    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        int count;

        /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
        count = Integer.MAX_VALUE;

        Container countContainer = new Container();
        countContainer.containerOne = count;
        (new CWE400_Resource_Exhaustion__sleep_max_value_67b()).goodB2GSink(countContainer  );
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the juliet.testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }

}