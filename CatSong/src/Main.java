public class Main {

    public static void main(String[] args) {
	    int foodNum = 99;
	    String word = "пачек(пачки)";
	    while (foodNum > 2){
				System.out.println(foodNum + " " + word + " " + "корма в холодильнике");
				System.out.println(foodNum + " " + word + " " + "корма");
				System.out.println("возьми одну");
				System.out.println("отдай коту");
				System.out.println(--foodNum + " " + word + " " + "корма в холодильнике");
				System.out.println("============================");

        }
		System.out.println("2 пачки корма в холодильнике\n 2 пачки корма\n возьми одну\n отдай коту\n 1 пачка корма в холодильнике");
		System.out.println("============================");

		System.out.println("1 пачка корма в холодильнике");
		System.out.println("1 пачка корма");
		System.out.println("возьми одну");
		System.out.println("отдай коту");
		System.out.println("0 пачек корма в холодильнике");
		System.out.println("============================");
		System.out.println("иди на работу, нужно кормить кота");
            // 99 пачек корма в холодильнике
            // 99 пачек корма
            // возьми одну
            // отдай коту
            // 98 пачек корма в холодильнике

    }
}
