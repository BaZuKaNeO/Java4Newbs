//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] var0) {
        String[] var1 = new String[]{"AnishZAwesome", "GuestUser", "Neha_Awesome"};
        String[] var2 = new String[]{"Anish123#", "Guest", "Ghiware"};
        System.out.print("Enter Username:");
        String var3 = System.console().readLine();
        System.out.print("Enter Pasword:");
        char[] var4 = System.console().readPassword();
        String var5 = new String(var4);
        if(var3.length() < 3 || var3.length() > 32) {
            System.out.println("Your Username is too long/small. It should be between 3-32");
            System.exit(1);
        }

        if(var5.length() <= 4 || var5.length() > 32) {
            System.out.println("Your Password is too long/small. It should be between 4-32");
            System.exit(1);
        }

        if((!var3.equals(var1[0]) || !var5.equals(var2[0])) && (!var3.equals(var1[1]) || !var5.equals(var2[1])) && (!var3.equals(var1[2]) || !var5.equals(var2[2]))) {
            System.out.println("Invalid Username or Password");
            System.exit(1);
        } else {
            System.out.println("Welcome " + var3);
            System.out.println("==============================");
            System.out.println("This is  code from 6/18/2016");
        }

        System.out.println("Welcome " + var3);
        System.out.println("==============================");
        System.out.println("This is AnishZAwesome code from 6/18/2016");
        System.out.println("Welcome inside the digital Mind of Anish Pai in Java code");
        System.out.println("Anish Pai Or GBWild");
        System.out.println("I need to record on Saturday, Monday, Wednesday, and Friday (optional)");
        byte var9 = 89;
        double var10 = 9.2345D;
        String var6 = "I am using a Variable";
        System.out.println(var6);
        String var7 = "This is some Text";
        String var8 = "Hello World";
        System.out.println(var7);
        System.out.print(" This is \n" + var8 + "\n A Program Created by Anish Pai\n to learn and test Java by using the program IntelliJ \n");
        System.out.println("Please Subscribe to my youtube channel GonnabeWild007");
        System.out.println("Java is cool");
        System.out.println("\nThis is some formating");
        var8 = "Hello World 1";
        System.out.format("String: %20s, Integer: %2d, float: %.2f\n", new Object[]{var8, Integer.valueOf(var9), Double.valueOf(var10)});
        var8 = "Hello Hello World 2";
        System.out.format("String: %20s, Integer: %2d, float: %.2f\n", new Object[]{var8, Integer.valueOf(var9), Double.valueOf(var10)});
        var8 = "Hello Fellow World 3";
        System.out.format("String: %20s, Integer: %2d, float: %.2f\n", new Object[]{var8, Integer.valueOf(var9), Double.valueOf(var10)});
        char var12 = 169;
        System.out.println(var12);
    }
}
