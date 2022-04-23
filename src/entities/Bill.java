package entities;

public class Bill {
	
	public static double COST_BEER = 5.0;
	public static double COST_SOFTDRINK = 3.0;
	public static double COST_BARBECUE = 7.0;
	
	public static char gender;
	public static int beer;
	public static int barbecue;
	public static int softDrink;
	
	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}

	public double feeding() {
		return beer * COST_BEER + softDrink * COST_SOFTDRINK + barbecue * COST_BARBECUE;
	}
	
	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
		
	public double total() {
		return feeding() + cover() + ticket();
	}
	
	public String toFree() {
		if (cover() == 0.0) {
		return "Isento de Couvert";
			}
		return String.format("Couvert = R$ %.2f", cover());
	}
	
	public String toString() {
		return "\n"
				+ "RELATÓRIO"
				+ "\n"
				+ "Consumo = R$ "
				+ String.format("%.2f", feeding())
				+ "\n"
				+ toFree()
				+ "\n"
				+ "Ingresso = R$ "
				+ String.format("%.2f",ticket())
				+ "\n"
				+ "\n"
				+ "Valor a pagar = R$ "
				+ String.format("%.2f",total());
	}
}
