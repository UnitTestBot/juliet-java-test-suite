/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_getQueryString_Servlet_modulo_72b.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-72b.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: getQueryString_Servlet Parse id param out of the URL query string (without using getParameter())
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: modulo
 *    GoodSink: Check for zero before modulo
 *    BadSink : Modulo by a value that may be zero
 * Flow Variant: 72 Data flow: data passed in a Vector from one method to another in different source files in the same package
 *
 * */

package juliet.testcases.CWE369_Divide_by_Zero.s03;
import juliet.support.*;
import java.util.Vector;

import javax.servlet.http.*;

public class CWE369_Divide_by_Zero__int_getQueryString_Servlet_modulo_72b
{
    public void badSink(Vector<Integer> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataVector.remove(2);

        /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
        result in an exception.  */
        IO.writeLine("100%" + data + " = " + (100 % data) + "\n");

    }

    /* goodG2B() - use GoodSource and BadSink */
    public void goodG2BSink(Vector<Integer> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataVector.remove(2);

        /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
        result in an exception.  */
        IO.writeLine("100%" + data + " = " + (100 % data) + "\n");

    }

    /* goodB2G() - use BadSource and GoodSink */
    public void goodB2GSink(Vector<Integer> dataVector , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data = dataVector.remove(2);

        /* FIX: test for a zero modulus */
        if (data != 0)
        {
            IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
        }
        else
        {
            IO.writeLine("This would result in a modulo by zero");
        }

    }
}
