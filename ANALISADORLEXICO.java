public class ANALISADORLEXICO extends ANALISADOR {

    public ANALISADORLEXICO() {
        super();
    }

    @Override
    public void analisar() {

        String[] tokens = separarTokens();

        for (int pos = 0; pos < tokens.length; pos++) {
            System.out.println("Token " + pos + ": " + tokens[pos]);
        }
    }
}