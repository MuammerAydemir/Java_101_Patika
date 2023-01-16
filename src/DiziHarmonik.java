public class DiziHarmonik {
	public static void main(String[] args) {
		int[] dizi= {1,2,3,4,5};
		double sum=0;
		for (double i:dizi) {
			sum+=(1/i);
		}
		System.out.println("Harmonik Ortalaması: "+(dizi.length/sum));
	} 

}
