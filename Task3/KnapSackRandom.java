package Task3;

public class KnapSackRandom
{
	int [] ValueOfItems  = {10,15,5,1,25};
	
	int [] weightOfItems  = {200,65,520,188,350};
	
	public static void main(String[] args)
	{
		int [] ValueOfItems  = {10,15,5,1,25};
		
		int [] weightOfItems  = {200,65,520,188,350};
		
		int maxWeight = 600;
		
		String bestKnownSolution = "";
		int bestKnownValue = 0;
		
		for(int solDec = 0; solDec <=15; solDec++)
		{
			String binSol = "";
			int weightOfThisSolution = 0;
			int valueOfThisSolution = 0;			
			
			for(int item = 0; item < 5; item++)
			{
				if(Math.random() > 0.5)
				{
					binSol = binSol+"1";
					weightOfThisSolution += weightOfItems[item];
					valueOfThisSolution += ValueOfItems[item];
				}
				else
				{
					binSol = binSol+"0";
				}
			}
			
			System.out.println(binSol+" has weight "+weightOfThisSolution+" and value "+valueOfThisSolution + ((weightOfThisSolution > maxWeight)?"+Infeasible":" -- Ok"));
			
			if(weightOfThisSolution <= maxWeight)
			{
				if(valueOfThisSolution > bestKnownValue)
				{
					bestKnownValue = valueOfThisSolution;
					bestKnownSolution = binSol;
				}
			}
			
		}
		
		System.out.println("Best sol = "+bestKnownSolution + " with value "+bestKnownValue);

		
	}
}
