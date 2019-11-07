package creational.builder;

public class MovieTicketBooking {

	private String movie;
	private int noOfTickets;
	private int burger;
	private int pizza;
	private int coke;
	private int popcorn;

	private static class Builder {
		private String movie;
		private int noOfTickets;
		private int burger;
		private int pizza;
		private int coke;
		private int popcorn;

		public Builder(String movie, int noOfTickets) {
			super();
			this.movie = movie;
			this.noOfTickets = noOfTickets;
		}

		public Builder pizza(int x) {
			pizza = x;
			return this;
		}

		public Builder coke(int x) {
			coke = x;
			return this;
		}

		public Builder burger(int x) {
			burger = x;
			return this;
		}

		public Builder popcorn(int x) {
			popcorn = x;
			return this;
		}

		public MovieTicketBooking build() {
			return new MovieTicketBooking(this);
		}

	}

	private MovieTicketBooking(Builder builder) {
		super();
		this.movie = builder.movie;
		this.noOfTickets = builder.noOfTickets;
		this.burger = builder.burger;
		this.pizza = builder.pizza;
		this.coke = builder.coke;
		this.popcorn = builder.popcorn;
	}

	public static void main(String[] args) {

		MovieTicketBooking movieTicketBooking = new MovieTicketBooking.Builder("abc", 5).burger(5).build();
		System.out.println("burger " + movieTicketBooking.burger);
	}
}
