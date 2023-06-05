public class Pilha {

    public Object[] pilha; // Declarando o array
    public int posicaoPilha; // Variável para armazenar a posição atual na pilha

    public Pilha() { // Inicializando a pilha
        this.posicaoPilha = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilha = new Object[10];
// criando uma pilha com 10 posições
    }

    public boolean pilhaVazia() {  // Função para verificar se a pilha está vazia
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
          // aqui indica quantos itens tem dentro da pilha, somando-se 1,
  //pois a pilha inicia no zero. Logo, se tivermos 3 itens na pilha,
  // o atributo posicaoPilha vai exibir 2.
  //Para sabermos quantos itens há, precisamos somar um.
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
            // primeiro verificamos se a pilha esta vazia,
            //se estiver, nada será realizado
        }
        return this.pilha[this.posicaoPilha--];
        // aqui retorna o que tem na última posição da pilha
        //e decrementa o atributo posicaoPilha
    }

    public void empilhar(Object valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            // verifica se a posicaoPilha é menor do que o tamanho da pilha,
            //se for, então é inserido o valor na pilha e ao mesmo tempo é feito
            //o incremento do atributo posicaoPilha
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
 //       p.empilhar(" carne de sol");
     p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
                while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}