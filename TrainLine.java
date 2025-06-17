public class TrainLine {

    private static final String DEFAULT_NAME = "Hogwarts Express";

    /** The name of the train line */
    private String name;
    /** The head station of the train line */
    private Station head;
    /** Current number of stations in the line */
    private int numberOfStations;
    /** Subtracts -1 to avoid "magic numbers" */
    private static final int NOT_FOUND = -1;
    
    /** Basic constructor */
    public TrainLine(String name) {
        this.name = name;
        this.head = null;
        this.numberOfStations = 0;
    } // basic constructor

    /** Default constructor */
    public TrainLine() {
        this(DEFAULT_NAME);
    } // default constructor

    /** Accessor for the number of stations */
    public int getNumberOfStations() {
        return this.numberOfStations;
    }

    /**
     * Adds a new station after the last station of a trainline.
     * 
     * @param name String with name of new station to create and add
     */
    public void add(String name) {
        Station newStation = new Station(name);
        if (this.head == null) {
            // No stations exist in this line. Make this new station
            // the head station of the line
            this.head = newStation;
        } else {
            // The line has at least one station (the head station).
            // Find the last station and make its next station the new one.
            Station cursor = this.head;
            while (cursor.hasNext()) {
                cursor = cursor.getNext();
            }
            // Cursor is now at the last station of the line
            cursor.setNext(newStation);
        }
        this.numberOfStations = this.numberOfStations+1; 
        // or this.numberOfStations++;
        // or this.numberOfStations += 1;
    } // method add

    /**
     * Finds how many stations are in a train line
     * 
     * METHOD MADE OBSOLETE BY INTRODUCTING TrainLine.numberOfStations
     */
    public int stationCounter() {
        int counter = 0;
        if (this.head != null) {
            // Train line not empty
            Station cursor = this.head;
            while (cursor != null) {
                counter = counter + 1;
                cursor = cursor.getNext();
            }
        }
        return counter;
    } // method countStations

    /**
 * Checks the train line to see if it contails a station with the name
 * Returns true if found, false if not found
 */
public boolean contains(String name) { // Method to check existance of station
    boolean found = false; // Use of flag to track if station is found
    Station cursor = this.head; // Starts from the head station

    while (cursor != null && !found) { // Loops to the end or until station found
        if (cursor.getName().equals(name)) { // Uses .equals to compare contents of oject
            found = true; // Station name matches
        }
        cursor = cursor.getNext(); // Moves to the next station
    }

    return found; // Return result T/F
} // method contains

/**
 * Returns the index of the station and the station name.
 * If NOT found returns -1 
 */
    public int indexOf(String name) { // Method to return station index
    int index = 0; // Counter for position/placement
    Station cursor = this.head; // Start at the head

    while (cursor != null) { // Traverses all stations given
        if (cursor.getName().equals(name)) { // Use .equals to compare station names
            break; // Station found - Loop is broken and exixed
        }
        cursor = cursor.getNext(); // Move to next station
        index++; // Adds to index
    }

    if (cursor == null) { // If reached end without finding the station
        index = NOT_FOUND; // Set index to -1 (NOT_FOUND)
    }

    return index; // Return the index or -1 if not found
} // method indexOf


    /**
     * String representation of the object
     */
    private static final String EMPTY_TRAIN_LINE = "The train line is empty";
    private static final String TRAIN_LINE_HEADER = "\"%s\" has the following stations: %s";
    private static final String NEXT_ARROW = " --> ";

    public String toString() {
        if (this.head == null) {
            return EMPTY_TRAIN_LINE;
        } else {
            String stations = String.format(TRAIN_LINE_HEADER, this.name, this.head.getName());
            Station cursor = this.head.getNext();
            while (cursor != null) {
                stations = stations + NEXT_ARROW + cursor.getName();
                cursor = cursor.getNext();
            }
            return stations;
        }
    } // method toString
} // class TrainLine
