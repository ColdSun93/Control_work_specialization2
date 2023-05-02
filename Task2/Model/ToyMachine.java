package Task2.Model;

public class ToyMachine extends Toy{
    protected int countToy;
    protected Double chanceToy;


    public ToyMachine(int idToy, String nameToy, int countToy, Double chanceToy) {
        super(idToy, nameToy);
        this.countToy = countToy;
        this.chanceToy = chanceToy;
        //TODO Auto-generated constructor stub
    }

    public ToyMachine(int idToy, String nameToy) {
        super(idToy, nameToy);
        this.countToy = 1;
        this.chanceToy = 100.0;
        //TODO Auto-generated constructor stub
    }

    public int getCountToy() {
        return countToy;
    }

    public Double getChanceToy() {
        return chanceToy;
    }

    public void setChanceToy(Double chanceToy) {
        this.chanceToy = chanceToy;
    }

    public void setCountToyForPlay(int countToy) {
        this.countToy = countToy-1;
    }
    
}
