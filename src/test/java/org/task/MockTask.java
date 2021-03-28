package org.task;

import java.util.*;

class MockTask {

	public static void arrayMethod() { 			//practice
		int[] a=new int[3];
		int b[]=new int[4];
	System.out.println(a.length);//length is variable
		a[0]=1;
		a[1]=5;
		a[2]=6;
		a[3]=7;
		a[4]=8;
		
		System.out.println(a);
		
		for (int s = 0; s < b.length; s++) {
			System.out.println(a[s]);
		}
	}
	public static void getListMethod() {  		//practice
		List l=new ArrayList();
		l.add("abc");
		l.add('l');
		l.add(12);
		l.add(9637415296l);
		
		
		 Object obj = l.get(2);
		System.out.println(obj);
		
		List<Integer> l1=new ArrayList();
		List<Integer> l2=new ArrayList();
		l1.add(12);
		l1.add(54);
		l1.add(79);
		l1.add(74);
		l1.add(321);
		l1.add(96);
		System.out.println(l1);
		l2.add(12);
		l2.add(74);
		l2.add(321);
		l2.add(963);
		l2.add(951);
		System.out.println(l2);
		boolean ac= l1.retainAll(l2);
		System.out.println("after retained: "+l1);
		l2.removeAll(l1);
		System.out.println("after removed: "+l2);
		
	}
	
	public static void stringMethod() {		//practice	
	/*	System.out.println("immutable string");
		String is1="abc";
		System.out.println(System.identityHashCode(is1));
		String is2="bcd";
		System.out.println(System.identityHashCode(is2));
		String is3 = is1.concat(is2);
		System.out.println(System.identityHashCode(is3));
		
		System.out.println("mutable string");
		StringBuffer ms1=new StringBuffer("zyx");
		System.out.println(System.identityHashCode(ms1));
		StringBuffer ms2=new StringBuffer("wxy");
		System.out.println(System.identityHashCode(ms2));
		StringBuffer ms3 = ms1.append(ms2);
		System.out.println(System.identityHashCode(ms3));
		*/
		
		String s="kathiresan";
		System.out.println(s);
		String r = s.replace('a', 'z');
		System.out.println(r);
		String r1 = s.replace("kat", "zyx");
		System.out.println(r1);
		String r3 = s.replaceAll("kathir", "jeeva");
		System.out.println(r3);
	}
	
	
	
	
	public static void asciiMethod() {		//practice
		for (int i = 48; i <=122; i++) {
			System.out.print((char)i+"="+i+" ");
		}
		System.out.println();
		int ka='k';
		System.out.println(ka);
	}
	
	
	
	
	
	
	
	public static void reverseWord() {		//11
		String word="Welcome to java class";
		String[] sp = word.split(" ");
		System.out.println(word);
		String reverse="";
		int l = sp.length;
		for (int i =sp.length-1; i >=0 ; i--) {
			reverse=reverse+sp[i]+" ";
		}
		System.out.println(reverse);
	}
	public static void firstUpperCase() {		//12
		String word="welcome to java class";
		String[] sp = word.split(" ");
		System.out.println(word);
		String first="";
		for (int i =0; i < sp.length ; i++) {
			char f = sp[i].charAt(0);
			char n = Character.toUpperCase(f);
			String rs = sp[i].replace(f, n);
			first=first+rs+" ";
			
		}
		System.out.println(first);
	}
	public static void duplicateLetters() {		//13
		String word="raining here";
		System.out.println(word);
		String remove="";
		char[] letters = word.toCharArray();
//		int len = letters.length;
//		for (int i = 0; i < letters.length; i++) {
//			for (int j = 0; j < letters.length; j++) {
//				if (letters[i]==letters[j]) {
//					 remove = word.replace(letters[j], ' ');
//				}
//			}
//		}
		Set<Character> s=new LinkedHashSet<>();
		for (int i = 0; i < word.length(); i++) {
			char l = word.charAt(i);
			s.add(l);
		}
		for (Character cs : s) {
		
				System.out.print(cs);
			}
	
	}
	public static void duplicateword() {		//14
		String word="java sql java python java python";
		String[] words = word.split(" ");
		System.out.println(word);
		
		Set<String> s=new LinkedHashSet<>(Arrays.asList(words));
//		for (int i = 0; i < word.length(); i++) {
//			char l = word.charAt(i);
//			s.add(l);
//		}
		for (String cs : s) {
		
				System.out.print(cs+" ");
			}

	}
	public static void duplicateArray() {		//15
		int[] a = { 55, 39, 26, 78, 55, 99, 30 };
		  
	        System.out.print("Before:");
	        for (int i=0;i<a.length; i++ ) {
	            System.out.print(a[i]+", ");
	        }
	        System.out.println();
	      
	        System.out.print("After:");
	        int b=0;
	        a[b]=a[0];
	        for(int i=0;i<a.length;i++) {
	            if (a[b]!=a[i])
	            {
	                b++;
	                a[b]=a[i];
	            }
	        }
	        for (int i=0;i<=b;i++ ) {
	            System.out.print(a[i]+", ");
	        }
	
	}
	
