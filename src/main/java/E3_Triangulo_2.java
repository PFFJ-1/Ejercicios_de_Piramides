public class E3_Triangulo_2 {
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        for(int i = 0;i<x;i++){
            for (int j = x-1;j>=0;j--) {
                if (j >= i) {
                    IO.print("*");
                } else {
                    IO.print(" ");
                }
            }
            IO.println("");
        }
    }
}
