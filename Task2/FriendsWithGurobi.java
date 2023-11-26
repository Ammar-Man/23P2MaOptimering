/* 
import gurobi.GRB;
import gurobi.GRBEnv;
import gurobi.GRBException;
import gurobi.GRBLinExpr;
import gurobi.GRBModel;
import gurobi.GRBVar;

public class FriendsWithGurobi
{
	public static void main(String[] args)
	{
		try
		{
			// Create empty environment, set options, and start
			GRBEnv env = new GRBEnv(true);
			env.set("logFile", "mip1.log");
			env.start();

			// Create empty model
			GRBModel model = new GRBModel(env);

			// Create variables
			GRBVar a = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "Alice");
			GRBVar b = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "Bob");
			GRBVar c = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "Carol");
			GRBVar d = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "Dylan");
			GRBVar e = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "Emily");

			// Set objective: maximize x + y + 2 z
			GRBLinExpr expr = new GRBLinExpr();
			expr.addTerm(1.0, a);
			expr.addTerm(1.0, b);
			expr.addTerm(1.0, c);
			expr.addTerm(1.0, d);
			expr.addTerm(1.0, e);
			model.setObjective(expr, GRB.MAXIMIZE);

			// Add constraint
			GRBLinExpr lhs = new GRBLinExpr();
			lhs.addTerm(1.0, a);
			lhs.addTerm(1, c);
			model.addConstr(e, GRB.LESS_EQUAL, lhs, "WhatIsThisConstraint");

			// Optimize model
			model.optimize();

			System.out.println(a.get(GRB.StringAttr.VarName) + " " + a.get(GRB.DoubleAttr.X));
			System.out.println(b.get(GRB.StringAttr.VarName) + " " + b.get(GRB.DoubleAttr.X));
			System.out.println(c.get(GRB.StringAttr.VarName) + " " + c.get(GRB.DoubleAttr.X));
			System.out.println(d.get(GRB.StringAttr.VarName) + " " + d.get(GRB.DoubleAttr.X));
			System.out.println(e.get(GRB.StringAttr.VarName) + " " + e.get(GRB.DoubleAttr.X));

			System.out.println("Obj: " + model.get(GRB.DoubleAttr.ObjVal));

			// Dispose of model and environment
			model.dispose();
			env.dispose();

		} 
		catch (GRBException e)
		{
			System.out.println("Error code: " + e.getErrorCode() + ". " + e.getMessage());
		}
	}
}

*/