package abstracaoBasica;

public class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado && marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não é possível desligar o carro. Certifique-se de que ele está em ponto morto e com velocidade 0.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível acelerar.");
            return;
        }
        if (marcha == 0) {
            System.out.println("O carro está em ponto morto. Não é possível acelerar.");
            return;
        }

        if (velocidade < 120) {
            velocidade++;
            verificarMarcha();
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima atingida.");
        }
    }

    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível diminuir a velocidade.");
            return;
        }
        if (velocidade > 0) {
            velocidade--;
            verificarMarcha();
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível virar.");
            return;
        }
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a " + direcao + ".");
        } else {
            System.out.println("Não é possível virar. A velocidade deve estar entre 1 km/h e 40 km/h.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado. Não é possível trocar a marcha.");
            return;
        }
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. O carro possui marchas entre 0 e 6.");
            return;
        }
        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não é permitido pular marchas.");
            return;
        }

        if (verificarVelocidadeParaMarcha(novaMarcha)) {
            marcha = novaMarcha;
            System.out.println("Marcha atual: " + marcha);
        } else {
            System.out.println("A velocidade atual não é compatível com a marcha " + novaMarcha + ".");
        }
    }

    private boolean verificarVelocidadeParaMarcha(int marcha) {
        switch (marcha) {
            case 0: return velocidade == 0;
            case 1: return velocidade >= 0 && velocidade <= 20;
            case 2: return velocidade >= 21 && velocidade <= 40;
            case 3: return velocidade >= 41 && velocidade <= 60;
            case 4: return velocidade >= 61 && velocidade <= 80;
            case 5: return velocidade >= 81 && velocidade <= 100;
            case 6: return velocidade >= 101 && velocidade <= 120;
            default: return false;
        }
    }

    private void verificarMarcha() {
        if (velocidade >= 0 && velocidade <= 20) marcha = 1;
        else if (velocidade >= 21 && velocidade <= 40) marcha = 2;
        else if (velocidade >= 41 && velocidade <= 60) marcha = 3;
        else if (velocidade >= 61 && velocidade <= 80) marcha = 4;
        else if (velocidade >= 81 && velocidade <= 100) marcha = 5;
        else if (velocidade >= 101 && velocidade <= 120) marcha = 6;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligar();
        carro.trocarMarcha(1);
        carro.acelerar();
        carro.acelerar();
        carro.virar("esquerda");
        carro.trocarMarcha(2);
        carro.acelerar();
        carro.diminuirVelocidade();
        carro.desligar();
    }
}
