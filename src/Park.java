public class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        private String attractionName;
        private String openingTime;
        private String closingTime;
        private double cost;

        public Attraction(String attractionName, String openingTime, String closingTime, double cost) {
            this.attractionName = attractionName;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.cost = cost;
        }

        public void displayAttractionInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Opening Time: " + openingTime);
            System.out.println("Closing Time: " + closingTime);
            System.out.println("Cost: " + cost);
        }
    }
}
