/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__int_PropertiesFile_add_53c.java
Label Definition File: CWE190_Integer_Overflow__int.label.xml
Template File: sources-sinks-53c.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: PropertiesFile Read data from a .properties file (in property named data)
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: add
 *    GoodSink: Ensure there will not be an overflow before adding 1 to data
 *    BadSink : Add 1 to data, which can cause an overflow
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */

package juliet.testcases.CWE190_Integer_Overflow.s03;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE190_Integer_Overflow__int_PropertiesFile_add_53c
{
    public void badSink(int data ) throws Throwable
    {
        (new CWE190_Integer_Overflow__int_PropertiesFile_add_53d()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {
        (new CWE190_Integer_Overflow__int_PropertiesFile_add_53d()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data ) throws Throwable
    {
        (new CWE190_Integer_Overflow__int_PropertiesFile_add_53d()).goodB2GSink(data );
    }
}
