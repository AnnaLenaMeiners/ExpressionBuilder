
public class TicketOrderTester {

	public static void main(String[] args) {
		TicketOrder to = new TicketOrder.Builder()
					.buy(1, 1, 1, "Jörg Pilawas Silvestershow")
					.atDate("2020-12-31")
					.atPrice(1000, 750, 250)
					.valueAs(new StandardOrderValuer())
					.build();
		System.out.println("Created Order: " + to.title + " on " + to.date + " for a total of " + to.value
				+ " Euros");
	}
}