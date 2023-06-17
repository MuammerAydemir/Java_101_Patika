import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Palindromik_Kelime_Bul {

	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> wordsUnicode=new ArrayList<>();
		ArrayList<Integer> indexList = new ArrayList<>();
		String  word;
        // Büyük harflerin ASCII değerlerini ekleme (65 ile 90 arasında)
        for (int a = 65; a <= 90; a++) {
            indexList.add(a);
        }
        // Küçük harflerin ASCII değerlerini ekleme (97 ile 122 arasında)
        for (int b = 97; b <= 122; b++) {
            indexList.add(b);
        }
        while(true) {
			System.out.print("Lütfen kelime giriniz: ");
			word=input.nextLine();
			if(!word.isEmpty()) {
				for(int i=0;i<word.length();i++) {
					wordsUnicode.add(word.codePointAt(i));
				}
				if(indexList.containsAll(wordsUnicode)) {
					if(isPalindrome(word.trim())) {
						System.out.println("Evet Bu Bir Palindrom Kelimedir!!");
						break;
					}else {
						System.out.println("Bu Kelime Palindrom DEĞİLDİR!!!;");
					}
				}else {
					System.out.println("Sadece Alfabetik Karakter Giriniz!");
					wordsUnicode.clear();
				}
			}else {
				System.out.println("Boş Geçilemez!!!!");
			}
		}
		
	}
}
