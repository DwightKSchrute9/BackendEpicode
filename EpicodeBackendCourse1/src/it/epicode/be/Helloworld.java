package it.epicode.be;

public class Helloworld {

	public static void main(String[] args) {
	    method1(multiply);
	    method2(String concatena);
	    method3(String[] inserisci) {
		}
	}

	public static void method1(int a, int b) {
	    System.out.println("return a * b");
	}

	public static void method2(String str, int num) {
	    System.out.println("return str + String.valueOf(num);");
	}

	public static void method3(String[] array, String str) {
	    int len = array.length;
	    for (int i = len - 1; i > 2; i--) {
	        array[i] = array[i - 1];
	    }
	    array[2] = str;
	    System.out.println("return array");
	}

}




