/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE252_Unchecked_Return_Value__FileInputStream_04.java
Label Definition File: CWE252_Unchecked_Return_Value__FileInputStream.label.xml
Template File: point-flaw-04.tmpl.java
*/
/*
* @description
* CWE: 252 Unchecked Return Value
* Sinks:
*    GoodSink: Check the return value from FileInputStream.read() and handle possible errors
*    BadSink : Do not check the return value of FileInputStream.read()
* Flow Variant: 04 Control flow: if(PRIVATE_STATIC_FINAL_TRUE) and if(PRIVATE_STATIC_FINAL_FALSE)
*
* */

package juliet.testcases.CWE252_Unchecked_Return_Value;

import juliet.support.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.logging.Level;

public class CWE252_Unchecked_Return_Value__FileInputStream_04 extends AbstractTestCase
{
    /* The two variables below are declared "final", so a tool should
     * be able to identify that reads of these will always return their
     * initialized values.
     */
    private static final boolean PRIVATE_STATIC_FINAL_TRUE = true;
    private static final boolean PRIVATE_STATIC_FINAL_FALSE = false;

    public void bad() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            FileInputStream streamFileInput = null;
            try
            {
                int bytesToRead = 1024;
                byte[] byteArray = new byte[bytesToRead];
                streamFileInput = new FileInputStream("c:\\file.txt");
                streamFileInput.read(byteArray);
                /* FLAW: Do not check the return value of read() */
                IO.writeLine(new String(byteArray, "UTF-8"));
            }
            catch(FileNotFoundException exceptFileNotFound)
            {
                IO.logger.log(Level.WARNING, "FileNotFoundException opening file", exceptFileNotFound);
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException reading file", exceptIO);
            }
            finally
            {
                try
                {
                    if(streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "IOException closing FileInputStream", exceptIO);
                }
            }
        }
    }

    /* good1() changes PRIVATE_STATIC_FINAL_TRUE to PRIVATE_STATIC_FINAL_FALSE */
    private void good1() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_FALSE)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            FileInputStream streamFileInput = null;

            try
            {
                int bytesToRead = 1024;
                byte[] byteArray = new byte[bytesToRead];

                streamFileInput = new FileInputStream("c:\\file.txt");

                int numberOfBytesRead = streamFileInput.read(byteArray);

                /* FIX: Check the return value of read() and handle possible errors */
                if (numberOfBytesRead == -1)
                {
                    IO.writeLine("The end of the file has been reached.");
                }
                else
                {
                    if (numberOfBytesRead < bytesToRead)
                    {
                        IO.writeLine("Could not read " + bytesToRead + " bytes.");
                    }
                    else
                    {
                        IO.writeLine(new String(byteArray, "UTF-8"));
                    }
                }
            }
            catch (FileNotFoundException exceptFileNotFound)
            {
                IO.logger.log(Level.WARNING, "FileNotFoundException opening file", exceptFileNotFound);
            }
            catch(IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException reading file", exceptIO);
            }
            finally
            {
                try
                {
                    if(streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch(IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "IOException closing FileInputStream", exceptIO);
                }
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if (PRIVATE_STATIC_FINAL_TRUE)
        {
            FileInputStream streamFileInput = null;
            try
            {
                int bytesToRead = 1024;
                byte[] byteArray = new byte[bytesToRead];
                streamFileInput = new FileInputStream("c:\\file.txt");
                int numberOfBytesRead = streamFileInput.read(byteArray);
                /* FIX: Check the return value of read() and handle possible errors */
                if (numberOfBytesRead == -1)
                {
                    IO.writeLine("The end of the file has been reached.");
                }
                else
                {
                    if (numberOfBytesRead < bytesToRead)
                    {
                        IO.writeLine("Could not read " + bytesToRead + " bytes.");
                    }
                    else
                    {
                        IO.writeLine(new String(byteArray, "UTF-8"));
                    }
                }
            }
            catch (FileNotFoundException exceptFileNotFound)
            {
                IO.logger.log(Level.WARNING, "FileNotFoundException opening file", exceptFileNotFound);
            }
            catch(IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "IOException reading file", exceptIO);
            }
            finally
            {
                try
                {
                    if(streamFileInput != null)
                    {
                        streamFileInput.close();
                    }
                }
                catch(IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "IOException closing FileInputStream", exceptIO);
                }
            }
        }
    }

    public void good() throws Throwable
    {
        good1();
        good2();
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the juliet.testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}