public class Envelopes {
    String name;
    double amount;

    Envelopes(){
    }

    Envelopes(String name){
        this.name = name;
    }

    Envelopes(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    String getEnvelopeName(){
        return name;
    }

    double getEnvelopeAmount(){
        return amount;
    }

    void setEnvelopeName(String name){
        this.name = name;
    }

    void setEnvelopAmount(double amount){
        this.amount = amount;
    }
}
