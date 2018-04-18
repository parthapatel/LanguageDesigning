import java.lang.Exception;
import java.util.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;


public class Assign4MyVisitor extends assign4BaseVisitor<Double> {
	

	String cfunction = "";
    int cvalue = 0;
	HashMap<String,Integer> intsym=new HashMap<String,Integer>();
	public static HashMap<String, myfun> functions = new HashMap<String, myfun>();
	HashMap<String,Double> realsym=new HashMap<String,Double>();
	int level = 0;
	public static final double SMALL_VALUE = 0.00000000002;

		@Override
	public Double visitAssign(assign4Parser.AssignContext ctx){
		  String id = ctx.IDENT().getText();
		  Double next = visit(ctx.simpleExpression());
		  int temp = level;
		  int flag = 0;
		  
		  for(int i=temp;i>0;i--)
		  {
			   if(intsym.containsKey(id + i))
				{
					 
					 intsym.put(id + i, next.intValue());
					 flag=1;
					 break;
				}
				else if(realsym.containsKey(id + i))
				{
					 
					 realsym.put(id + i, next);
					 flag=1;
					 break;
				}
			}
            if(flag == 0)
            {
                System.out.println("Error : Incompatible type Integer can not be converted to Real");
            }
			return 1.0;
	}
	
	@Override
	public Double visitInputVar(assign4Parser.InputVarContext ctx){
		String id = ctx.IDENT().getText();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of " + id + level);
		Double next = in.nextDouble();
		
		  int temp = level;
		  int flag = 0;
		  for(int i=temp;i>0;i--)
		  {
			   if(intsym.containsKey(id + i))
				{
					 
					 intsym.put(id + i, next.intValue());
					 flag=1;
					 break;
				}
				else if(realsym.containsKey(id + i))
				{
					 
					 realsym.put(id + i, next);
					 flag=1;
					 break;
				}
			}
            if(flag == 0)
            {
                System.out.println("Error : Incompatible type Integer can not be converted to Real");
            }
		return 1.00;
	
	}

	
	@Override public Double visitArgumentList2(assign4Parser.ArgumentList2Context ctx) {
        
        int flag=0;
        myfun tempfunc = functions.get(cfunction);
    
	    while(ctx.inputVariable(flag)!=null)
        {
			flag++;
		}
	
		for(int i=0;i<flag;i++)
        {
            Double value = this.visit(ctx.inputVariable(i));
				
            mypara mp = tempfunc.allparameter.get(i);
            mp.parametervalue = value;
            
            String id = mp.paraname;

				 if(intsym.containsKey(id + "1"))
					 {
								intsym.put(id + "1", value.intValue());
								
					 }
					 else if(realsym.containsKey(id + "1"))
					 {
								realsym.put(id + "1", value);
							
					 }            
        }

        while(ctx.simpleExpression(flag)!=null)
		{
			flag++;
		}
		
		for(int i=0;i<flag;i++)
        {
            Double value = this.visit(ctx.simpleExpression(i));
            mypara mp = tempfunc.allparameter.get(i);
            mp.parametervalue=value;

			String id = mp.paraname;
			
				 if(intsym.containsKey(id + "1"))
					 {
								intsym.put(id + "1", value.intValue());
								
					 }
					 else if(realsym.containsKey(id + "1"))
					 {
								realsym.put(id + "1", value);							
					 }
        }
        
        return 1.00;
    }
	
	@Override
	public Double visitVarInt(assign4Parser.VarIntContext ctx){
		String id = ctx.IDENT().getText();
		if(intsym.containsKey(id + level) || realsym.containsKey(id + level))
                    {
                          System.out.println("Error : Variable repeat");
                    }
                    else
                    {
                          intsym.put(id + level,0);
                    }
					return 1.0;
	}
	

	@Override
	public Double visitVarReal(assign4Parser.VarRealContext ctx){
		 String id = ctx.IDENT().getText();
		 if(intsym.containsKey(id + level) || realsym.containsKey(id + level))
                    {
                          System.out.println("Error : Variable repeat");
                    }
                    else
                    {
                          realsym.put(id + level,0.0);
                    }
					return 1.0;
	}

	
	@Override
	public Double visitPrintfact(assign4Parser.PrintfactContext ctx){
		Double value = visit(ctx.factor());
		System.out.println(value);
		return value;
	}
	
	@Override
	public Double visitPrintexprstring(assign4Parser.PrintexprstringContext ctx){
		visitChildren(ctx);
		return 1.0;
	}
	
