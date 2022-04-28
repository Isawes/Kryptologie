package mono;

public class Caeser {
	
	
	
	public static String klartext="QUE PEDO";
	public static int key =7;
	
	public static String verschlusseln(String s, int t) {
		String geheim = "";
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			if(Character.isLetter(c)) {
				int k = (int) c+t;
				if(k>90) {
					k=k-26;
				}
				
				geheim += (char) k;
			
			}else {
				geheim+=c;
			}
			
		}
		return geheim;
	}
	
	public static String entschlusseln(String s, int t) {
		String klar = "";
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			if(Character.isLetter(c)) {
				int k = (int) c-t;
				if(k<65) {
					k=k+26;
				}
				
				klar += (char) k;
			
			}else {
				klar+=c;
			}
			
		}
		return klar;
	}
	

	public static void main(String[] args) { 
		
		System.out.println(verschlusseln(klartext,key));
		System.out.println(entschlusseln("MHILYLZAZBHLXBPZXBLMVYABUHLHWWPBZJSHBKPBZJHLJBZKPJABTHYJHUBTLZAULBAYVU",key));
		
	}

}
