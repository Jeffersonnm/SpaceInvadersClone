package SpaceInvadersClone;

public class Jogador extends Personagem {

    int numVidas;
    int velX;

    public Jogador(String imagem, int x, int y, int largura, int altura, int linhas, int colunas) {
        super(imagem, x, y, largura, altura, linhas, colunas);
        init();
    }
    
    private void init() {
        velX = 0;
    }

    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }
    
    @Override
    public Tiro atirar() {
        return (new Tiro("Tiro", this.x + (this.largura/2), this.y, 5 , 16, 1, 1, true));
    }

    @Override
    public void mover() {
        this.x += velX;
    }
    
}