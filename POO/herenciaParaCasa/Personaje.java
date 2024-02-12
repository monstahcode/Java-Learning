package POO.herenciaParaCasa;

public abstract class Personaje {
    private int salud;
    private int ataque;
    private int defensa;

    public Personaje(int salud, int ataque, int defensa) {
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    public int getSalud() {
        return salud;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public int getDefensa() {
        return defensa;
    }
}
