/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.ArrayList;

/**
 *
 * @author osman
 */
public class Unrefactored {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recipes r = new Recipes();
        r.addRecipe();
    }

}

class Recipes {

    void addRecipe() {
        String name_1 = "";
        String[] itype_1 = new String[30];
        String[] un_1 = new String[30];
        Double[] mnt_1 = new Double[30];
        Double[] c_1 = new Double[30];
        String cdescp_1;

        name_1 = "Spaghetti";

        itype_1[0] = "water";
        un_1[0] = "liter";
        mnt_1[0] = 1.5;
        c_1[0] = 0.0;

        itype_1[1] = "oil";
        un_1[1] = "liter";
        mnt_1[1] = 0.2;
        c_1[1] = 120.0;

        itype_1[2] = "salt";
        un_1[2] = "kg";
        mnt_1[2] = 0.01;
        c_1[2] = 0.0;

        itype_1[3] = "pasta";
        un_1[3] = "kg";
        mnt_1[3] = 0.250;
        c_1[3] = 200.0;

        cdescp_1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " + "\n"
                + "Donec efficitur purus at leo bibendum feugiat. " + "\n"
                + "Duis dictum tempus libero, et iaculis augue blandit non. " + "\n"
                + "Duis ac metus imperdiet, lobortis libero vel, tincidunt turpis. " + "\n"
                + "Aenean iaculis risus in sapien imperdiet posuere. " + "\n"
                + "Orci varius natoque penatibus et magnis dis parturient montes, nascetur." + "\n";

        String name_2 = "Menemen";
        String[] itype_2 = new String[30];
        String[] un_2 = new String[30];
        Double[] mnt_2 = new Double[30];
        Double[] c_2 = new Double[30];
        String cdescp_2;

        itype_2[0] = "oil";
        un_2[0] = "kg";
        mnt_2[0] = 0.2;
        c_2[0] = 120.0;

        itype_2[1] = "pepper";
        un_2[1] = "piece";
        mnt_2[1] = 3.0;
        c_2[1] = 0.25;

        itype_2[2] = "tomato";
        un_2[2] = "piece";
        mnt_2[2] = 4.0;
        c_2[2] = 0.40;

        itype_2[3] = "salt";
        un_2[3] = "kg";
        mnt_2[3] = 0.01;
        c_2[3] = 0.0;

        itype_2[4] = "egg";
        un_2[4] = "piece";
        mnt_2[4] = 3.0;
        c_2[4] = 250.0;

        cdescp_2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " + "\n"
                + "Donec efficitur purus at leo bibendum feugiat. " + "\n"
                + "Duis dictum tempus libero, et iaculis augue blandit non. " + "\n"
                + "Duis ac metus imperdiet, lobortis libero vel, tincidunt turpis. " + "\n"
                + "Aenean iaculis risus in sapien imperdiet posuere. " + "\n"
                + "Orci varius natoque penatibus et magnis dis parturient montes, nascetur." + "\n";

        System.out.println(name_1 + "\n");
        double mc = 0.0;
        for (int i = 0; i < itype_1.length; i++) {
            if (itype_1[i] != null) {
                mc += c_1[i];
                System.out.println(itype_1[i] + " " + mnt_1[i] + " " + un_1[i] + " " + c_1[i] + " calory\n");
            }
        }
        System.out.println("Total Calories : " + mc);
        System.out.println("Cooking Description : \n" + cdescp_1 + "\n");

        System.out.println("\n\n" + name_2 + "\n");
        double mc_2 = 0.0;
        for (int i = 0; i < itype_2.length; i++) {
            if (itype_2[i] != null) {
                mc_2 += c_2[i];
                System.out.println(itype_2[i] + " " + mnt_2[i] + " " + un_2[i] + " " + c_2[i] + " calory\n");

            }
        }
        System.out.println("Total Calories : " + mc_2);
        System.out.println("Cooking Description : \n" + cdescp_2 + "\n");
    }

}
