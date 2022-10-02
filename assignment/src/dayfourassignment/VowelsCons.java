package dayfourassignment;

public class VowelsCons {
	int freq[];
	char[] string;
	 
     public VowelsCons(int[] freq, char[] string) {
		super();
		this.freq = freq;
		this.string = string;
	for(int i= 0; i <freq.length; i++) {  
         if(string[i] != ' ' && string[i] != '0') {
         	char c=string[i];
         	if(c!='a'| c!='e'|c!='i'| c!='o'|c!='u')
         		System.out.println(c+"---"+freq[i]);
         }
             	
     } 
     
    System.out.println("Vowels and their corresponding frequencies");  
     for(int i1 = 0; i1<freq.length; i1++) {  
         if(string[i1] != ' ' && string[i1] != '0') {
         	char c=string[i1];
         	if(c=='a'| c=='e'|c=='i'| c=='o'|c=='u')
         		System.out.println(string[i1]+"---"+freq[i1]);
         }
             	
     }
}
}
