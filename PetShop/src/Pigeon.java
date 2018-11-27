
public class Pigeon extends Bird{
		
		private String evilPlot;

		public Pigeon(String petName, int birdWingSpan) {
		super(petName, birdWingSpan);
		}

		public String speak() {
			return "coo!!";
		}

		public String move() {
			return "flutter";
		}
		
		public void setMotive(String motivation){
			evilPlot = motivation;
		}
		
		public String getMotivation() {
			return evilPlot;
		}
	}

