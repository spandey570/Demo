package demo.maven;

public class PPF {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int YearSav=0;
		double interest;
		double Total = 0;
		double Principle;
		
		public void PPFAmount( int MonthlySav, int TotalYears)
		{
		for(int i=1; i<=TotalYears; i++)
		{
			YearSav= (MonthlySav*12);
			Principle= YearSav+Total;
			interest =0.08*(Principle);
			Total = Principle+interest;
			System.out.println("Princliple Amount Year Basis: Year "+i +" "  +Principle);
			System.out.println("Interest Amount Year Basis: Year "+i +" "  +interest);
			System.out.println("Total Amount Year Basis: Year "+i +" "  +Total);
		}
		

	}

}
