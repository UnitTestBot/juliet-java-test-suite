/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE789_Uncontrolled_Mem_Alloc__database_HashSet_68b.java
Label Definition File: CWE789_Uncontrolled_Mem_Alloc.int.label.xml
Template File: sources-sink-68b.tmpl.java
*/
/*
 * @description
 * CWE: 789 Uncontrolled Memory Allocation
 * BadSource: database Read data from a database
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * BadSink: HashSet Create a HashSet using data as the initial size
 * Flow Variant: 68 Data flow: data passed as a member variable in the "a" class, which is used by a method in another class in the same package
 *
 * */

package juliet.testcases.CWE789_Uncontrolled_Mem_Alloc.s01;
import juliet.support.*;

import javax.servlet.http.*;

import java.util.HashSet;

public class CWE789_Uncontrolled_Mem_Alloc__database_HashSet_68b
{
    public void badSink() throws Throwable
    {
        int data = CWE789_Uncontrolled_Mem_Alloc__database_HashSet_68a.data;

        /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
        HashSet intHashSet = new HashSet(data);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink() throws Throwable
    {
        int data = CWE789_Uncontrolled_Mem_Alloc__database_HashSet_68a.data;

        /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
        HashSet intHashSet = new HashSet(data);

    }
}
