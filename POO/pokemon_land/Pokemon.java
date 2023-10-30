package POO.pokemon_land;

public class Pokemon {

    private char tipo;
    private int attack;
    private int health;
    private int defense;

    public Pokemon(char tipo, int attack, int defense, int health) {

        this.tipo = tipo;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = tipo;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack() {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth() {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }
    
    public void setDefense() {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Pokemon [tipo =" + tipo + ", ataque =" + attack + "defensa= " + defense + "vida =" + health + "]";
    }
    
    public void Baya() {
        this.health += 5;
    }

    public void Siesta() {
        this.defense += 4;
    }

    public int Fight(Pokemon pokemon)  {
        int ganador = 0;
        while (this.health > 0 || pokemon.health > 0) {

            //TODO Terminar de hacer el combate pokemon
            //En mi caso la defensa solo bajará el ataque porcentualmente
            
            this.health -= pokemon.attack * (pokemon.defense / 100);
            
        }

        return ganador;
    }
}
