//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class MathExample {
    /*
    public MathExample() {
    }
    */

    public static void main(String[] var0) {
        double var1 = 3.14D;
        int var3 = 1;

        while(true) {
            label74:
            while(var3 != 7) {
                System.out.println("Select one of the following:");
                System.out.println("1) Pyramid");
                System.out.println("2) Sphere");
                System.out.println("3) Cube");
                System.out.println("4) Cylinder");
                System.out.println("5) Factorial");
                System.out.println("6) Prime");
                System.out.println("7) Exit");
                System.out.print("Enter the Number that matches what you choose: ");
                String var4 = System.console().readLine();
                var3 = Integer.valueOf(var4).intValue();
                byte var6 = -1;
                switch(var4.hashCode()) {
                    case 49:
                        if(var4.equals("1")) {
                            var6 = 0;
                        }
                        break;
                    case 50:
                        if(var4.equals("2")) {
                            var6 = 1;
                        }
                        break;
                    case 51:
                        if(var4.equals("3")) {
                            var6 = 2;
                        }
                        break;
                    case 52:
                        if(var4.equals("4")) {
                            var6 = 3;
                        }
                        break;
                    case 53:
                        if(var4.equals("5")) {
                            var6 = 4;
                        }
                        break;
                    case 54:
                        if(var4.equals("6")) {
                            var6 = 5;
                        }
                        break;
                    case 55:
                        if(var4.equals("7")) {
                            var6 = 6;
                        }
                }

                switch(var6) {
                    case 0:
                        System.out.println("You Selected Pyramid");
                        System.out.print("Enter Lenght: ");
                        String var7 = System.console().readLine();
                        float var8 = Float.valueOf(var7).floatValue();
                        System.out.print("Enter Width: ");
                        var7 = System.console().readLine();
                        float var9 = Float.valueOf(var7).floatValue();
                        System.out.print("Enter Height: ");
                        var7 = System.console().readLine();
                        float var10 = Float.valueOf(var7).floatValue();
                        double var11 = Math.sqrt((double)(var9 / 2.0F * (var9 / 2.0F) + var10 * var10));
                        double var13 = Math.sqrt((double)(var8 / 2.0F * (var8 / 2.0F) + var10 * var10));
                        System.out.println(" Lenght = " + var8 + " Width = " + var9 + " Hight = " + var10);
                        System.out.print("Surface Area: ");
                        double var15 = (double)(var8 * var9) + (double)var8 * var11 + (double)var9 * var13;
                        System.out.format("%.2f\n", new Object[]{Double.valueOf(var15)});
                        System.out.print("Volume: ");
                        System.out.format("%.2f\n", new Object[]{Float.valueOf(var8 * var9 * var10 / 3.0F)});
                        break;
                    case 1:
                        System.out.println("You selected Sphere");
                        System.out.print("Enter Radius: ");
                        String var17 = System.console().readLine();
                        float var18 = Float.valueOf(var17).floatValue();
                        System.out.format("Surface Area: %.2f \n", new Object[]{Double.valueOf(4.0D * var1 * (double)var18 * (double)var18)});
                        System.out.format("Voulume: %.2f \n", new Object[]{Double.valueOf(1.0D * var1 * (double)(var18 * var18 * var18))});
                        break;
                    case 2:
                        System.out.println("You selected Cube");
                        System.out.print("Enter Edge: ");
                        String var19 = System.console().readLine();
                        float var20 = Float.valueOf(var19).floatValue();
                        System.out.println("This is a Test if the a = " + var20);
                        System.out.print("Surface Area: ");
                        System.out.println(var20 * var20 * 6.0F);
                        System.out.print("Volume: ");
                        System.out.println(var20 * var20 * var20);
                        break;
                    case 3:
                        System.out.println("You selected Cylinder");
                        System.out.print("Enter Radius: ");
                        String var21 = System.console().readLine();
                        double var22 = Double.valueOf(var21).doubleValue();
                        System.out.print("Enter Height: ");
                        String var24 = System.console().readLine();
                        double var25 = Double.valueOf(var24).doubleValue();
                        System.out.format("Surface Area: %.2f\n", new Object[]{Double.valueOf(2.0D * var1 * var22 * var25 + 2.0D * var1 * var22 * var22)});
                        System.out.format("Volume: %.2f\n", new Object[]{Double.valueOf(var1 * var22 * var22 * var25)});
                        break;
                    case 4:
                        System.out.print("Enter Number: ");
                        String var27 = System.console().readLine();
                        int var28 = Integer.valueOf(var27).intValue();
                        if(var28 <= 0) {
                            System.out.println("Your Number was too small");
                            System.exit(0);
                        }

                        double var29 = 1.0D;

                        for(int var34 = 1; var34 < var28 + 1; ++var34) {
                            var29 *= (double)var34;
                        }

                        System.out.println("Factorial of " + var28 + " is  " + var29);
                        break;
                    case 5:
                        System.out.print("Enter a Number: ");
                        String var31 = System.console().readLine();
                        int var32 = Integer.valueOf(var31).intValue();
                        System.out.println("1, 2, 3 are prime numbers ");
                        int var33 = 4;

                        while(true) {
                            if(var33 >= var32 + 1) {
                                continue label74;
                            }

                            if(isPrime(var33)) {
                                System.out.println(var33 + " is a prime number");
                            }

                            ++var33;
                        }
                    case 6:
                        System.out.println("Bye");
                }
            }

            return;
        }
    }

    private static boolean isPrime(int var0) {
        int var1 = 0;

        for(int var2 = 2; var2 <= var0 / 2; ++var2) {
            var1 = var0 % var2;
            if(var1 == 0) {
                break;
            }
        }

        return var1 != 0;
    }
}
