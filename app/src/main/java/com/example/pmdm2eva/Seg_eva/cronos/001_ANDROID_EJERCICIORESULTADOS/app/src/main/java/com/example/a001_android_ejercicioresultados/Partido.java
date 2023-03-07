public class Partido {

    private String eqLocal;
    private String eqVisitante;
    private String golLocal;
    private String golVisitante;

    public Partido() {
    }

    public Partido(String eqLocal, String eqVisitante, String golLocal, String golVisitante) {
        this.eqLocal = eqLocal;
        this.eqVisitante = eqVisitante;
        this.golLocal = golLocal;
        this.golVisitante = golVisitante;
    }

    public String getEqLocal() {
        return eqLocal;
    }

    public void setEqLocal(String eqLocal) {
        this.eqLocal = eqLocal;
    }

    public String getEqVisitante() {
        return eqVisitante;
    }

    public void setEqVisitante(String eqVisitante) {
        this.eqVisitante = eqVisitante;
    }

    public String getGolLocal() {
        return golLocal;
    }

    public void setGolLocal(String golLocal) {
        this.golLocal = golLocal;
    }

    public String getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(String golVisitante) {
        this.golVisitante = golVisitante;
    }

}
