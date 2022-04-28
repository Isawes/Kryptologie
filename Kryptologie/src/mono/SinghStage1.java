package mono;

import java.util.Arrays;

public class SinghStage1 {
	
	public static String dekryptKey ="ciovyblkftqmadzhpsjnurgewx";
			

	public static String cipher = 
			
			  "BT JPX RMLX PCUV AMLX ICVJP IBTWXVR CI M LMTR PMTN, "
			+ "MTN YVCJX CDXV MWMBTRJ JPX AMTNGXRJBAH UQCT JPX "
			+ "QGMRJXV CI JPX YMGG CI JPX HBTW'R QMGMAX; MTN JPX "
			+ "HBTW RMY JPX QMVJ CI JPX PMTN JPMJ YVCJX. JPXT JPX "
			+ "HBTW'R ACUTJXTMTAX YMR APMTWXN, MTN PBR JPCUWPJR "
			+ "JVCUFGXN PBL, RC JPMJ JPX SCBTJR CI PBR GCBTR YXVX "
			+ "GCCRXN, MTN PBR HTXXR RLCJX CTX MWMBTRJ MTCJPXV. "
			+ "JPX HBTW AVBXN MGCUN JC FVBTW BT JPX MRJVCGCWXVR, "
			+ "JPX APMGNXMTR, MTN JPX RCCJPRMEXVR. MTN JPX HBTW "
			+ "RQMHX, MTN RMBN JC JPX YBRX LXT CI FMFEGCT, YPCRCXDXV "
			+ "RPMGG VXMN JPBR YVBJBTW, MTN RPCY LX JPX BTJXVQVXJMJBCT "
			+ "JPXVXCI, RPMGG FX AGCJPXN YBJP RAMVGXJ, MTN PMDX M "
			+ "APMBT CI WCGN MFCUJ PBR TXAH, MTN RPMGG FX JPX JPBVN "
			+ "VUGXV BT JPX HBTWNCL. JPXT AMLX BT MGG JPX HBTWR YBRX "
			+ "LXT; FUJ JPXE ACUGN TCJ VXMN JPX YVBJBTW, TCV LMHX "
			+ "HTCYT JC JPX HBTW JPX BTJXVQVXJMJBCT JPXVXCI. JPXT YMR "
			+ "HBTW FXGRPMOOMV WVXMJGE JVCUFGXN, MTN PBR ACUTJXTMTAX "
			+ "YMR APMTWXN BT PBL, MTN PBR GCVNR YXVX MRJCTBRPXN. TCY "
			+ "JPX KUXXT, FE VXMRCT CI JPX YCVNR CI JPX HBTW MTN PBR "
			+ "GCVNR, AMLX BTJC JPX FMTKUXJ PCURX; MTN JPX KUXXT RQMHX "
			+ "MTN RMBN, C HBTW, GBDX ICVXDXV; GXJ TCJ JPE JPCUWPJR "
			+ "JVCUFGX JPXX, TCV GXJ JPE ACUTJXTMTAX FX APMTWXN; JPXVX "
			+ "BR M LMT BT JPE HBTWNCL, BT YPCL BR JPX RQBVBJ CI JPX "
			+ "PCGE WCNR; MTN BT JPX LAMER CI JPE IMJPXV GBWPJ MTN "
			+ "UTNXVRJMTNBTW MTN YBRNCL, GBHX JPX YBRNCL CI JPX WCNR, "
			+ "YMR ICUTN BT PBL; YPCL JPX HBTW TXFUAPMNTXOOMV JPE IMJPXV, "
			+ "JPX HBTW, B RME, JPE IMJPXV, LMNX LMRJXV CI JPX LMWBABMTR, "
			+ "MRJVCGCWXVR, APMGNXMTR, MTN RCCJPRMEXVR; ICVMRLUAP MR MT "
			+ "XZAXGGXTJ RQBVBJ, MTN HTCYGXNWX, MTN UTNXVRJMTNBTW, "
			+ "BTJXVQVXJBTW CI NVXMLR, MTN RPCYBTW CI PMVN RXTJXTAXR, "
			+ "MTN NBRRCGDBTW CI NCUFJR, YXVX ICUTN BT JPX RMLX NMTBXG, "
			+ "YPCL JPX HBTW TMLXN FXGJXRPMOOMV; TCY GXJ NMTBXG FX AMGGXN, "
			+ "MTN PX YBGG RPCY JPX BTJXVQVXJMJBCT. JPX IBVRJ ACNXYCVN BR "
			+ "CJPXGGC.";
		
		
	
	
	
	
	
	public static int[] absFreqs(String s) {
		
		int[] f = new int [26];
		int i = 0;
		
		while (i<=25) {
			
			int j=0;
			
			while(j<s.length()) {
				
				if(s.charAt(j) == (char) (65+i) ) {
					f[i]++;
				}
			j++;	
			}
		i++;
		}
		return f;
	}
	
/*	public static int[] absfreq2(String s) {
		int[] counter = new int [26];
		for(char i=0; i<s.length(); i++) {
			char c = s.charAt(i);
					if(Character.isLetter(c)) {
						counter[c]++;
					}
		}
		
	}
	
	//for(char a = 'A'; a<='Z'; a++) {
		
	//}*/
	
	
	public static void main(String[] args) {

		int [] f = absFreqs(cipher);
		System.out.println(Arrays.toString(f));
		
		
		String plain ="";
		for (int i=0;i< cipher.length();i++) {
			char c = cipher.charAt(i);
			if(Character.isLetter(c)) {
				plain += dekryptKey.charAt(c-65);
			}else {
				plain+=c;
			}
		}
		System.out.println(plain);
		

	}

}
