public class MaquinaDeBanho {
    private int agua;
    private int shampoo;
    private boolean temPet;
    private boolean precisaLimpeza;

    private static final int MAX_AGUA = 30;
    private static final int MAX_SHAMPOO = 10;
    private static final int CONSUMO_BANHO_AGUA = 10;
    private static final int CONSUMO_BANHO_SHAMPOO = 2;
    private static final int CONSUMO_LIMPEZA_AGUA = 3;
    private static final int CONSUMO_LIMPEZA_SHAMPOO = 1;
    private static final int ABASTECIMENTO = 2;

    public MaquinaDeBanho() {
        this.agua = MAX_AGUA;
        this.shampoo = MAX_SHAMPOO;
        this.temPet = false;
        this.precisaLimpeza = false;
    }

    public void colocarPet() {
        if (temPet) {
            System.out.println("Já há um pet na máquina!");
        } else if (precisaLimpeza) {
            System.out.println("A máquina precisa ser limpa antes de colocar outro pet.");
        } else {
            temPet = true;
            System.out.println("Pet colocado na máquina.");
        }
    }

    public void retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet na máquina!");
        } else {
            temPet = false;
            if (precisaLimpeza) {
                System.out.println("Pet retirado da máquina, mas a máquina precisa ser limpa antes de outro uso.");
            } else {
                System.out.println("Pet retirado da máquina após o banho.");
            }
        }
    }

    public void darBanho() {
        if (!temPet) {
            System.out.println("Não há pet na máquina para tomar banho!");
        } else if (agua < CONSUMO_BANHO_AGUA || shampoo < CONSUMO_BANHO_SHAMPOO) {
            System.out.println("Não há água ou shampoo suficiente para dar banho no pet.");
        } else {
            agua -= CONSUMO_BANHO_AGUA;
            shampoo -= CONSUMO_BANHO_SHAMPOO;
            precisaLimpeza = false;
            System.out.println("Banho realizado com sucesso!");
        }
    }

    public void limparMaquina() {
        if (agua < CONSUMO_LIMPEZA_AGUA || shampoo < CONSUMO_LIMPEZA_SHAMPOO) {
            System.out.println("Não há água ou shampoo suficiente para limpar a máquina.");
        } else {
            agua -= CONSUMO_LIMPEZA_AGUA;
            shampoo -= CONSUMO_LIMPEZA_SHAMPOO;
            precisaLimpeza = false;
            System.out.println("Máquina limpa e pronta para outro pet.");
        }
    }

    public void abastecerAgua() {
        if (agua + ABASTECIMENTO > MAX_AGUA) {
            System.out.println("O tanque de água já está cheio!");
        } else {
            agua += ABASTECIMENTO;
            System.out.println("Abastecido com 2 litros de água. Nível atual: " + agua + "L.");
        }
    }

    public void abastecerShampoo() {
        if (shampoo + ABASTECIMENTO > MAX_SHAMPOO) {
            System.out.println("O reservatório de shampoo já está cheio!");
        } else {
            shampoo += ABASTECIMENTO;
            System.out.println("Abastecido com 2 litros de shampoo. Nível atual: " + shampoo + "L.");
        }
    }

    public void verificarAgua() {
        System.out.println("Nível de água: " + agua + "L.");
    }

    public void verificarShampoo() {
        System.out.println("Nível de shampoo: " + shampoo + "L.");
    }

    public void verificarPetNoBanho() {
        if (temPet) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }
}
