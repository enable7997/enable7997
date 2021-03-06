/*
자바 시저 암호화 프로그램
키와 평문을 입력받아 암호화
*/

import java.util.Scanner;

class Encryption {
	public String encryption(String text, int key) {
		String encryption_text = "";
		for(int i=0; i<text.length(); i++) {
			char tmp = text.toLowerCase().charAt(i);
			if(tmp==' ') { 
				encryption_text += tmp;
				continue;
			}
			if(tmp>='a' && tmp<='z') {
				if(tmp+key > 'z') {
					encryption_text += (char)(tmp-'a'+key);
				}else {
					encryption_text += (char)(tmp+key);
				}
			}
		}
		return encryption_text;
	}
}
public class CaesaCipher {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Encryption e_text = new Encryption();
		int key;
		
		String text;
		
		System.out.printf("키를 입력해주세요 : ");
		key = s.nextInt();
		s.nextLine();
		
		System.out.printf("평문을 입력해주세요 : ");
		text = s.nextLine();
		
		System.out.printf("%s\n",e_text.encryption(text, key));
		s.close();
	}
}
