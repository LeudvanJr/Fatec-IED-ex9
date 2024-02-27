package controller;

public class OperacoesController {
	public OperacoesController() {
		// TODO Auto-generated constructor stub
	}
	
	public int fatorialImpares(int num) {
		if(num==1)
			return 1;
		
		return num * fatorialImpares(num - 2);
	}
	
	public boolean validarImparNatural(int num) {
		if(num % 2 != 0 && num >= 0)
			return true;
		
		return false;
	}
}
