class Personagem {
    String nome;
    int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public void diminuirEnergia(int valor) {
        energia -= valor;
        if (energia < 0) {
            energia = 0;
        }
    }

    public void morrer() {
        energia = 0;
    }

    public int mostrarEnergia() {
        return energia;
    }
}
