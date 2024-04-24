package POO.dnd;

public class Paladin extends Personaje {
    private boolean bendecido;

    public Paladin(int id, int ataque, int salud, int defensa, boolean bendecido) {
        super(id, ataque, salud, defensa);
        if (Math.random() % 2 == 0) {
            this.bendecido = true;
        } else {
            this.bendecido = false;
        }
    }
    
    public boolean isBendecido() {
    	return bendecido;
    }

    // metodo donde si bedecido en true los atributos suman 10
    public void setBendecido() {
        if (bendecido) {
            this.ataque += 10;
            this.salud += 10;
            this.defensa += 10;
        }
    }

    public void setBendecido(boolean bendecido) {
    	this.bendecido = bendecido;
    }
    
    public void descansar() {

    }

    public void promocionar() {

    }

    public void atacar() {

    }
}
