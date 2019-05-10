package com.learn.general;

public class FixIssue {
	
	public static void main(String[] args) {
		
		String str ="HCDE_PPO:HCDEPPO 24.0.0 TAR.A-PROD_CODE";
		
		String str1 = str.split(":")[0];
		String str2 = str.split(":")[1];
		System.out.println(str1);
		System.out.println(str2);
		String str3 = str.split(":")[0]+"_"+str.split(":")[1].replace(" TAR.A-PROD_CODE","").replace(" ","_").split("_")[1];
		String str4 = str3.replace(" ","_");
		String str5 = str4.split("_")[1];
		String str6 = str1+"_"+str5;
		System.out.println("$$$$" +str3);
		
	}

}
