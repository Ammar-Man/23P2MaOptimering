/*
import ilog.concert.IloConstraint;
import ilog.concert.IloException;
import ilog.concert.IloIntExpr;
import ilog.concert.IloIntVar;
import ilog.concert.IloLinearNumExpr;
import ilog.cplex.IloCplex;

public class FriendProblemDemo
{
	IloCplex model;
	IloIntVar a,b,c,d,e;
	
	public FriendProblemDemo()
	{
		try
		{
			initialize();
			setObjective();
			setConstraints();
			
			//Optional step during debugging only
			model.exportModel("CheckMe.lp");			

			//Typically you would need to set many params. 
			setParameters();

			model.solve();
			
			//Extract Results
			extractResults();
			
			model.close();
		}
		catch(IloException ex)
		{
			System.err.println("Cplex initiatialization exception");
			ex.printStackTrace();
		}
	}

	*
	 * Extract and display the results on console
	 * @throws IloException 
	 */
	/*
	private void extractResults() throws IloException
	{
		System.out.println("No of people going = "+model.getObjValue());//This is an intentional bug. Please find why 6 people are going when only 5 exist
		System.out.println("Is Alice going 0´== "+model.getValue(a));
	}


	/**
	 * This method sets some sample params. For full list, see {@link https://www.ibm.com/docs/en/icos/20.1.0?topic=cplex-list-parameters} 
	 * @throws IloException
	 */
	/*
	private void setParameters() throws IloException
	{
		//Finish off in 10 seconds maximum
		model.setParam(IloCplex.Param.TimeLimit, 10);
		
		//model.setOut(null);
	}

	/**
	 * Define all constraints
	 * @throws IloException
	 */
	/*
	private void setConstraints() throws IloException
	{
		//Equation #1: Alice goes only if Dylan goes. On way restriction not applying to Dylan
		model.addGe(d, a); // Implies d >= a
		
		//Equation #2: Emily goes only if at least one among Alice and Carol go. 
		//On way restriction not applying to Alice and Carol
		model.addGe(model.sum(a, c), e); // Implies a+c >= e
		
		//Another way to make Equation #2
		IloIntExpr lhs = model.sum(a, c);
		model.addGe(lhs, e);
		
		//Giving names to equations
		IloConstraint constraint1 = model.addGe(d, a); // Implies d >= a
		constraint1.setName("Equation1");
		
		//Efficient and common way to make constraints
		model.addGe(d, a, "Equation1__DylanAlice");
	}

	/**
	 * Set the objective
	 * @throws IloException
	 */
	/*
	private void setObjective() throws IloException
	{
		IloLinearNumExpr sum = model.linearNumExpr();
		
		sum.addTerm(1, a);
		sum.addTerm(2, b); //We really want Bob to go out today.
		sum.addTerm(1, c);
		sum.addTerm(1, d);
		sum.addTerm(1, e);
		
		model.addMaximize(sum);
	}

	/**
	 * Initialize the solver and the variables
	 * @throws IloException
	 */
	/*
	private void initialize() throws IloException
	{
		model = new IloCplex();
		model.setName("Simple Problem for Friends selection");
		a = model.boolVar("AliceGoing");
		b = model.boolVar("BobGoing");
		c = model.boolVar("CarolGoing");
		d = model.boolVar("DylanGoing");
		e = model.boolVar("EmilyGoing");
	}
	
	public static void main(String[] args) throws IloException
	{
		FriendProblemDemo quicktest = new FriendProblemDemo();
	}
}
 */