/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_zero_modulo_68a.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-68a.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: zero Set data to a hardcoded value of zero
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: modulo
 *    GoodSink: Check for zero before modulo
 *    BadSink : Modulo by a value that may be zero
 * Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
 *
 * */

package juliet.testcases.CWE369_Divide_by_Zero.s04;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE369_Divide_by_Zero__int_zero_modulo_68a extends AbstractTestCase
{
    public static int data;

    public void bad() throws Throwable
    {

        data = 0; /* POTENTIAL FLAW: data is set to zero */

        (new CWE369_Divide_by_Zero__int_zero_modulo_68b()).badSink();
    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        (new CWE369_Divide_by_Zero__int_zero_modulo_68b()).goodG2BSink();
    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {

        data = 0; /* POTENTIAL FLAW: data is set to zero */

        (new CWE369_Divide_by_Zero__int_zero_modulo_68b()).goodB2GSink();
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