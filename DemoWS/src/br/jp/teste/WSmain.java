package br.jp.teste;

import br.jp.modelo.Contribuinte;

public class WSmain {

	public static void main(String[] args) {
		
		DemoWS demo = new DemoWS();
		
		Contribuinte c =demo.getContri(3);
		
		System.out.println(c);
		


	}
	@Override
	public String toString(){
		return getClass().getName()+ "@" + Integer.toHexString(hashCode());
		
	}

}