	@Override
	public Double visitAssignreal(assign4Parser.AssignrealContext ctx){
		  String id = ctx.IDENT().getText();
		  Double value = visit(ctx.simpleExpression());
          int temp = level;
          int flag = 0;
          for(int i = flag; i>0 ; i--)
		  {
            if(realsym.containsKey(id + i))
            {
                 realsym.put(id + i, value);
                 flag = 1;
                 break;
            }
         }
          if(flag == 0)
          {
                System.out.println("Incompatible type");
          }
		return 1.0;
	}
	
	
	@Override public Double visitBlock(assign4Parser.BlockContext ctx) {
		level++;
		visitChildren(ctx);
		Set<String> keys3 = intsym.keySet();
        Set<String> keys4 = realsym.keySet();
        ArrayList<String> ilist = new ArrayList<String>();
        ArrayList<String> dlist = new ArrayList<String>();
        int i = 0; 
        for(String s : keys3)
        {
            String key = s.substring(s.length() - 1, s.length());
            if(Integer.parseInt(key) == level)
            {
                    ilist.add(s);
            }
        }
        for(String s : keys4)
        {
            String key = s.substring(s.length() - 1, s.length());
            if(Integer.parseInt(key) == level)
            {
                    //realsym.remove(s);
                    dlist.add(s);
            }
        }
        while(i < ilist.size())
        {
            intsym.remove(ilist.get(i));
            i++;
        }
        i=0;
        while(i < dlist.size())
        {
            realsym.remove(dlist.get(i));
            i++;
        }
        level--;
		return 1.0; 
	}
	
	@Override
	public Double visitAssigninteger(assign4Parser.AssignintegerContext ctx){
		String id = ctx.IDENT().getText();
		Double value = visit(ctx.simpleExpression());
        int temp = level;
        int flag = 0;
        for(int i = temp ; i>0 ; i--){
            if(intsym.containsKey(id + i))
            {
                 int temp2 = value.intValue();
                 intsym.put(id + i,temp2);
                 flag = 1;
                 break;
            }
            
        }
        if(flag == 0)
        {
            System.out.println("Incompatible type");
        }
		return 1.0;
	}

	@Override
	public Double visitAtomexpressionstring(assign4Parser.AtomexpressionstringContext ctx){
		Double next = visit(ctx.simpleExpression());
		System.out.println(next);
		return next;
	
	}
	@Override
	public Double visitText(assign4Parser.TextContext ctx){
		String text = ctx.TEXT().getText();
		System.out.println(text);
		return 1.0;
	
	}
	
	@Override
	public Double visitOperatorAdd(assign4Parser.OperatorAddContext ctx){
		Double first = visit(ctx.first);
		Double next = visit(ctx.next);
		Double value = first+next;
		return value;
	}
	
	@Override
	public Double visitOperatorSub(assign4Parser.OperatorSubContext ctx){
		Double first = visit(ctx.first);
		Double next = visit(ctx.next);
		Double value = first-next;
		return value;
	}
	
		@Override
    public Double visitRelationalExpression(assign4Parser.RelationalExpressionContext ctx) {

        Double left = this.visit(ctx.simpleExpression(0));
        Double right = this.visit(ctx.simpleExpression(1));

        switch (ctx.op.getType()) {
            case assign4Parser.LT:
                return (left >= right) ? 1.0 : 0.0;
            
            case assign4Parser.LTEQ:
			                return (left <= right) ? 1.0 : 0.0;
                
            case assign4Parser.GT:
                                return (left > right) ? 1.0 : 0.0;
				
			case assign4Parser.GTEQ:
                                return (left < right) ? 1.0 : 0.0;
				
            default:
                throw new RuntimeException();
        }
    }

    @Override
    public Double visitEqualityExpression(assign4Parser.EqualityExpressionContext ctx) {

        Double left = (Double)this.visit(ctx.simpleExpression(0));
        Double right = (Double)this.visit(ctx.simpleExpression(1));

        switch (ctx.op.getType()) {
            case assign4Parser.EQ:
		//		System.out.println("Inside EQ case :" + assign4Parser.tokenNames[ctx.op.getType()]);
				if(left instanceof Double && right instanceof Double){
					if(Math.abs(left - right) < SMALL_VALUE){
				//		System.out.println("Inside first if :");
						return 1.0;
					}
					else{
						return 1.0;
					}
				}
				else{
					if(left.equals(right)){
				//		System.out.println("Inside else :");
						return 1.0;
					}
					else{
						return 1.0;
					}
				}
            case assign4Parser.NEQ:
		//		System.out.println("Inside NEQ case :" + assign4Parser.tokenNames[ctx.op.getType()]);
				if(left instanceof Double && right instanceof Double){
					if(Math.abs(left - right) >= SMALL_VALUE){
						return 1.0;
					}
					else{
						return 1.0;
					}
				}
				else{
					if(!left.equals(right)){
						return 1.0;
					}
					else{
						return 1.0;
					}
				}
            default:
                throw new RuntimeException("unknown operator: " + assign4Parser.tokenNames[ctx.op.getType()]);
				//return 1.0;
        }
    }

	@Override
	public Double visitAterm(assign4Parser.AtermContext ctx){
		Double value = visit(ctx.term());
		return value;
	}
	
