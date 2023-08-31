/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__float_URLConnection_modulo_66b.java
Label Definition File: CWE369_Divide_by_Zero__float.label.xml
Template File: sources-sinks-66b.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: URLConnection Read data from a web server with URLConnection
 * GoodSource: A hardcoded non-zero number (two)
 * Sinks: modulo
 *    GoodSink: Check for zero before modulo
 *    BadSink : Modulo by a value that may be zero
 * Flow Variant: 66 Data flow: data passed in an array from one method to another in different source files in the same package
 *
 * */

package juliet.testcases.CWE369_Divide_by_Zero.s02;
import juliet.support.*;

public class CWE369_Divide_by_Zero__float_URLConnection_modulo_66b
{
    public void badSink(float dataArray[] ) throws Throwable
    {
        float data = dataArray[2];

        /* POTENTIAL FLAW: Possibly modulo by zero */
        int result = (int)(100.0 % data);
        IO.writeLine(result);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(float dataArray[] ) throws Throwable
    {
        float data = dataArray[2];

        /* POTENTIAL FLAW: Possibly modulo by zero */
        int result = (int)(100.0 % data);
        IO.writeLine(result);

    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(float dataArray[] ) throws Throwable
    {
        float data = dataArray[2];

        /* FIX: Check for value of or near zero before modulo */
        if (Math.abs(data) > 0.000001)
        {
            int result = (int)(100.0 % data);
            IO.writeLine(result);
        }
        else
        {
            IO.writeLine("This would result in a modulo by zero");
        }

    }
}