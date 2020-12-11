package tui;


import model.CustomerContainer;

public class TryMe {
	public static void main(String[] args) {
		CustomerContainer customerContainer = CustomerContainer.getInstance();

		personContainer.addPerson(new Person("Anders", "Gundorfslund 1, st. mf.", "9000", "Aalborg", "31334010"));
		personContainer.addPerson(new Person("Michael", "Gundorfslund 1, st. mf.", "9000", "Aalborg", "24267667"));
		personContainer.addPerson(new Person("Gustav", "Søndergade 32", "7441", "Bording", "12890209"));
		personContainer.addPerson(new Person("Lars", "Søndergade 32", "7441", "Bording", "12938102"));
		personContainer.addPerson(new Person("Phillip", "Somewhere 1", "9000", "Aalborg", "53381465"));
		personContainer.addPerson(new Person("Mathias", "Somewhere 2", "9000", "Aalborg", "58973498"));
		personContainer.addPerson(new Person("Nicklas", "Absalonsgade 16 st", "9000", "Aalborg", "20741072"));

		LPContainer lpContainer = LPContainer.getInstance();

		LP lp1 = new LP("The Beatles", "Abbey Road", "974813", "1969-09-26");
		lp1.addCopy(new Copy("01/02/2017", 40, "84290822390"));
		lp1.addCopy(new Copy("23/12/2018", 30, "89023140940"));
		lp1.addCopy(new Copy("03/04/2019", 55, "80693722056"));

		LP lp2 = new LP("Pink Floyd", "Dark Side of the Moon", "6246425", "1973-03-01");
		lp2.addCopy(new Copy("03/08/2011", 25, "98273549234"));
		lp2.addCopy(new Copy("09/05/2019", 34, "78673909330"));

		LP lp3 = new LP("Guardians of the Galaxy", "Guardians of the Galaxy: Awesome Mix Vol. 1", "9573216", "2014-06-29");
		lp3.addCopy(new Copy("03/04/2019", 55, "29387671098"));
		lp3.addCopy(new Copy("03/04/2019", 12, "20394977347"));
		lp3.addCopy(new Copy("03/04/2019", 43, "98778929504"));
		lp3.addCopy(new Copy("03/04/2019", 34, "53894579235"));
		lp3.addCopy(new Copy("03/04/2019", 36, "42908802780"));

		LP lp4 = new LP("Bob Marley & The Wailers", "Legend", "1436785", "1984-04-08");
		lp4.addCopy(new Copy("03/04/2019", 65, "45745645627"));

		LP lp5 = new LP("Amy Winehouse", "Back to Black", "8971098", "2006-09-26");

		LP lp6 = new LP("Michael Jackson", "Thriller", "2387462", "1982-11-30");
		lp6.addCopy(new Copy("03/04/2019", 42, "96897438762"));
		lp6.addCopy(new Copy("03/04/2019", 37, "45807428993"));

		LP lp7 = new LP("The Beatles", "Sgt. Pepper’s Lonely Hearts Club Band", "809132374", "1967-04-26");

		LP lp8 = new LP("Fleetwood Mac", "Rumors", "34678463", "1977-02-04");
		lp8.addCopy(new Copy("03/04/2019", 43, "42990623485"));
		lp8.addCopy(new Copy("03/04/2019", 62, "98232876444"));
		lp8.addCopy(new Copy("03/04/2019", 12, "49823749283"));
		lp8.addCopy(new Copy("03/04/2019", 32, "56789174928"));

		LP lp9 = new LP("Miles Davis", "Kind of Blue", "0365092", "1959-03-02");
		lp9.addCopy(new Copy("03/04/2019", 64, "84572938474"));
		lp9.addCopy(new Copy("03/04/2019", 52, "59871049099"));
		lp9.addCopy(new Copy("03/04/2019", 47, "42789687924"));
		lp9.addCopy(new Copy("03/04/2019", 46, "98723848524"));

		lpContainer.addLP(lp1);
		lpContainer.addLP(lp2);
		lpContainer.addLP(lp3);
		lpContainer.addLP(lp4);
		lpContainer.addLP(lp5);
		lpContainer.addLP(lp6);
		lpContainer.addLP(lp7);
		lpContainer.addLP(lp8);
		lpContainer.addLP(lp9);

		MainMenuUI mainMenuUI = new MainMenuUI();
		mainMenuUI.start();
}
