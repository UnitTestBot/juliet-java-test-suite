/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__short_max_add_81a.java
Label Definition File: CWE190_Integer_Overflow.label.xml
Template File: sources-sinks-81a.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: max Set data to the max value for short
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: add
 *    GoodSink: Ensure there will not be an overflow before adding 1 to data
 *    BadSink : Add 1 to data, which can cause an overflow
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE190_Integer_Overflow.s04;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__short_max_add_81a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        short data;

        /* POTENTIAL FLAW: Use the maximum size of the data type */
        data = Short.MAX_VALUE;

        CWE190_Integer_Overflow__short_max_add_81_base baseObject = new CWE190_Integer_Overflow__short_max_add_81_bad();
        baseObject.action(data );
    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use GoodSource and BadSink */
    private void goodG2B() throws Throwable
    {
        short data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        CWE190_Integer_Overflow__short_max_add_81_base baseObject = new CWE190_Integer_Overflow__short_max_add_81_goodG2B();
        baseObject.action(data );
    }

    /* goodB2G() - use BadSource and GoodSink */
    private void goodB2G() throws Throwable
    {
        short data;

        /* POTENTIAL FLAW: Use the maximum size of the data type */
        data = Short.MAX_VALUE;

        CWE190_Integer_Overflow__short_max_add_81_base baseObject = new CWE190_Integer_Overflow__short_max_add_81_goodB2G();
        baseObject.action(data );
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