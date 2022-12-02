package j19_익명클래스;

public class CalcMain {

	public static void main(String[] args) {

		Calculator c = new Calculator() {

			@Override
			public int calc(int a, int b) {
				return a + b;
			}
		};

		Calculator c1 = (x, y) -> x + y;
		
		CalculatorSub cs = (x) -> x * x;
		System.out.println(cs.calc(10));
		System.out.println(cs.a());

		int r1 = c1.calc(10, 20);
		System.out.println(r1);

		Calculator c2 = new Addition();

		int r2 = c2.calc(20, 30);
		System.out.println(r2);

	}

}
