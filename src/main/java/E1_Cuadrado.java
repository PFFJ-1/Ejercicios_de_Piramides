public class E1_Cuadrado {
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        for(int i = 0;x>i;i++){
            for (int j = 0;j<x;j++) {
                IO.print("*");
            }
            IO.println();
        }
    }
}
