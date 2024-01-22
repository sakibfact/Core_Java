package com.arrayprogram;

public class StringTwoDArrayProgram {

	public static void main(String[] args) {

		String studentName[][] = { { "Sakib", "khan", "Hello" }, { "hii", "byyy", "why" }, 
				{ "jjjj", "jijij", "kkkkk" },};
		
		for(int i=0;i<studentName.length;i++) {
			for(int j=0;j<studentName[i].length;j++) {
				
				System.out.println("Student List Of Name is:"+studentName[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
