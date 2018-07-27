array list is a class under collection framework the size of array list is not fixed

string stringbuffer
both are final class
string is immutable string buffer is not
string have 2 type to define string buffer has one
.equals to method in string return value matching where the .equals() in string or object class return ref because the string use scp and stringbuffer use heap
== use in string for ref comparison and in string buffer 
change string to string buffer use
string s=sb.tostring()
and change string to stringbuffer just use stringbuffer s=new stringbuffer(passthe string name)
if we print ref varible of object class it will return hashcode (hash code is unique identification of object) and the string class ref varible return content it override the object class method
the .tostring method of object class and string class perform on upper line

class jdbc
{
	Class.forName(oracle.jdbc.OracleDriver);
	Connection con=DriveraMnager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("Select * from Database name");
	con.close();
}


string buffer string builder

sysncronizerd      || not sycronized
version 1.0        || version 1.5
thread safe        || not thread safe
only one thread use|| many threads use same string builder 
at one time        ||
performnce is low  || high performance


exception is an unexpected event which terminates the program abnormally and the rest of code will not execute aftere the exception occur
exception handling is a way to handle the exception and terminate the program normally and further coe is executed

try
catch
finally      terminologies in exception handling
throw
throws

two way to handle exception
1)try catch        2)throws
there are three types of exception
1) checked--compile time
                         handled by programer
2) unchecked--runtime

3) error--not in coder hands


throwble is the super class of error and exception
exception is parent of the run time(uncheked) and compile time(checked) exception


Unchecked Exception List

ArrayIndexOutOfBoundsException
ClassCastException
IllegalArgumentException
IllegalStateException
NullPointerException
NumberFormatException
AssertionError
ExceptionInInitializerError
StackOverflowError
NoClassDefFoundError

Checked Exception List
Exception
IOException
FileNotFoundException
ParseException
ClassNotFoundException
CloneNotSupportedException
InstantiationException
InterruptedException
NoSuchMethodException
NoSuchFieldException

