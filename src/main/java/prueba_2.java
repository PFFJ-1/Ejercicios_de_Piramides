public class prueba_2 {
    void main(){
        IO.println("Escribe un número entero:");
        int x = Integer.parseInt(IO.readln());
        for(int i = x-1; i>-1;i--){
            for(int j=(-x+1); j<x; j++) {
                if ((-i <= j) && (i >= j)) {
                    IO.print("x");
                } else {
                    IO.print(" ");
                }
            }
            IO.println("");
        }
    }
}
