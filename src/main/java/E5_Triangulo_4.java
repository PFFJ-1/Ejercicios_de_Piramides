public class E5_Triangulo_4 {
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        for(int i = 0;i<x;i++){
            for (int j = 0;j<x;j++) {
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
