package v48.skolarbete;

public class läxa_v48 {

	public static void main(String[] args) {
		//System.out.println(volume(7));
		//System.out.println(reverse("hejsan alla "));
		//System.out.println(count("coca cola"));
		System.out.println(sjorovare("hejalla"));

		
	}
	public static double volume(double radius) {
		return (4 * Math.PI * Math.pow(radius, 3) / 3);
		
	}
	public static String reverse(String str) {
		
		String reverse = new StringBuffer(str).reverse().toString();
		
		return reverse;
	}
	public static int count(String str){
        int counter = 0;
        for (int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == 'c')
                counter++;
        }
        return counter;
    }
	public static String sjorovare(String str){
        String text = "";
        char kons[] = "bcdfghjklmnpqrstvwxz".toCharArray();
        for (int i = 0; i < str.length(); i++) 
        {
            String add = "";
            for(int y = 0; y<kons.length; y++) {
                if(str.charAt(i) == kons[y]) {
                    add = "o" + str.charAt(i); break;
                }
            }
            text = text + str.charAt(i) + add; 
        }
        return text;
    }
}
