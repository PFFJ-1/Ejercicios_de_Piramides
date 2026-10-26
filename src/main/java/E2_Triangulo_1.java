public class E2_Triangulo_1 {
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        for(int i = 0;x>i;i++){
            for (int j = 0;i>=j;j++) {
                IO.print("*");
            }
            IO.println();
        }
    }
}
