import java.util.Scanner;

public class CaixaEletronico {

    Scanner sc = new Scanner(System.in);

    int notas10=20;
    int notas20=10;
    int notas50=10;
    int notas100=5;

    public int total(){
        return this.notas10+this.notas20+this.notas50+this.notas100;
    }

    public void verificar_saldo() {
        System.out.printf("""
                Notas de 10: %d
                Notas de 20: %d
                Notas de 50: %d
                Notas de 100: %d
                """, this.notas10,this.notas20,this.notas50,this.notas100);
    }

    public void realizar_saque(int num) {

        if (num%10!=0){
            return;
        }

        if (num > this.total()){
            return;
        }

        int total=num;

        total -= 100 * (100%total);
        this.notas100 -= 100%total;

        total-= 50 * (50%total);
        this.notas50 -= 50%total;

        total -=20 * (20%total);
        this.notas20-= 20%total;

        total-= 10 * (10%total);
        this.notas10-= 10%total;

        System.out.println("Saque realizado!! ");

    }
}
