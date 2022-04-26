class UndergroundSystem {
    private Map<Integer, CheckInEntry> checkInMap = null;
    private Map<String, double[]> journeyMap = null;

    public UndergroundSystem() {
        this.checkInMap = new HashMap<>();
        this.journeyMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        this.checkInMap.put(id, new CheckInEntry(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        CheckInEntry checkin = this.checkInMap.get(id);
        int timeDiff = t - checkin.getStartTime();
        String key = checkin.getStartStation() + "-" + stationName;
        this.checkInMap.remove(id);
        
        if (this.journeyMap.containsKey(key) == false) {
            this.journeyMap.put(key, new double[2]);
        }
        double[] trip = this.journeyMap.get(key);
        trip[0] += timeDiff;
        trip[1] += 1;
    }
    
    public double getAverageTime(String startStation, String endStation) {
        double[] trip = this.journeyMap.get(startStation + "-" + endStation);
        return trip[0] / trip[1];
    }
}

class CheckInEntry {
    private String startStation = null;
    private int startTime = 0;
    
    public CheckInEntry(String station, int time) {
        this.startStation = station;
        this.startTime = time;
    }
    
    public String getStartStation() {
        return this.startStation;
    }
    
    public int getStartTime() {
        return this.startTime;
    }
}
