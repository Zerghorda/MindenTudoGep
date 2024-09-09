package modell;

public class Program {

    public static void main(String[] args) {
        MindenTudoGep gep = new MindenTudoGep();
        System.out.println("lottó szelvény:\n" + gep.kerLottoSzelvenyt());
        System.out.println("totó szelvény:\n" + gep.kerTotoSzelveny());
        System.out.println("dal címe:\n" + gep.kerDal());
    }

}
