public class Envelopes {
    private String name;
    private double amount;

    Envelopes(){
    }

    public Envelopes(String name){
        this.name = name;
    }

    public Envelopes(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    public String getEnvelopeName(){
        return name;
    }

    public double getEnvelopeAmount(){
        return amount;
    }

    public void setEnvelopeName(String name){
        this.name = name;
    }

    public void setEnvelopAmount(double amount){
        this.amount = amount;
    }
}