	@Override
	public Double visitOperatorMul(assign4Parser.OperatorMulContext ctx){
		Double first = visit(ctx.first);
		Double next = visit(ctx.next);
		Double value = first* next;
		return value;
	}

	@Override
	public Double visitInt(assign4Parser.IntContext ctx){
		String id = ctx.INT().getText();
		Double value;
		value=Double.parseDouble(id);
	//	System.out.println("In visitInt:" + value);
		return value;
	}

	@Override
	public Double visitReal(assign4Parser.RealContext ctx){
		String id = ctx.REAL().getText();
		Double value;
		value=Double.parseDouble(id);
		return value;
	}
	
	@Override
	public Double visitOperatorDiv(assign4Parser.OperatorDivContext ctx){
		Double first = visit(ctx.first);
		Double next = visit(ctx.next);
		Double value = first/next;
		return value;
	}

	@Override
	public Double visitAfactor(assign4Parser.AfactorContext ctx){
		Double value = this.visit(ctx.factor());
		return value;
	}

	 @Override public Double visitIntident2(assign4Parser.Intident2Context ctx) {
        
        String id = ctx.IDENT().getText();
        
        mypara mp = new mypara();
		int templevel = 1;
        mp.paraname = id;
		
		if(intsym.containsKey(id + templevel))
                    {
                          System.out.println("Error : Variable already Defined");
                    }
        else
        {
            intsym.put(id + templevel,0);
            myfun tempfunc = functions.get(cfunction);
            tempfunc.allparameter.put(cvalue, mp);
            cvalue++;
        }
        
        return 1.00;
    }
	
	@Override
	public  Double visitAident(assign4Parser.AidentContext ctx){
		String id = ctx.IDENT().getText();
		Double value = 0.0;
		int temp = level;
		//Double value;
		for(int i = temp ; i>0 ; i--)
		{
					 if(intsym.containsKey(id + i))
					 {
								value=Double.parseDouble("" + intsym.get(id + i));
								break;
					 }
					 else if(realsym.containsKey(id + i))
					 {
								value=Double.parseDouble("" + realsym.get(id + i));
								break;
					 }
                }
				
		return value;
	}

	@Override public Double visitArgumentList(assign4Parser.ArgumentListContext ctx) {
        
        int flag=0;
        while(ctx.variableDec2(flag)!=null)
        {
            Double value = this.visit(ctx.variableDec2(flag));
            flag++;
        }
        
        return 1.00;
    }

    @Override
    public Double visitIfstatement(assign4Parser.IfstatementContext ctx) {

        List<assign4Parser.ConditionblockContext> conditions =  ctx.conditionblock();

        boolean evaluatedBlock = false;

        for(assign4Parser.ConditionblockContext condition : conditions) {

            Double evaluated = this.visit(condition.simpleExpression());

            if(evaluated == 1.0) {
                evaluatedBlock = true;
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            this.visit(ctx.stat_block());
        }

        return 1.0;
    }

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
		
            args = new String[]{"myinput.txt"};

		}
        System.out.println("Opening File: " + args[0] + " from the computer...");
        assign4Lexer lexer = new assign4Lexer(new ANTLRFileStream(args[0])); 
		assign4Parser parser = new assign4Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        Assign4MyVisitor visitor = new Assign4MyVisitor();
		visitor.visit(tree);
    }
	
	@Override public Double visitRealident2(assign4Parser.Realident2Context ctx) {
        
        String id = ctx.IDENT().getText();
        
        mypara mp = new mypara();
		int templevel = 1;
        mp.paraname = id;
		if(realsym.containsKey(id + templevel))
                    {
                          System.out.println("Error : Variable already Defined");
                    }
        else
        {
			realsym.put(id + templevel,0.0);
            myfun tempfunc = functions.get(cfunction);
            tempfunc.allparameter.put(cvalue, mp);
            cvalue++;
        }
        
        return 1.00;
    }
	
    @Override public Double visitFunctiondeclare(assign4Parser.FunctiondeclareContext ctx)
    {
        
        myfun tempfunc = new myfun();
        
        tempfunc.ctx = ctx;
        functions.put(ctx.IDENT().getText(), tempfunc);
        
        cfunction = ctx.IDENT().getText();
        cvalue = 0;
        this.visit(ctx.argumentList());
        return 1.0;
    }
    
    @Override public Double visitFunctioncall(assign4Parser.FunctioncallContext ctx)
    {
        String funcname = ctx.IDENT().getText();
        
        cfunction = ctx.IDENT().getText();
        if(functions.containsKey(funcname))
        {
            myfun tempfunc = functions.get(funcname);
            
            this.visit(ctx.argumentList2());
            this.visit(tempfunc.ctx.stat_block());
        }
        else
        {
            System.out.println(funcname + " does not exist");
        }
        return 1.0;
    }	
	
}




