public class Distance implements Comparable<Distance> {

    private int myFeet, myInches;

    public Distance() {
        myFeet = myInches = 0;
    }

    public Distance(int x, int y) {
        myFeet = x;
        myInches = y;
    }

    public int getFeet() {
        return myFeet;
    }

    public int getInches() {
        return myInches;
    }

    public void setFeet(int x) {
        myFeet = x;
    }

    public void setInches(int x) {
        myInches = x;
    }

    public int compareTo(Distance w) {
        int myTotal = myFeet * 16 + myInches; // access my data directly
        int wTotal = w.getFeet() * 16 + w.getInches(); // use w's get() methods
        return myTotal - wTotal; // return the difference in Inches
    }

    public String toString() {
        return myFeet + " ft. " + myInches + " in.";
    }

    public boolean equals(Distance arg) {
        return compareTo(arg) == 0;
    }
}
