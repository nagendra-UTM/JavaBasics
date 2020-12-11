package com.karan.Java8;

public class CountCharacters {

	public static void main(String[] args) {
		
		String s = "As mentioned in Handbook of Personnel Officers as specified by DoPT under Annexure-1 of chapter 14 " + 
				"MEDICAL EXAMINATION ON FIRST APPOINTMENT under the category Colour Vision states that-" + 
				"For the IPS and other Police Services, Group ‘A’ and ‘B’ Indian Railway Traffic Service, Group A posts" + 
				"in the Railway Protection Force and for other Services concerned with the safety of the public, higher grade" + 
				"of colour vision is essential but for other lower grade of colour vision should be considered sufficient." + 
				"Question 1. Please name the research organisations who does not work directly for public and for safety" + 
				"of public who can accept the lower grade of colour vision for appointment of Scientist in their organisations?" + 
				"Question 2. Is DRDO considered as an organisation who deals directly with the public and safety of" + 
				"public similar to IPS, other Police Services and Indian Railways traffic service?" + 
				"Question 3. Are DRDO’s Scientist considered to deal directly with the public like IPS, other Police" + 
				"services and Indian Railways?" + 
				"Question 4. Does a scientist group-A gazetted post in DRDO which requires to complete duties within" + 
				"the office to develop new softwares on computer or performing research within the office are also required to" + 
				"mandatorily possess higher grade of colour vision?" + 
				"Question 5. Does a computer science and engineering candidate recruited for scientist-B gazetted post" + 
				"in DRDO are required to undergo higher grade of color vision test whose duties are confined within the office" + 
				"to develop softwares on computer/laptop?" + 
				"For reference of the complete document please refer to the link and the quoted text is on page number" + 
				"156 - https://dopt.gov.in/reports/hand-book/hand-book-personnel-officers-2013";
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			if ((s.charAt(i) >= 'a' && s.charAt(i)<='z') ||
			(s.charAt(i)>='A' && s.charAt(i)<='Z') ||
			(s.charAt(i)==' ') || (s.charAt(i) == '.') || (s.charAt(i) == '?') || 
			(s.charAt(i)=='-')  || (s.charAt(i) == '/') ||
			(s.charAt(i) == ':') || (s.charAt(i) == '+') ||
			(s.charAt(i) >= '0' && s.charAt(i) <='9')) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
