/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__int_random_sub_81_base.java
Label Definition File: CWE191_Integer_Underflow__int.label.xml
Template File: sources-sinks-81_base.tmpl.java
*/
/*
 * @description
 * CWE: 191 Integer Underflow
 * BadSource: random Set data to a random value
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: sub
 *    GoodSink: Ensure there will not be an underflow before subtracting 1 from data
 *    BadSink : Subtract 1 from data, which can cause an Underflow
 * Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
 *
 * */

package juliet.testcases.CWE191_Integer_Underflow.s02;
import juliet.support.*;

import javax.servlet.http.*;

public abstract class CWE191_Integer_Underflow__int_random_sub_81_base
{
    public abstract void action(int data ) throws Throwable;
}
