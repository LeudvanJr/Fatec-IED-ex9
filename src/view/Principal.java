package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController opController = new OperacoesController();
		int num = 7;
		
		int res = opController.validarImparNatural(num) ? opController.fatorialImpares(num) : -1;
		
		System.out.println(res);
	}

}
