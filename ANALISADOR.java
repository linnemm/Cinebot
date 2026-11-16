public abstract class ANALISADOR {

    private String frase;
    private String[] tokens;

    public ANALISADOR() {
        frase = "";
        tokens = new String[100];
    }

    public void setFrase(String f) {
        frase = f;
    }

    public String getFrase() {
        return frase;
    }

    public String[] separarTokens() {
        tokens = frase.split(" ");
        return tokens;
    }

    public abstract void analisar();
}