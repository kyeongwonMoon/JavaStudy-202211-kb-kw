package j21_문자열메소드;

public class StringMethod {
	
	public static void main(String[] args) {
		
		String name = "김준일김수현김준일1";
		
		System.out.println(name.length());
		
		// 문자의 위치 찾기
		System.out.println(name.indexOf("김"));
		System.out.println(name.indexOf("준"));
		
		// 문자의 위치 뒤에서부터 찾기
		System.out.println(name.lastIndexOf("김"));
		
		char name1 = name.charAt(0);
		System.out.println(name1);
		
		char name2 = name.charAt(name.indexOf("준"));
		System.out.println(name2);
		
		String subName1 = name.substring(2);
		System.out.println(subName1);
		
		String nameJunil = "김수현";
		
		System.out.println(name.substring(name.indexOf(nameJunil), name.indexOf(nameJunil) + nameJunil.length()));
		
		String file = "C:/String.java";
		String fileName = null;
		String extensionString = null;
		
		fileName = file.substring("C:/".length(), file.lastIndexOf("."));
		System.out.println(fileName);
		extensionString = file.substring(file.lastIndexOf("."));
		System.out.println(extensionString);
		
		
	}

}
