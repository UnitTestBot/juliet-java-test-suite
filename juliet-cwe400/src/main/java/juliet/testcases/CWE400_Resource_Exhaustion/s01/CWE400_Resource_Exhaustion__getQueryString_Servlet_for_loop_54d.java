/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_54d.java
Label Definition File: CWE400_Resource_Exhaustion.label.xml
Template File: sources-sinks-54d.tmpl.java
*/
/*
 * @description
 * CWE: 400 Resource Exhaustion
 * BadSource: getQueryString_Servlet Parse id param out of the URL query string (without using getParameter())
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: for_loop
 *    GoodSink: Validate count before using it as the loop variant in a for loop
 *    BadSink : Use count as the loop variant in a for loop
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package juliet.testcases.CWE400_Resource_Exhaustion.s01;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_54d
{
    public void badSink(int count , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_54e()).badSink(count , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int count , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_54e()).goodG2BSink(count , request, response);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int count , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE400_Resource_Exhaustion__getQueryString_Servlet_for_loop_54e()).goodB2GSink(count , request, response);
    }
}
