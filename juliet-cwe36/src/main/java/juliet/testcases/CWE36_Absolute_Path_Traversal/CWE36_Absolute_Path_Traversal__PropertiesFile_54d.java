/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE36_Absolute_Path_Traversal__PropertiesFile_54d.java
Label Definition File: CWE36_Absolute_Path_Traversal.label.xml
Template File: sources-sink-54d.tmpl.java
*/
/*
 * @description
 * CWE: 36 Absolute Path Traversal
 * BadSource: PropertiesFile Read data from a .properties file (in property named data)
 * GoodSource: A hardcoded string
 * Sinks: readFile
 *    BadSink : read line from file from disk
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package juliet.testcases.CWE36_Absolute_Path_Traversal;

import juliet.support.*;

import java.io.*;
import javax.servlet.http.*;

public class CWE36_Absolute_Path_Traversal__PropertiesFile_54d
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE36_Absolute_Path_Traversal__PropertiesFile_54e()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE36_Absolute_Path_Traversal__PropertiesFile_54e()).goodG2BSink(data );
    }
}
