// The client 'main' tester routine - load your sports database, and produce desired output.
public class SportsMain {
	//private
	//public
	public static void main(String[] args) {
		Sport thisSport = new Sport(3);
		int totalPlayers = 15;
		
		filltheSports(thisSport);
		
		}

	public static void filltheSports(Sport thisSport) {
		
		 Player Eva_Green = new ArcheryPlayer();
		 Player Crystal_Reed = new ArcheryPlayer();
		 Player The_Rock = new ArcheryPlayer();
		 Player Sam_Claflin = new ArcheryPlayer();
		 Player Josh_Duhamel = new ArcheryPlayer();
		 
		 Eva_Green.Player(06, "Eva", false, false, 5, 18);
		 Crystal_Reed.Player(25, "Crystal", false, false, 3, 20);
		 The_Rock.Player(01, "Rock", false, true, 6, 16);
		 Sam_Claflin.Player(46, "Sam", false, false, 8, 15);
		 Josh_Duhamel.Player(37, "Josh", false, true, 2, 17);
		 
		 Player Viv_Richards = new CricketPlayer();
		 Player Brian_Lara = new CricketPlayer();
		 Player Don_Bradman = new CricketPlayer();
		 Player Graham_Gooch = new CricketPlayer();
		 Player Michael_Bevan = new CricketPlayer();
		 Viv_Richards.Player(48, "Viv", true, false, 50, 2.5);
		 Brian_Lara.Player(53, "Brian", true, true, 46, 1.5);
		 Don_Bradman.Player(99, "Don", true, false, 25, 2.);
		 Graham_Gooch.Player(90, "Graham", true, true, 85, 0.5);
		 Michael_Bevan.Player(10, "Michael", true, true, 35, 4);
		 
		 Player Jillian_D_Alessio = new ConoingPlayer();
		 Player Adam_van_koeverden = new ConoingPlayer();
		 Player Carrie_Lightbound = new ConoingPlayer();
		 Player Kamini_Jain = new ConoingPlayer();
		 Player Karen_Furneaux = new ConoingPlayer();

		 Jillian_D_Alessio.Player(12, "Jillian", true, true, 1, 1.5);
		 Adam_van_koeverden.Player(23, "Adam", true, true, 1, 1.5);
		 Carrie_Lightbound.Player(32, "Carrie", true, true, 1, 1.5);
		 Kamini_Jain.Player(64, "Kamini", true, true, 1, 1.5);
		 Karen_Furneaux.Player(128, "Karen", true, true, 1, 1.5);
		 
	}

}
