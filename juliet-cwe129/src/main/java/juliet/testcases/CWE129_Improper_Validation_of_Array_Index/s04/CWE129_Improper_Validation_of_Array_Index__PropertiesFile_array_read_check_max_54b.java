/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE129_Improper_Validation_of_Array_Index__PropertiesFile_array_read_check_max_54b.java
Label Definition File: CWE129_Improper_Validation_of_Array_Index.label.xml
Template File: sources-sinks-54b.tmpl.java
*/
/*
 * @description
 * CWE: 129 Improper Validation of Array Index
 * BadSource: PropertiesFile Read data from a .properties file (in property named data)
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: array_read_check_max
 *    GoodSink: Read from array after verifying index is at least 0 and less than array.length
 *    BadSink : Read from array after verifying that data less than array.length (but not verifying that data is at least 0)
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package juliet.testcases.CWE129_Improper_Validation_of_Array_Index.s04;
import juliet.support.*;

import javax.servlet.http.*;

public class CWE129_Improper_Validation_of_Array_Index__PropertiesFile_array_read_check_max_54b
{
    public void badSink(int data ) throws Throwable
    {
        (new CWE129_Improper_Validation_of_Array_Index__PropertiesFile_array_read_check_max_54c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {
        (new CWE129_Improper_Validation_of_Array_Index__PropertiesFile_array_read_check_max_54c()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data ) throws Throwable
    {
        (new CWE129_Improper_Validation_of_Array_Index__PropertiesFile_array_read_check_max_54c()).goodB2GSink(data );
    }
}
