package POO.dnd;

abstract class Personaje implements Jugable {
    int id, salud, ataque, defensa;
    int contador_id = 0;
    
     public Personaje(int id, int salud, int ataque, int defensa) {
        super();
        this.id = id;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;

     }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getContador_id() {
		return contador_id;
	}

	public void setContador_id(int contador_id) {
		this.contador_id = contador_id;
	}
}
