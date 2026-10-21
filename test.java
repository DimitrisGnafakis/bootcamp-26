public class test{
	public static void main(String... args){
      double pi = 3.14;
      double r = 5;
      double temp = pi;
      pi = r;
r=temp;

		System.out.printf("hello %.2f\n", 2*pi*r);
		System.out.printf("pi: %.2f\n", pi);
		System.out.printf("r : %.2f\n", r);
	}
}
