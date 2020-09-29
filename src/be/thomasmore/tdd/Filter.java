package be.thomasmore.tdd;

public class Filter {
    public String size;
    public Integer minNrOfPersons;
    public Integer maxNrOfPersons;

    public Filter(String size, Integer minNrOfPersons, Integer maxNrOfPersons) {
        this.size = size;
        this.minNrOfPersons = minNrOfPersons;
        this.maxNrOfPersons = maxNrOfPersons;
    }

    public Integer getMinNrOfPersonsForQuery(){
        return minNrOfPersons;
    }

    public Integer getMaxNrOfPersonsForQuery(){
        return maxNrOfPersons;
    }

    public String getQuery(){
        if (minNrOfPersons != null || maxNrOfPersons != null){
            return "min: " + minNrOfPersons + "\nmax: " + maxNrOfPersons;
        }else {
            switch (size) {
                case "S":
                    minNrOfPersons = 0;
                    maxNrOfPersons = 200;
                    break;
                case "M":
                    minNrOfPersons = 200;
                    maxNrOfPersons = 600;
                    break;
                case "L":
                    minNrOfPersons = 600;
                    maxNrOfPersons = 1500;
                    break;
                case "XL":
                    minNrOfPersons = 1500;
                    maxNrOfPersons = null;
                    break;
                default:
                    return "No valible size.";
            }
            return "min: " + minNrOfPersons + "\nmax: " + maxNrOfPersons;
        }
    }

    public static void main(String[] args) {
        Filter f1 = new Filter("XL", null, null);
        System.out.println(f1.getQuery());
    }
}
