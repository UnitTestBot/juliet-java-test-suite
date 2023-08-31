/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE134_Uncontrolled_Format_String__Environment_printf_54a.java
Label Definition File: CWE134_Uncontrolled_Format_String.label.xml
Template File: sources-sinks-54a.tmpl.java
*/
/*
 * @description
 * CWE: 134 Uncontrolled Format String
 * BadSource: Environment Read data from an environment variable
 * GoodSource: A hardcoded string
 * Sinks: printf
 *    GoodSink: dynamic printf format with string defined
 *    BadSink : dynamic printf without validation
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package juliet.testcases.CWE134_Uncontrolled_Format_String.s01;
import juliet.support.*;

public class CWE134_Uncontrolled_Format_String__Environment_printf_54a extends AbstractTestCase
{
    public void bad() throws Throwable
    {
        String data;

        /* get environment variable ADD */
        /* POTENTIAL FLAW: Read data from an environment variable */
        data = System.getenv("ADD");

        (new CWE134_Uncontrolled_Format_String__Environment_printf_54b()).badSink(data );
    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        String data;

        /* FIX: Use a hardcoded string */
        data = "foo";

        (new CWE134_Uncontrolled_Format_String__Environment_printf_54b()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        String data;

        /* get environment variable ADD */
        /* POTENTIAL FLAW: Read data from an environment variable */
        data = System.getenv("ADD");

        (new CWE134_Uncontrolled_Format_String__Environment_printf_54b()).goodB2GSink(data );
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
