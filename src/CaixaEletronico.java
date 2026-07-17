import java.util.Scanner;

public class CaixaEletronico {

    Scanner sc = new Scanner(System.in);

    int notas10=20;
    int notas20=10;
    int notas50=10;
    int notas100=5;

    public int total(){
        return (this.notas10*10+this.notas20*20+this.notas50*50+this.notas100*100);
    }

    public void verificar_saldo() {
        System.out.printf("""
                Notas de 10: %d
                Notas de 20: %d
                Notas de 50: %d
                Notas de 100: %d
                Total: %d
                """, this.notas10,this.notas20,this.notas50,this.notas100,this.total());
    }

    public void realizar_saque(int num) {

        if (num%10!=0){
            System.out.println("Não é multipo de 10");
            return;
        }

        if (num > this.total()){
            System.out.println("Não tem saldo suficiente");
            return;
        }

        while (num>=100 && this.notas100>0){
            this.notas100--;
            num -= 100;
        }

        while (num>=50 && this.notas50>0) {
            this.notas50--;
            num -= 50;
        }

        while (num>=20 && this.notas20>0) {
            this.notas20--;
            num -= 20;
        }

        while (num>=10 && this.notas10>0){
        this.notas10--;
        num-= 10;
        }

        System.out.println("Saque realizado!! ");

    }
}
