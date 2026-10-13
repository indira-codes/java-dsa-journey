package ARRAY_EASY;

public class MoveZeroesBruteForce {
    
    public MoveZeroesBruteForce() {
   }

   public static void moveZeroes(int[] var0) {
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (var0[var2] == 0) {
            for(int var3 = var2 + 1; var3 < var1; ++var3) {
               if (var0[var3] != 0) {
                  int var4 = var0[var2];
                  var0[var2] = var0[var3];
                  var0[var3] = var4;
                  break;
               }
            }
         }
      }
}

public static void main(String[] var0) {
      int[] var1 = new int[]{0, 1, 0, 3, 12};
      moveZeroes(var1);

      for(int var5 : var1) {
         System.out.print(var5 + " ");
      }

   }
}
