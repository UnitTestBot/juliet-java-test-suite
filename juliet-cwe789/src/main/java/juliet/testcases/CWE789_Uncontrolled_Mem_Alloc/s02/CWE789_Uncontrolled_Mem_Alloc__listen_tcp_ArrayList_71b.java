/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE789_Uncontrolled_Mem_Alloc__listen_tcp_ArrayList_71b.java
Label Definition File: CWE789_Uncontrolled_Mem_Alloc.int.label.xml
Template File: sources-sink-71b.tmpl.java
*/
/*
 * @description
 * CWE: 789 Uncontrolled Memory Allocation
 * BadSource: listen_tcp Read data using a listening tcp connection
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: ArrayList
 *    BadSink : Create an ArrayList using data as the initial size
 * Flow Variant: 71 Data flow: data passed as an Object reference argument from one method to another in different classes in the same package
 *
 * */

package juliet.testcases.CWE789_Uncontrolled_Mem_Alloc.s02;
import juliet.support.*;

import javax.servlet.http.*;

import java.util.ArrayList;

public class CWE789_Uncontrolled_Mem_Alloc__listen_tcp_ArrayList_71b
{
    public void badSink(Object dataObject ) throws Throwable
    {
        int data = (Integer)dataObject;

        /* POTENTIAL FLAW: Create an ArrayList using data as the initial size.  data may be very large, creating memory issues */
        ArrayList intArrayList = new ArrayList(data);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(Object dataObject ) throws Throwable
    {
        int data = (Integer)dataObject;

        /* POTENTIAL FLAW: Create an ArrayList using data as the initial size.  data may be very large, creating memory issues */
        ArrayList intArrayList = new ArrayList(data);

    }
}