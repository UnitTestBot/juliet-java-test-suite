/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_PropertiesFile_modulo_81_base.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: PropertiesFile Read data from a .properties file (in property named data)
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: modulo
 *    GoodSink: Check for zero before modulo
 *    BadSink : Modulo by a value that may be zero
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE369_Divide_by_Zero.s03;
import juliet.support.*;

import javax.servlet.http.*;

public abstract class CWE369_Divide_by_Zero__int_PropertiesFile_modulo_81_base
{
    public abstract void action(int data ) throws Throwable;
}