/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE789_Uncontrolled_Mem_Alloc__PropertiesFile_HashMap_53d.java
Label Definition File: CWE789_Uncontrolled_Mem_Alloc.int.label.xml
Template File: sources-sink-53d.tmpl.java
*/
/*
 * @description
 * CWE: 789 Uncontrolled Memory Allocation
 * BadSource: PropertiesFile Read data from a .properties file (in property named data)
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: HashMap
 *    BadSink : Create a HashMap using data as the initial size
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */

package juliet.testcases.CWE789_Uncontrolled_Mem_Alloc.s02;
import juliet.support.*;

import javax.servlet.http.*;

import java.util.HashMap;

public class CWE789_Uncontrolled_Mem_Alloc__PropertiesFile_HashMap_53d
{
    public void badSink(int data ) throws Throwable
    {

        /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
        HashMap intHashMap = new HashMap(data);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {

        /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
        HashMap intHashMap = new HashMap(data);

    }
}