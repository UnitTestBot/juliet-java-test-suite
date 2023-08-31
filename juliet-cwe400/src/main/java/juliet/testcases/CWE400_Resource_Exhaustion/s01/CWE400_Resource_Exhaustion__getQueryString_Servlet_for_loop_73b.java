/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_73b.java
Label Definition File: CWE400_Resource_Exhaustion.label.xml
Template File: sources-sinks-73b.tmpl.java
*/
/*
 * @description
 * CWE: 400 Resource Exhaustion
 * BadSource: getQueryString_Servlet Parse id param out of the URL query string (without using getParameter())
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: for_loop
 *    GoodSink: Validate count before using it as the loop variant in a for loop
 *    BadSink : Use count as the loop variant in a for loop
 * Flow Variant: 73 Data flow: data passed in a LinkedList from one method to another in different source files in the same package
 *
 * */

package juliet.testcases.CWE400_Resource_Exhaustion.s01;
import juliet.support.*;
import java.util.LinkedList;

import javax.servlet.http.*;

public class CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_73b
{
    public void badSink(LinkedList<Integer> countLinkedList , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int count = countLinkedList.remove(2);

        int i = 0;

        /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
        for (i = 0; i < count; i++)
        {
            IO.writeLine("Hello");
        }

    }

    /* goodG2B() - use GoodSource and BadSink */
    public void goodG2BSink(LinkedList<Integer> countLinkedList , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int count = countLinkedList.remove(2);

        int i = 0;

        /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
        for (i = 0; i < count; i++)
        {
            IO.writeLine("Hello");
        }

    }

    /* goodB2G() - use BadSource and GoodSink */
    public void goodB2GSink(LinkedList<Integer> countLinkedList , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int count = countLinkedList.remove(2);

        int i = 0;

        /* FIX: Validate count before using it as the for loop variant */
        if (count > 0 && count <= 20)
        {
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
        }

    }
}