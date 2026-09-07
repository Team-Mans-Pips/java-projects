public class Polonia {
    private String name;
    private int popolation;
    private int numReg;
    private String capital;

    public Polonia() {
    }

    public Polonia(String name, int popolation, int numReg, String capital) {
        this.name = name;
        this.popolation = popolation;
        this.numReg = numReg;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopolation() {
        return popolation;
    }

    public void setPopolation(int popolation) {
        this.popolation = popolation;
    }

    public int getNumReg() {
        return numReg;
    }

    public void setNumReg(int numReg) {
        this.numReg = numReg;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Polonia{" +
                "name='" + name + '\'' +
                ", popolation='" + popolation + '\'' +
                ", numReg=" + numReg +
                ", capital='" + capital + '\'' +
                '}';
    }
}
