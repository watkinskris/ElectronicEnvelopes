public class EnvelopeManager {
    Envelopes [] myEnvelopes;
    int envelopeCount;

    EnvelopeManager(){
        this.myEnvelopes = new Envelopes[20];
        this.envelopeCount = 0;
    }

    void addEnvelope(Envelopes envelope){
        myEnvelopes[envelopeCount] = envelope;
        envelopeCount++;
    }


}
