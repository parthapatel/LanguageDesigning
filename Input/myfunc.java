import java.lang.Exception;
import java.util.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;



class myfun
{
    public assign4Parser.FunctiondeclareContext ctx;
    public double returnvalue;
    public static HashMap<Integer, mypara> allparameter = new HashMap<Integer, mypara>();
    public myfun()
    {
        returnvalue = 0;
    }
}
