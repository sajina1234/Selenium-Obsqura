package processor;

import datarepository.Process;

public class Calculate {

	public static void main(String[] args) {
		Process obj=new Process();
		
		 int result=obj.getResult(4,5);
		System.out.println(result);
	}

}
