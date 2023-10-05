public class Pessoa {
    // Atributo
    String nome;
    String sobrenome;

    // metodos
    public void falar() {
        System.out.println("falei");
    }

    // Sobrecarga do metodo falar()
    public String falar(String volume) {
        return "falei " + volume;
    }

    // Construtor
    Pessoa() {

    }
        public void comer() {
            System.out.println("Pessoa Comeu ! ! !");
        }

    }
