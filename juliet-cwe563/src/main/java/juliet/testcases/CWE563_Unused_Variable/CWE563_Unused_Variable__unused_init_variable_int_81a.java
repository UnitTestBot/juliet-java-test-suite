/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE563_Unused_Variable__unused_init_variable_int_81a.java
Label Definition File: CWE563_Unused_Variable__unused_init_variable.label.xml
Template File: source-sinks-81a.tmpl.java
*/
/*
 * @description
 * CWE: 563 Unused Variable
 * BadSource:  Initialize data
 * Sinks:
 *    GoodSink: Use data
 *    BadSink : do nothing
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE563_Unused_Variable;

import juliet.support.*;

public class CWE563_Unused_Variable__unused_init_variable_int_81a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        int data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = 5;

        CWE563_Unused_Variable__unused_init_variable_int_81_base baseObject = new CWE563_Unused_Variable__unused_init_variable_int_81_bad();
        baseObject.action(data );
    }

    public void good() throws Throwable
    {
        goodB2G();
    }

    /* goodB2G() - use BadSource and GoodSink */
    private void goodB2G() throws Throwable
    {
        int data;

        /* POTENTIAL FLAW: Initialize, but do not use data */

        data = 5;

        CWE563_Unused_Variable__unused_init_variable_int_81_base baseObject = new CWE563_Unused_Variable__unused_init_variable_int_81_goodB2G();
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
