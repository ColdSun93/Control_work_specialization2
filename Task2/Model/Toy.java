package Task2.Model;

public abstract class Toy {
    protected int idToy;
    protected String nameToy;


    protected Toy(int idToy, String nameToy) {
        this.idToy=idToy;
        this.nameToy = nameToy;
        // this.countToy = countToy;
        // this.chanceToy = chanceToy;
        
    }

    public int getId() {
        return idToy;
    }

    public String getName() {
        return nameToy;
    }
}