	public static void ascendingSort() {		//16,17
		 int[] a = { 55, 20, 60, 90, 15, 35 };
		 
		 System.out.print("before:");
		 for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		 for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]<a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		 System.out.print("\nascending:");
		 for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		 System.out.print("\ndescending:");
		 for (int i = a.length-1; i >=0; i--) {
			System.out.print(a[i]+", ");
		}
	}
	public static void letterCount() {		//18
		String s = "raining here";
		
		int l = s.length();
		System.out.println("no of letters:"+l);
		for (int i = 0; i < s.length(); i++) {
			char leter = s.charAt(i);
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if (leter==s.charAt(j)) {
					count++;
				}
			}
			System.out.println(leter+":"+count);
		}
		
	}
	public static void sumNo() {		//19
		 int[] a= {10,20,30,40,50};
		 int sumodd =0;
		 int sumeven=0;
		 for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				sumeven=sumeven+a[i];
			}
			else {
				sumodd=sumodd+a[i];
			}
		}
		 System.out.println("sum of odd no:"+sumodd);
		 System.out.println("sum of even no:"+sumeven);
	}
	
	public static void wordCount() {		//20
		String s = "java sql java python ";
		String[] s1 = s.split(" ");
		int c=s1.length;
		System.out.println("no of words:"+c);
		for (int i = 0; i < s1.length; i++) {
			String word=s1[i];
			int count=0;
			for (int j = 0; j < s1.length; j++) {
				if (word==s1[j]) {
					count++;
				}
			}
			System.out.println(word+":"+count);
		}
	}
	public static void vowelsCount() {		//21
		
		 String s="All the best";
		 int vowels=0;
		 int consonants =0;
		 for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
					||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				vowels++;
			} else {
				consonants++;
			}
		}
		 System.out.println("no'of vowels"+vowels);
		 System.out.println("no'of consonants"+consonants);
}
	public static void letterCountWithASCII() {		//22
		String s= "KannanDev1235@gmail.com";
		int upperCount=0;
		int lowerCount=0;
		int numberCount=0;
		int symbolCount=0;
		
		for (int i = 0; i < s.length(); i++) {
			char l = s.charAt(i);
			
			if (l>=65&&l<=90) {
				upperCount++;
			}if (l>=97&&l<=122) {
				lowerCount++;
			}if (l>=48&&l<=57) {
				numberCount++;
			} else {
				symbolCount++;
			}
		}
		System.out.println("uppercase"+upperCount);
		System.out.println("lowercase"+lowerCount);
		System.out.println("number"+numberCount);
		System.out.println("symbol"+symbolCount);
	}
	public static void lettersCountWithoutASCII() {		//23
		String s= "KannanDev1235@gmail.com";
		int upperCount=0;
		int lowerCount=0;
		int numberCount=0;
		int symbolCount=0;
		System.out.println(s.length());
		for (int i = 0; i < s.length(); i++) {
			char l = s.charAt(i);
			
			 if (l>='A'&&l<='Z') {
				upperCount++;
			}else if (l>='a'&&l<='z') {
				lowerCount++;
			}else if (l>='0'&&l<='9') {
				numberCount++;
			} else {
				symbolCount=symbolCount+1;
			}
		}
		System.out.println("uppercase "+upperCount);
		System.out.println("lowercase "+lowerCount);
		System.out.println("number "+numberCount);
		System.out.println("symbol "+symbolCount);
	}
	public static void sortChar() {		//24
		String s="goodday";
		System.out.println(s);
		char[] sa = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
			
				if (sa[i]<sa[j]) {
					char temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		String s1 = Arrays.toString(sa)
				.replace(",","")
				.replace(" ", "").trim();
		
		System.out.println(s1);
	}
	public static void primeNo() {   //25
		int no=42;
		int half=no/2;
		int c=0;
		if (no==0||no==1) {
			System.out.println(no+"is not prime no");
		} else {
		for (int i = 2; i <=half; i++) {
			if (no%i==0) {
				System.out.println(no+"is not prime no");
				c=1;
				break;
			}
		}
		if (c==0) {
		System.out.println(no+"is prime no");
		}
		}
	}
	public static void patternone() {		//26
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void patterntwo() {		//27
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
	}
	public static void patternthree() {		//28
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
	public static void patternfour() {		//29
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i==3 || j==3 ||(i==2&&j==2)) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void patternfive() {		//30
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		patternfive();
		
		
	}

}








